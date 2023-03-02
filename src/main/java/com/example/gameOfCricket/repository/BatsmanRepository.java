package com.example.gameOfCricket.repository;

import com.example.gameOfCricket.model.Batsman;
import com.example.gameOfCricket.model.Bowler;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface BatsmanRepository extends JpaRepository<Batsman,Long> {

    @Query(value="SELECT * FROM batsman WHERE team_name=?1",nativeQuery=true)
public List<Batsman> getAllBatsmanByTeamName(String teamName);
//    @Modifying
//
    @Modifying
    @Query(value="UPDATE batsman SET total_runs_scored=total_runs_scored+ ?2 WHERE id = ?1",nativeQuery=true)
    public void updateScore(Long id,int score);
    @Modifying
    @Query(value="UPDATE batsman SET total_matches_played=total_matches_played+ 1 WHERE id = ?1",nativeQuery=true)
    public void updateTotalMatchesPlayed(Long id);

}
