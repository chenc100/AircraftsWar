package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;

import java.util.LinkedList;
import java.util.List;

public class ElitePlusEnemy extends AbstractSupEnemy {

    @Override
    public double getDropProb(){
        return 1.0;
    }

    @Override
    public int getPropType(){
        return 4;
    }

    public ElitePlusEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
        super.shootNum = 2;
        super.power = 12;
    }



}
