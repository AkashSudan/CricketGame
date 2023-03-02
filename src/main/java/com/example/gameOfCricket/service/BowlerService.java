package com.example.gameOfCricket.service;

import com.example.gameOfCricket.model.Batsman;
import com.example.gameOfCricket.model.Bowler;
import com.example.gameOfCricket.repository.BowlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BowlerService {
    @Autowired
    private BowlerRepository bowlerRepository;
    public List<Bowler> getAll()
    {
        return bowlerRepository.findAll();
    }
    public void addBowler(Bowler bowler)
    {
        bowlerRepository.save(bowler);
    }
    public List<Bowler> getAllBowlerByTeamName(String teamName)
    {
        return bowlerRepository.getAllBowlerByTeamName(teamName);
    }
    public void updateScore(Long id,int score)
    {
        bowlerRepository.updateScore(id,score);
    }
    public void updateTotalMatchesPlayed(Long id)
    {
        bowlerRepository.updateTotalMatchesPlayed(id);
    }
    public void updateWicketsTaken(Long id,int wickets)
    {
        bowlerRepository.updateWicketsTaken(id,wickets);
    }
}
