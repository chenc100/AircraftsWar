package edu.hitsz.rank;

import java.util.List;

public interface DAO {
    void addGameRecord(int score);
    void deleteRecord(String userName);
    List<GameRecord> getGameRecord();

}
