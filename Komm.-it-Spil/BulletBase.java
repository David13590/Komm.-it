import greenfoot.*;

public class BulletBase extends Actor
{
    private int bulletDmg = 1;
    private int speed = 0;
    
    BulletBase(int speed){
        this.speed = speed;
    }
    
    public void act()
    {
        move(speed);

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
