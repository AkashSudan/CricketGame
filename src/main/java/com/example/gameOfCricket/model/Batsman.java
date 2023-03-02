package com.example.gameOfCricket.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Batsman {
    @Id @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;
    private String name;
    private String teamName;
    private int totalMatchesPlayed;
    private int totalRunsScored;


    public Batsman() {
        totalMatchesPlayed=0;
        totalRunsScored=0;

    }

    public Batsman(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
    }
}
