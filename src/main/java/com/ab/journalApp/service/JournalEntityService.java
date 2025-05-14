package com.ab.journalApp.service;

import com.ab.journalApp.entity.JournalEntity;
import com.ab.journalApp.repository.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalEntityService {

    @Autowired
    private JournalEntryRepo journalEntryRepo;

    public void saveEntry(JournalEntity journalEntry){
        journalEntryRepo.save(journalEntry);
    }

    public List<JournalEntity> getAll(){
        return journalEntryRepo.findAll();
    }

    public JournalEntity getJournalEnityById(ObjectId id){
        return journalEntryRepo.findById(id).orElse(null);
    }

    public void deleteJournalEntityById(ObjectId id){
        journalEntryRepo.deleteById(id);
    }


}
