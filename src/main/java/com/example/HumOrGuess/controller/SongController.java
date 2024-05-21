package com.example.HumOrGuess.controller;

import com.example.HumOrGuess.service.SongService;
import com.example.HumOrGuess.service.dto.SongData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public List<SongData> getSongs() {
        return songService.getSongs();
    }
}
