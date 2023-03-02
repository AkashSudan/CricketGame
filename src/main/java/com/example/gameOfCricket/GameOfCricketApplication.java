package com.example.gameOfCricket;

import com.example.gameOfCricket.model.Match;
import com.example.gameOfCricket.model.ScoreCard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class GameOfCricketApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameOfCricketApplication.class, args);
	}
    @GetMapping("/startMatch/{team1Name}/{team2Name}")
    public List<List<Integer>> startMatch(@PathVariable String team1Name, @PathVariable String team2Name)
	{
		Match match =new Match(team1Name,team2Name);
		ScoreCard scoreCard=new ScoreCard();
		match.setId(scoreCard.getId());
		List<List<Integer>> ans=new ArrayList<>();
		ans.add(scoreCard.getScoreOfTeam1());
		ans.add(scoreCard.getScoreOfTeam2());
		return ans;

	}
}
