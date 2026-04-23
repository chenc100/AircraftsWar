package edu.hitsz.rank;

import edu.hitsz.application.Game;

import java.sql.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DAOImpl implements DAO{

    private String url = "jdbc:mysql://localhost:3306/AircraftRank";
    private String user = "root";
    private String password = "cici2006";

    @Override
    public void addGameRecord(int score){
        String sql = "INSERT INTO game_record(score, user_name, play_time) VALUES (?,?,NOW())";

        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = connection.prepareStatement(sql)
        ) {
            ps.setInt(1, score);
            ps.setString(2, "testUserName");
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("数据库插入失败!");
            e.printStackTrace();
        }
    }

    @Override
    public List<GameRecord> getGameRecord(){
        List<GameRecord> gameRecords = new LinkedList<>();
        String sql = "SELECT * FROM game_record";

        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(sql)
        ) {
            while (rs.next()) {
                int score = rs.getInt("score");
                String name = rs.getString("user_name");
                Timestamp time = rs.getTimestamp("play_time");
                gameRecords.add(new GameRecord(score, name, time));
            }
        } catch (SQLException e) {
            throw new RuntimeException("查询失败", e);
        }
        return gameRecords;
    }

    @Override
    public void deleteRecord(String userName){

    }

    public void sortedRecord(){
        List<GameRecord> list = this.getGameRecord();
        list.sort((a, b) -> b.getScore() - a.getScore());
        int i = 1;
        for (GameRecord record: list){
            System.out.println("排名："+i+" 分数：" + record.getScore()+ " 用户名:" + record.getUserName() + " 时间："+ record.getTime());
            i++;
        }
    }
}
