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
        return bulletdmg;
    }
}