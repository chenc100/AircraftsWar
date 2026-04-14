package edu.hitsz.aircraft;

import edu.hitsz.bulletStrategy.Direct;

public class ElitePlusEnemy extends AbstractEnemy {
    //
    private int shootNum = 2;
    @Override
    public double getDropProb(){
        return 0.6;
    }

    @Override
    public int getPropType(){
        return 4;
    }

    public ElitePlusEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
        super.dropNum = 1;
        bulletStrategy = new Direct(shootNum);
    }

}
