package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.HeroBullet;
import edu.hitsz.bulletStrategy.BulletStrategy;
import edu.hitsz.bulletStrategy.Direct;

import java.util.LinkedList;
import java.util.List;

/**
 * 英雄飞机，游戏玩家操控
 * @author hitsz
 */
public class HeroAircraft extends AbstractAircraft {

    //每次射击发射子弹数量
    private int shootNum = 1;

    //子弹发射方法
    private BulletStrategy bulletStrategy;

    //懒汉式单例类
    private static HeroAircraft instance = null;

    public void setStrategy(BulletStrategy strategy){
        bulletStrategy = strategy;
    }

    private HeroAircraft(int locationX, int locationY, int speedX, int speedY, int hp){
        super(locationX, locationY, speedX, speedY, hp);
        bulletStrategy = new Direct(shootNum);
    }

    public static synchronized HeroAircraft getInstance(int locationX, int locationY, int speedX, int speedY, int hp){
        if (instance == null){
            instance = new HeroAircraft(locationX, locationY, speedX, speedY, hp);
        }
        return instance;
    }

    @Override
    public void forward() {
        // 英雄机由鼠标控制，不通过forward函数移动
    }

    @Override
    /**
     * 通过射击产生子弹
     * @return 射击出的子弹List
     */
    public List<BaseBullet> shoot(){
        List<BaseBullet> bullets = bulletStrategy.setShoot(this);
        return bullets;
    }
}
