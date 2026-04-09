package edu.hitsz.aircraft;

import edu.hitsz.bulletStrategy.Circle;
import edu.hitsz.bulletStrategy.Direct;

public class BossEnemy extends AbstractEnemy {

    private int shootNum = 10;
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
        bulletStrategy = new Circle(shootNum);
    }

}
