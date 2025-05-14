package com.ab.journalApp.repository;

import com.ab.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface JournalEntryRepo extends MongoRepository<JournalEntry, ObjectId> {
    // This interface will automatically provide CRUD operations for JournalEntity
    // No need to implement any methods here, Spring Data MongoDB will handle it.
}
