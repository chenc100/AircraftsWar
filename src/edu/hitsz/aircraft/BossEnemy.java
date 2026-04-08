package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bulletStrategy.BulletStrategy;
import edu.hitsz.bulletStrategy.Direct;

import java.util.List;

public class BossEnemy extends AbstractSupEnemy {

    private int shootNum = 20;
    @Override
    public double getDropProb(){
        return 1;
    }

    @Override
    public int getPropType(){
        return 5;
    }

    public BossEnemy(int locationX, int locationY, int speedX, int speedY, int hp){
        super(locationX, locationY, speedX, speedY, hp);
        bulletStrategy = new Direct(shootNum);
    }


}
