package edu.hitsz.rank;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GameRecord {
    private Timestamp time;
    private String userName;
    private int score;

    public GameRecord(int score, String userName, Timestamp time){
        this.score = score;
        this.userName = userName;
        this.time = time;
    }

    public int getScore(){
        return score;
    }

    public String getUserName(){
        return userName;
    }

    public Timestamp getTime(){
        return time;
    }

}
