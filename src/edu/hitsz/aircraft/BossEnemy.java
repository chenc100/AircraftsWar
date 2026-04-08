package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;

import java.util.List;

public class BossEnemy extends AbstractSupEnemy {

    @Override
    public double getDropProb(){
        return 0;
    }

    @Override
    public int getPropType(){
        return 0;
    }

    public BossEnemy(int locationX, int locationY, int speedX, int speedY, int hp){
        super(locationX, locationY, speedX, speedY, hp);
    }

    @Override
    public List<BaseBullet> shoot(){
        return null;
    }
}
