package com.example.HumOrGuess.controller;

import com.example.HumOrGuess.service.SongService;
import com.example.HumOrGuess.service.dto.SongData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public SongData getSongs() {
        return songService.getSong();
    }
}
