package edu.hitsz.tool;

import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.bulletStrategy.Angled;

public class PropBullet extends AbstractProp{

    private int shootNum = 3;

    public PropBullet(int locationX, int locationY, int speedX, int speedY){
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void function(HeroAircraft heroAircraft){
        heroAircraft.setStrategy(new Angled(shootNum));
    }
}
