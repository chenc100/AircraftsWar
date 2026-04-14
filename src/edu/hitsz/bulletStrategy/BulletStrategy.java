package edu.hitsz.bulletStrategy;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.bullet.BaseBullet;

import java.util.List;

public interface BulletStrategy {
    int power = 30;

    List<BaseBullet> setShoot(AbstractAircraft aircraft);
}
