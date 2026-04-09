package edu.hitsz.aircraft;

import edu.hitsz.bulletStrategy.Angled;

public class EliteProEnemy extends AbstractEnemy {

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
