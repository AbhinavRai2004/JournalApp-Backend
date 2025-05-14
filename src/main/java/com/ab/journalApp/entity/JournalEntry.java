package com.ab.journalApp.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "journal_entries")
public class JournalEntry {
    @Id
    private ObjectId id;
    // The @Id annotation indicates that this field is the primary key in the MongoDB collection.
    // The @Document annotation indicates that this class is a MongoDB document.


    private String title;
    private String content;
    private LocalDateTime date;

    public LocalDateTime getDate() {
        return date;
    }

    public void setData(LocalDateTime date) {
        this.date = date;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}