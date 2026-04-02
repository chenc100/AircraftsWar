package edu.hitsz.tool;

public class PropFactory {

    public AbstractProp createProp(String prop, int locationX, int locationY, int speedX, int speedY){
        switch(prop){
            case "PropBlood":
                return new PropBlood(locationX, locationY, speedX, speedY);
            case "PropBomb" :
                return new PropBomb(locationX, locationY, speedX, speedY);
            case "PropBullet":
                return new PropBullet(locationX, locationY, speedX, speedY);
            case "PropBulletPlus":
                return new PropBulletPlus(locationX, locationY, speedX, speedY);
            case "PropFreeze":
                return new PropFreeze(locationX, locationY, speedX, speedY);
            default:
                throw new IllegalArgumentException("Unknown Prop Type!");
        }
    }
}
