import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends PlayerBase
{
    //vars
    private boolean readEnter = true;
    private Cooldown myCooldown;
    
   
    
    public Player()
    {
        myCooldown = new Cooldown();
    }
    
    public void act()
    {   
        int angle = getRotation();
        int x = getX();
        int y = getY();
        
        
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(x-3, y);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(x+3, y);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(x, y-3);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(x, y+3);
        }
        
        if (Greenfoot.isKeyDown ("d") && Greenfoot.isKeyDown("w"))  
        {
            setLocation(x+2, y-2);
        }
        if (Greenfoot.isKeyDown ("a") && Greenfoot.isKeyDown("w"))  
        {
            setLocation(x-2, y-2);
        }
        if (Greenfoot.isKeyDown ("d") && Greenfoot.isKeyDown("s"))  
        {
            setLocation(x+2, y+2);
        }
        if (Greenfoot.isKeyDown ("a") && Greenfoot.isKeyDown("s"))  
        {
            setLocation(x-2, y+2);
        }
        
        if (Greenfoot.isKeyDown("space"))
        {
            if(myCooldown.Cooldown()) //Cooldown bliver taget i brug
            {
                bullet(); //"bullet" bliver sat igang 
            }
        }
        
        setRotation(angle);
        if(Greenfoot.mouseMoved(null))
        {
             MouseInfo mouse = Greenfoot.getMouseInfo();
             turnTowards(mouse.getX(),mouse.getY());
        }
    }
    
    BulletBase getBullet()
    {
       return new bullet(20); 
    }
}