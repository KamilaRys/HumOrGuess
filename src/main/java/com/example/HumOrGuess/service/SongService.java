package com.example.HumOrGuess.service;

import com.example.HumOrGuess.repository.SongDAO;
import com.example.HumOrGuess.service.dto.SongData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    private final SongDAO songDAO;

    @Autowired
    public SongService(SongDAO songDAO) {
        this.songDAO = songDAO;
    }

    public List<SongData> getSongs() {
        return songDAO.findAll();
    }
}
