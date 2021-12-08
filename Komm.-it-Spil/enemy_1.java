import greenfoot.*;

public class enemy_1 extends PlayerBase
{
    int cooldownTime;
    
    public void act()
    {
        shoot();
        look();
        movement();
    }
    
    public void movement()
    {
        move(1);
    }
   
    public void look()
    {
        if (getWorld().getObjects(Player.class).size() != 0)
        {
            Actor M = (Actor)getWorld().getObjects(Player.class).get(0);
            turnTowards(M.getX(), M.getY());
        }
        else
        {
            turn(5);
        }
    }
    
    public void shoot()
    {
        cooldownTime++;
        
        Actor bullet;
        Actor enemy_1;
        
        bullet = getOneObjectAtOffset(0, 0, bullet.class);
        enemy_1 = getOneObjectAtOffset(0, 0, enemy_1.class);
        if (cooldownTime >= 150)
        {
            bullet();
            cooldownTime = 0;
        }
    }
    
    BulletBase getBullet()
    {
       return new enemy_bullet(7); 
    }
}