package edu.hitsz.bulletStrategy;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.AbstractEnemy;
import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.bullet.HeroBullet;

import java.util.LinkedList;
import java.util.List;

public class Direct implements BulletStrategy{
    private int shootNum ;

    public Direct(int shootNum){
        this.shootNum = shootNum;
    }

    @Override
    public List<BaseBullet> setShoot(AbstractAircraft aircraft){
        //设置方向
        int direction = 1;
        if (aircraft instanceof HeroAircraft){
            direction = -1;
        }

        List<BaseBullet> res = new LinkedList<>();
        int x = aircraft.getLocationX() ;
        int y = aircraft.getLocationY() + direction*2;
        int speedX = 0;
        int speedY = aircraft.getSpeedY() + direction*5;
        BaseBullet bullet;
        for(int i=0; i<shootNum; i++){
            // 子弹发射位置相对飞机位置向前偏移
            // 多个子弹横向分散
            if(aircraft instanceof HeroAircraft){
                bullet = new HeroBullet(x + (i*2 - shootNum + 1)*10, y, speedX, speedY, power);
            }else {
                bullet = new EnemyBullet(x + (i*2 - shootNum + 1)*10, y, speedX, speedY, power);
            }
            res.add(bullet);
        }
        return res;
    }
}
