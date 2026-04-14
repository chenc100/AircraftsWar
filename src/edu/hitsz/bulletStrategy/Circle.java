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

        double speed = 3.0;
        double radius = (aircraft instanceof HeroAircraft) ? 45.0 : 110.0;

        for (int i = 0; i < shootNum; i++) {

            double angle = i * (2 * Math.PI / shootNum);
            double cos = Math.cos(angle);
            double sin = Math.sin(angle);

            double bulletX = aircraft.getLocationX() + radius * cos;
            double bulletY = aircraft.getLocationY() - radius * sin;

            double dx = speed * cos;
            double dy = -speed * sin;

            BaseBullet bullet;
            if (aircraft instanceof AbstractEnemy) {
                bullet = new EnemyBullet(
                        (int) bulletX, (int) bulletY,
                        (int) (dx * 5), (int) (dy * 5),
                        power
                );
            } else {
                bullet = new HeroBullet(
                        (int) bulletX, (int) bulletY,
                        (int) (dx * 5), (int) (dy * 5),
                        power
                );
            }

            bullets.add(bullet);
        }
        return bullets;
    }
}
