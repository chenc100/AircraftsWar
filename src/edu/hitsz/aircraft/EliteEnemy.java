package edu.hitsz.aircraft;

/**
 * 精英敌机
 * 可以射击
 * 仅掉落加血，火力，超级火力道具
 */

public class EliteEnemy extends AbstractSupEnemy {

    public EliteEnemy(int locationX, int locationY, int speedX, int speedY, int hp){
        super(locationX, locationY, speedX, speedY, hp);
    }

}
