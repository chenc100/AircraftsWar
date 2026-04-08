package edu.hitsz.factory;

import edu.hitsz.aircraft.AbstractSupEnemy;
import edu.hitsz.tool.*;

public class PropFactory {

    public AbstractProp createProp(int prop, int locationX, int locationY, int speedX, int speedY){
        switch(prop){
            case 0:
                return new PropBlood(locationX, locationY, speedX, speedY);
            case 1 :
                return new PropBomb(locationX, locationY, speedX, speedY);
            case 2 :
                return new PropBullet(locationX, locationY, speedX, speedY);
            case 3 :
                return new PropBulletPlus(locationX, locationY, speedX, speedY);
            case 4 :
                return new PropFreeze(locationX, locationY, speedX, speedY);
            default:
                throw new IllegalArgumentException("Unknown Prop Type!");
        }
    }

}
