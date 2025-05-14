//package com.ab.journalApp.controller;
//
//import com.ab.journalApp.entity.JournalEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntityController {
//    private Map<String, JournalEntity> journalEntries = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntity> getAll(){
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping
//    public boolean addJournalEntry(@RequestBody JournalEntity journalEntry){
//        journalEntries.put(journalEntry.getId(), journalEntry);
//        return true;
//    }
//
//    @GetMapping("/id/{id}")
//    public JournalEntity getJournalEntryById(@PathVariable String id){
//        return journalEntries.get(id);
//    }
//
//    @PutMapping("/id/{id}")
//    public JournalEntity updateJournalEntry(@PathVariable String id, @RequestBody JournalEntity journalEntry){
//        if(journalEntries.containsKey(id)){
//            journalEntries.put(id, journalEntry);
//            return journalEntry;
//        }
//        return null;
//    }
//}
