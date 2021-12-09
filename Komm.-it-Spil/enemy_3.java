import greenfoot.*;

public class enemy_3 extends PlayerBase
{
    int time;
    public void act()
    {
        movement();
        look();
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
    
    BulletBase getBullet()
    {
       return null; 
    }
}