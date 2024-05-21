package com.example.HumOrGuess.service.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity(name = "song")
public class SongData {

    @Id
    @GeneratedValue
    private final UUID id;
    private String title;
    private String performer;
    private String category;

    protected SongData() {
        id = UUID.randomUUID();
        title = "";
        performer = "";
        category = null;
    }
    public SongData(String title, String performer, String category) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.performer = performer;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getPerformer() {
        return performer;
    }

    public String getCategory() {
        return category;
    }

    public UUID getId() {
        return id;
    }
}
