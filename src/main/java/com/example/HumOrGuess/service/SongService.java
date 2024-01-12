package com.example.HumOrGuess.service;

import com.example.HumOrGuess.service.dto.SongData;
import org.springframework.stereotype.Service;

@Service
public class SongService {

    public SongData getSong() {
        return new SongData("Dzisiaj w Betlejem", null, "Kolęda");
    }
}
