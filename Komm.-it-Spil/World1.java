import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class World1 extends World
{
    private int addenemy_1 = 0;
    private int addenemy_2 = 0;
    private int addenemy_3 = 0;
    
    public void act(){
        // Check player hit by bullet
        for(PlayerBase thisPlayer : getObjects(PlayerBase.class)){
            for(BulletBase thisBullet : getObjects(BulletBase.class)){
                // thisPlayer, thisBullet
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
        System.out.println();
        
        
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