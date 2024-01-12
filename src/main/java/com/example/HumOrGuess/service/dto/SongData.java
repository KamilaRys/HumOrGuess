package com.example.HumOrGuess.service.dto;

import java.util.UUID;

public class SongData {

    private final UUID id;
    private String title;
    private String performer;
    private String category;

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
