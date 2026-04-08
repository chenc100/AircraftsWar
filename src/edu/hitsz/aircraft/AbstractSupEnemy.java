package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.bulletStrategy.BulletStrategy;
import edu.hitsz.tool.AbstractProp;
import edu.hitsz.factory.PropFactory;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 所有特殊敌机的抽象父类
 * 实现随机掉落道具功能
 */
public abstract class AbstractSupEnemy extends MobEnemy{
    //道具速度
    private int propSpeedY = 10;

    //随机器
    private Random random = new Random();

    //创建道具工厂
    private PropFactory propFactory = new PropFactory();

    //发射策略
    protected BulletStrategy bulletStrategy;

    public AbstractSupEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    public List<BaseBullet> shoot(){
        List<BaseBullet> bullets = bulletStrategy.setShoot(this.locationX, this.locationY, this.speedY);
        return bullets;
    }

    public abstract double getDropProb();
    public abstract int getPropType();

    public AbstractProp dropProp(){
        int x = this.getLocationX();
        int y = this.getLocationY();

        if (Math.random() < getDropProb()){
            return propFactory.createProp(random.nextInt(getPropType()), x, y, 0, propSpeedY);
        }

        return null;
    }

}
