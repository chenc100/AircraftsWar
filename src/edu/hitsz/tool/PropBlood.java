package edu.hitsz.tool;

import edu.hitsz.aircraft.HeroAircraft;

public class PropBlood extends AbstractProp{
    //一个加血道具加10点hp
    private static int increaseBlood = 10;

    public PropBlood(int locationX, int locationY, int speedX, int speedY){
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void function(HeroAircraft heroAircraft){
        if (heroAircraft.getHp() + increaseBlood >= 100){
            heroAircraft.decreaseHp(heroAircraft.getHp() - 100);
        }
        else{
            heroAircraft.decreaseHp(-increaseBlood);
        }
    }
}
