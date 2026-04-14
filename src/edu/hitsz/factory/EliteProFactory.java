package edu.hitsz.factory;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.EliteProEnemy;
import edu.hitsz.application.ImageManager;
import edu.hitsz.application.Main;

public class EliteProFactory implements EnemyFactory {
    @Override
    public AbstractAircraft createEnemy(){
        return new EliteProEnemy((int) (Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_ENEMY_IMAGE.getWidth())),
                (int) (Math.random() * Main.WINDOW_HEIGHT * 0.05),
                5,
                8,
                50);
    }
}
