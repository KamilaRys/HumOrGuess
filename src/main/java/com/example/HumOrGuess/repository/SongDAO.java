package com.example.HumOrGuess.repository;

import com.example.HumOrGuess.service.dto.SongData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SongDAO extends JpaRepository<SongData, UUID> {
}
