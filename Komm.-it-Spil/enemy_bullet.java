import greenfoot.*;

public class enemy_bullet extends Actor
{
    private int bulletdmg = 1;
    private int hit = 0;
    
    public void act()
    {
        move(7);
        checkCollision();
           
        if (isAtEdge())
        {
            getWorld().removeObject(this);
            return;
        }
    }
    
    public void checkCollision()
    {
        Actor Player = getOneIntersectingObject(Player.class);
          
        
        if (Player != null){   
            if (hit == 0){
                hit = 1;
            }
        }
        if (Player == null && hit == 1){
            World world;  
            world = getWorld();  
            world.removeObject(this);
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