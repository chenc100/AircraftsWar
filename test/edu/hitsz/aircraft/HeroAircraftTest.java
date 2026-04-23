package edu.hitsz.aircraft;

import edu.hitsz.bulletStrategy.Angled;
import edu.hitsz.bulletStrategy.BulletStrategy;
import edu.hitsz.bulletStrategy.Circle;
import edu.hitsz.bulletStrategy.Direct;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HeroAircraftTest {

    HeroAircraft heroAircraft;
    @BeforeEach
    void setUp() {
        System.out.println("--Test begin--");
        heroAircraft = HeroAircraft.getInstance(30,70,12,5,250);
    }

    @AfterEach
    void tearDown() {
        System.out.println("--Test done--");
        heroAircraft = null;
    }

    @ParameterizedTest
    @ValueSource(ints = {56,12,87})
    void decreaseHp(int decrease) {
        int before = heroAircraft.getHp();
        heroAircraft.decreaseHp(decrease);
        assertEquals(before - decrease ,heroAircraft.getHp());
    }

    @Test
    void setStrategy() {
        int shootNum = 3;
        BulletStrategy strategy = new Angled(shootNum);
        heroAircraft.setStrategy(strategy);
        assertEquals(strategy, heroAircraft.getBulletStrategy());
    }

    @Test
    void getInstance() {
        HeroAircraft h1 = HeroAircraft.getInstance(0,0,0,0,100);
        HeroAircraft h2 = HeroAircraft.getInstance(10,10,10,10,200);
        assertSame(h1, h2);
    }
}