import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class World1 extends World
{
    private int addenemy_1 = 0;
    private int addenemy_2 = 0;
    private int addenemy_3 = 0;
    
    public void act(){
        //List of enemy_bullets
        List<enemy_bullet> myEnemy_BulletList = getObjects(enemy_bullet.class);
        for(enemy_bullet thisEnemyBullet : myEnemy_BulletList){
            System.out.print("*");
        }
        
        //List of Players
        List<Player> myPlayerList = getObjects(Player.class);
        for(Player thisPlayer : myPlayerList){
            System.out.print("P");
        }
        
        for(Player thisPlayer : myPlayerList){
            for(enemy_bullet thisEnemyBullet : myEnemy_BulletList){
                // thisplayer, thisenemybullet
                if(thisPlayer.intersects(thisEnemyBullet)){
                    thisPlayer.takeDamage(thisEnemyBullet.getBulletDmg());
                    System.out.print(thisPlayer.getPlayerHealth());
                }
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
        while (addenemy_2 < 0)
        {
            addObject(new enemy_2(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addenemy_2++;
        }
        while (addenemy_3 < 1)
        {
            addObject(new enemy_3(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addenemy_3++;
        }
    }
}