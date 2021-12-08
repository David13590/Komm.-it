import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayerBase extends Actor
{
    private int playerHealth = 3;
     
    
    public boolean intersects(Actor other)
    {
        return super.intersects(other);
    }
    
    public void takeDamage(int damage)
    {
        playerHealth = playerHealth - damage;
    }
    
    public int getPlayerHealth()
    {
        return playerHealth;
    }
}
