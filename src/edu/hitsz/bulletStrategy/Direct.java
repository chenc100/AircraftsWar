package edu.hitsz.bulletStrategy;

import edu.hitsz.aircraft.AbstractSupEnemy;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;

import java.util.LinkedList;
import java.util.List;

public class Direct implements BulletStrategy{
    private int direction = -1;
    private int shootNum ;

    public Direct(int shootNum){
        this.shootNum = shootNum;
    }

    @Override
    public List<BaseBullet> setBulletShoot(AbstractSupEnemy enemy){
        List<BaseBullet> res = new LinkedList<>();
        int x = enemy.getLocationX() ;
        int y = enemy.getLocationY() + direction*2;
        int speedX = 0;
        int speedY = enemy.getSpeedY() + direction*5;
        BaseBullet bullet;
        for(int i=0; i<shootNum; i++){
            // 子弹发射位置相对飞机位置向前偏移
            // 多个子弹横向分散
            bullet = new EnemyBullet(x + (i*2 - shootNum + 1)*10, y, speedX, speedY, power);
            res.add(bullet);
        }
        return res;
    }
}
