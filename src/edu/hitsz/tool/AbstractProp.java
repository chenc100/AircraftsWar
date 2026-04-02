package edu.hitsz.tool;

import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.basic.AbstractFlyingObject;

public abstract class AbstractProp extends AbstractFlyingObject {

    public AbstractProp(int locationX, int locationY,int speedX, int speedY)
    {
        super(locationX, locationY, speedX, speedY);
    }

    public abstract void function(HeroAircraft heroAircraft);
}
