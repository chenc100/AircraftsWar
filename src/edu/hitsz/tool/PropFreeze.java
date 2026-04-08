package edu.hitsz.tool;

import edu.hitsz.aircraft.HeroAircraft;

public class PropFreeze extends AbstractProp{

    public PropFreeze(int loactionX, int loacationY, int speedX, int speedY){
        super(loactionX, loacationY, speedX, speedY);
    }

    @Override
    public void function(HeroAircraft heroAircraft){
        System.out.println("Freeze Active!");
    }
}
