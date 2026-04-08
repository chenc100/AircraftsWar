package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.bulletStrategy.Angled;
import edu.hitsz.bulletStrategy.BulletStrategy;
import edu.hitsz.bulletStrategy.Direct;

import java.util.LinkedList;
import java.util.List;

public class EliteProEnemy extends AbstractSupEnemy {

    private int shootNum = 3;

    @Override
    public double getDropProb(){
        return 1.0;
    }

    @Override
    public int getPropType(){
        return 5;
    }

    public EliteProEnemy(int locationX, int locationY, int speedX, int speedY, int hp){
        super(locationX, locationY, speedX, speedY, hp);
        bulletStrategy = new Angled(shootNum);
    }

}
