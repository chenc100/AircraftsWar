package edu.hitsz.tool;

import edu.hitsz.aircraft.HeroAircraft;

public class PropBomb extends AbstractProp{

    public PropBomb(int locationX, int locationY, int speedX, int speedY){
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void function(HeroAircraft heroAircraft){
        System.out.println("Bomb valid!");
    }
}
