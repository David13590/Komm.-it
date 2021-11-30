import greenfoot.*;

public class enemy_bullet extends Actor
{
    private int bulletdmg = 1;
    
    public void act()
    {
        move(7);
           
        if (isAtEdge())
        {
            getWorld().removeObject(this);
            return;
        }
    }
    
    public int getBulletDmg(){
        if (bulletdmg == 1)
        {
            bulletdmg = 0;
            return 1;
        }
        else
        { 
            return 0;
        }
    }
}