package edu.hitsz.bulletStrategy;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.AbstractEnemy;
import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.bullet.HeroBullet;

import java.util.Base64;
import java.util.LinkedList;
import java.util.List;

public class Circle implements BulletStrategy{
    private int shootNum;

    public Circle(int shootNum){
        this.shootNum = shootNum;
    }

    @Override
    public List<BaseBullet> setShoot(AbstractAircraft aircraft) {
        List<BaseBullet> bullets = new LinkedList<>();

        int speed = 3;
        int radius;

        if (aircraft instanceof HeroAircraft) {
            radius = 45;
        } else {
            radius = 110;
        }

        for (int i = 0; i < shootNum; i++) {

            double angle = i * (360.0 / shootNum);
            double rad = Math.toRadians(angle);

            int bulletX = aircraft.getLocationX() + (int) (radius * Math.cos(rad));
            int bulletY = aircraft.getLocationY() - (int) (radius * Math.sin(rad));

            int dx = (int) (speed * Math.cos(rad));
            int dy = -(int) (speed * Math.sin(rad));

            BaseBullet bullet;
            if (aircraft instanceof AbstractEnemy) {
                bullet = new EnemyBullet(bulletX, bulletY, dx, dy, power);
            } else {
                bullet = new HeroBullet(bulletX, bulletY, dx, dy, power);
            }

            bullets.add(bullet);
        }
        return bullets;
    }
}
