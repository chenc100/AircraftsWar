package edu.hitsz.aircraft;

import edu.hitsz.bulletStrategy.Direct;

public class ElitePlusEnemy extends AbstractEnemy {
    //
    private int shootNum = 2;
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
        bulletStrategy = new Direct(shootNum);
    }

}
