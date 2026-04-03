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
    private int shootNum = 1;

    //子弹威力
    private int power = 30;

    //子弹射击方向 (向上发射：-1，向下发射：1)
    private int direction = 1;
    //随机器
    Random random = new Random();
    //创建道具工厂
    PropFactory propFactory = new PropFactory();

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

    public AbstractProp dropProp(AbstractAircraft enemy){
        int type;
        if (enemy instanceof EliteEnemy){
            type = random.nextInt(3);
        }
        else {
            type = random.nextInt(5);
        }
        switch (type){
            case 0:
                return propFactory.createProp("PropBlood", enemy.getLocationX(), enemy.getLocationY(), 0, 5);
            case 1:
                return propFactory.createProp("PropBullet", enemy.getLocationX(), enemy.getLocationY(), 0, 5);
            case 2:
                return propFactory.createProp("PropBulletPlus", enemy.getLocationX(), enemy.getLocationY(), 0, 5);
            case 3:
                return propFactory.createProp("PropBomb", enemy.getLocationX(), enemy.getLocationY(), 0, 5);
            case 4:
                return propFactory.createProp("PropFreeze", enemy.getLocationX(), enemy.getLocationY(), 0, 5);
            default:
                return null;
        }
    }

}
