package com.springboot.excelsheet.excel.model;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player{


    @Id
    String playerName;
    String playerCountry;

    public Player() {
    }

    public Player(String playerName, String playerCountry) {
        this.playerName = playerName;
        this.playerCountry = playerCountry;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerCountry() {
        return playerCountry;
    }

    public void setPlayerCountry(String playerCountry) {
        this.playerCountry = playerCountry;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerCountry='" + playerCountry + '\'' +
                '}';
    }

}
