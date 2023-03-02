package com.example.gameOfCricket.controller;

import com.example.gameOfCricket.model.Batsman;
import com.example.gameOfCricket.service.BatsmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/batsman")
public class BatsmanController {
    @Autowired
    BatsmanService batsmanService;
    @GetMapping("/getAll")
    public List<Batsman> getAll()
    {
        return batsmanService.getAll();
    }
    @GetMapping("/getAll/{teamName}")
    public List<Batsman> getAllBatsmanByTeamName(@PathVariable String teamName)
    {
        return batsmanService.getAllBatsmanByTeamName(teamName);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addBatsman(@RequestBody Batsman batsman)
    {

        batsmanService.addBatsman(batsman);
        return new ResponseEntity<>("added successfully", HttpStatus.OK);
    }
    @GetMapping("/updateScore/{id}/{score}")
    public void updateScoreOfBatsman(@PathVariable Long id,@PathVariable int score)
    {
      batsmanService.updateScoreOfBatsman(id,score);
    }


}
