package com.ab.journalApp.service;

import com.ab.journalApp.entity.JournalEntry;
import com.ab.journalApp.repository.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryService {

    @Autowired
    private JournalEntryRepo journalEntryRepo;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepo.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepo.findAll();
    }

    public JournalEntry getJournalEntryById(ObjectId id){
        return journalEntryRepo.findById(id).orElse(null);
    }

    public void deleteJournalEntityById(ObjectId id){
        journalEntryRepo.deleteById(id);
    }


}
