package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.tool.AbstractProp;
import edu.hitsz.factory.PropFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 所有特殊敌机的抽象父类
 * 实现随机掉落道具功能
 */
public abstract class AbstractSupEnemy extends MobEnemy{

    //每次射击发射子弹数量
    protected int shootNum = 1;

    //子弹威力
    protected int power = 30;

    //子弹射击方向 (向上发射：-1，向下发射：1)
    private int direction = 1;

    private Random random = new Random();
    //创建道具工厂
    private PropFactory propFactory = new PropFactory();

    public AbstractSupEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    public List<BaseBullet> shoot(){
        List<BaseBullet> res = new LinkedList<>();
        int x = this.locationX ;
        int y = this.locationY + direction*2;
        int speedX = 0;
        int speedY = this.getSpeedY() + direction*5;
        BaseBullet bullet;
        for(int i=0; i<shootNum; i++){
            // 子弹发射位置相对飞机位置向前偏移
            // 多个子弹横向分散
            bullet = new EnemyBullet(x + (i*2 - shootNum + 1)*10, y, speedX, speedY, power);
            res.add(bullet);
        }
        return res;
    }

    public abstract double getDropProb();
    public abstract int getPropType();

    public AbstractProp dropProp(){
        int x = this.getLocationX();
        int y = this.getLocationY();

        if (Math.random() < getDropProb()){
            return propFactory.createProp(random.nextInt(getPropType()), x, y, 0, 10);
        }

        return null;
    }

}
