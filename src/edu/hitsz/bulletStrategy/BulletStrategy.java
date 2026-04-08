package edu.hitsz.bulletStrategy;

import edu.hitsz.aircraft.AbstractSupEnemy;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;

import java.util.List;

public interface BulletStrategy {
    int power = 10;
    List<BaseBullet> setBulletShoot(AbstractSupEnemy enemy);
}
