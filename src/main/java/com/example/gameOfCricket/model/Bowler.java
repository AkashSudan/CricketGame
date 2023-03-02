package com.example.gameOfCricket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Bowler extends Batsman{
    @Column
    int wicketsTaken;

    public Bowler() {
        this.wicketsTaken = 0;
    }
}
