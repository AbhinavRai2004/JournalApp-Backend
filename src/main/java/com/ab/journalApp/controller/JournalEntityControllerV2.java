package com.ab.journalApp.controller;

import com.ab.journalApp.entity.JournalEntity;
import com.ab.journalApp.service.JournalEntityService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntityControllerV2 {

    @Autowired
    private JournalEntityService journalEntityService;

    @GetMapping
    public List<JournalEntity> getAll(){
        return journalEntityService.getAll();
    }

    @PostMapping
    public JournalEntity addJournalEntry(@RequestBody JournalEntity journalEntry){
        journalEntry.setData(LocalDateTime.now());
        journalEntityService.saveEntry(journalEntry);
        return journalEntry;
    }

    @GetMapping("/id/{id}")
    public JournalEntity getJournalEntryById(@PathVariable ObjectId id){
        return journalEntityService.getJournalEnityById(id);
    }

    @PutMapping("/id/{id}")
    public JournalEntity updateJournalEntry(@PathVariable ObjectId id, @RequestBody JournalEntity journalEntry){
        JournalEntity old = journalEntityService.getJournalEnityById(id);
        if(old != null){
            old.setTitle(journalEntry.getTitle() != null && !journalEntry.getTitle().equals("") ? journalEntry.getTitle() : old.getTitle());
            old.setContent(journalEntry.getContent() != null && !journalEntry.getContent().equals("") ? journalEntry.getContent() : old.getContent());
        }

        journalEntityService.saveEntry(old);
        return old;
    }

    @DeleteMapping("/id/{id}")
    public void deleteJournalEntry(@PathVariable ObjectId id){
        journalEntityService.deleteJournalEntityById(id);
    }
}
