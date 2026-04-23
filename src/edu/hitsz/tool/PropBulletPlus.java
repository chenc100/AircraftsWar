package edu.hitsz.tool;

import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.bulletStrategy.Circle;

public class PropBulletPlus extends AbstractProp{

    private int shootNum = 20;

    public PropBulletPlus(int locationX, int locationY, int speedX, int speedY){
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void function(HeroAircraft heroAircraft){
        heroAircraft.setStrategy(new Circle(shootNum));
    }
}
