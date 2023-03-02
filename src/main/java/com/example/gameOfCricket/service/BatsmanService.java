package com.example.gameOfCricket.service;

import com.example.gameOfCricket.model.Batsman;
import com.example.gameOfCricket.repository.BatsmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BatsmanService {
    @Autowired
    BatsmanRepository batsmanRepository;
    public List<Batsman> getAll()
    {
        return batsmanRepository.findAll();
    }
    public List<Batsman> getAllBatsmanByTeamName(String teamName)
    {
        return batsmanRepository.getAllBatsmanByTeamName(teamName);
    }
    public void updateScoreOfBatsman(Long id,int score)
    {
        batsmanRepository.updateScore(id,score);
    }
    public void updateTotalMatchesPlayed(Long id)
    {
        batsmanRepository.updateTotalMatchesPlayed(id);
    }
    public void addBatsman(Batsman batsman)
    {
        batsmanRepository.save(batsman);
    }
}
