import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class World1 extends World
{
    private int addenemy_1 = 0;
    private int addenemy_2 = 0;
    private int addenemy_3 = 0;
    
    public void act(){
        // Check player hit by bullet
        for(Player thisPlayer : getObjects(Player.class)){
            for(enemy_bullet thisEnemyBullet : getObjects(enemy_bullet.class)){
                // thisplayer, thisenemybullet
                if(thisPlayer.intersects(thisEnemyBullet)){
                    thisPlayer.takeDamage(thisEnemyBullet.getBulletDmg());
                    System.out.print(thisPlayer.getPlayerHealth());
                    this.removeObject(thisEnemyBullet);
                }
            }
            //Check if player is dead
            if(thisPlayer.getPlayerHealth() < 1)
            { 
                this.removeObject(thisPlayer);
            }
        }
        System.out.println();
        
        // Check enemy hit by bullet
        for(enemy_1 thisPlayer : getObjects(enemy_1.class)){
            for(bullet thisBullet : getObjects(bullet.class)){
                // thisEnemy, thisBullet
                if(thisPlayer.intersects(thisBullet)){
                    thisPlayer.takeDamage(thisBullet.getBulletDmg());
                    System.out.print(thisPlayer.getPlayerHealth());
                    this.removeObject(thisBullet);
                }
            }
            //Check if player is dead
            if(thisPlayer.getPlayerHealth() < 1)
            { 
                this.removeObject(thisPlayer);
            }
        }
    }
    public World1(){    
        super(800, 800, 1);
        spawn();
    }
    public void spawn(){
        addObject(new Player(),150,150);
        System.out.println("spawn");
        while (addenemy_1 < 1)
        {
            addObject(new enemy_1(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addenemy_1++;
        }
        
        while (addenemy_3 < 1)
        {
            addObject(new enemy_3(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addenemy_3++;
        }
    }
}