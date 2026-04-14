package edu.hitsz.aircraft;

import edu.hitsz.bulletStrategy.Direct;

/**
 * 精英敌机
 * 可以射击
 * 仅掉落加血，火力，超级火力道具
 */

public class EliteEnemy extends AbstractEnemy {

    private int shootNum = 1;

    @Override
    public double getDropProb(){
        return 0.6;
    }

    @Override
    public int getPropType(){
        return 3;
    }

    public EliteEnemy(int locationX, int locationY, int speedX, int speedY, int hp){
        super(locationX, locationY, speedX, speedY, hp);
        super.dropNum = 1;
        bulletStrategy = new Direct(shootNum);
    }

}
