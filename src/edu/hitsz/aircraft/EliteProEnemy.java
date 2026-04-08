package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;

import java.util.LinkedList;
import java.util.List;

public class EliteProEnemy extends AbstractSupEnemy {

    private int bulletSpeedX = 2;
    @Override
    public double getDropProb(){
        return 1.0;
    }

    @Override
    public int getPropType(){
        return 5;
    }

    public EliteProEnemy(int locationX, int locationY, int speedX, int speedY, int hp){
        super(locationX, locationY, speedX, speedY, hp);
        super.shootNum = 3;
        super.power = 12;
    }

    @Override
    public List<BaseBullet> shoot(){
        List<BaseBullet> bullets = new LinkedList<>();
        int x = this.getLocationX();
        int y = this.getLocationY();

        int speedX = 0;
        int speedY = this.getSpeedY() + 5;

        BaseBullet bullet;
        for(int i =0; i<shootNum; i++){
            bullet = new EnemyBullet(x + (i*2 - shootNum + 1)*10, y, speedX + (i*2 - shootNum + 1), speedY, power);
            bullets.add(bullet);
        }

        return bullets;

    }

}
