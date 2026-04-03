package edu.hitsz.factory;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.AbstractSupEnemy;

public interface EnemyFactory {
    AbstractAircraft createEnemy();
}
