package edu.hitsz.bulletStrategy;

import edu.hitsz.aircraft.AbstractSupEnemy;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;

import java.util.LinkedList;
import java.util.List;

public class Angled implements BulletStrategy{
    private int direction = 1;
    private int shootNum;

    public Angled(int shootNum){
        this.shootNum = shootNum;
    }

    @Override
    public List<BaseBullet> setShoot(int locationX, int locationY, int aircraftSpeedY){
        List<BaseBullet> res = new LinkedList<>();
        int x = locationX ;
        int y = locationY + direction*2;
        int speedX = 0;
        int speedY = aircraftSpeedY + direction*5;
        BaseBullet bullet;
        for(int i=0; i<shootNum; i++){
            // 子弹发射位置相对飞机位置向前偏移
            // 多个子弹横向分散
            bullet = new EnemyBullet(x + (i*2 - shootNum + 1)*10, y, speedX+ (i*2 - shootNum + 1), speedY, power);
            res.add(bullet);
        }
        return res;
    }

}
