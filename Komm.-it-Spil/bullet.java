import greenfoot.*;

public class bullet extends Actor
{
    private int bulletDmg = 1;
    
    public void act()
    {
        move(20);

        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }

    }
    
    public int getBulletDmg()
    {
        return bulletDmg;
    }
}