package com.example.gameOfCricket.service;

import com.example.gameOfCricket.model.Batsman;
import com.example.gameOfCricket.repository.BatsmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Batsman getBatsmanById(Long id)
    {
        Optional<Batsman> batsman=batsmanRepository.findById(id);
        if(batsman.isPresent())
        return batsman.get();
        return new Batsman("virat","India");
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
