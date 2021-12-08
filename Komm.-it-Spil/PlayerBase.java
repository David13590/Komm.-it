import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

abstract class PlayerBase extends Actor
{
    private int playerHealth = 3;
    abstract BulletBase getBullet();
    
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
    
    public void bullet()
    {
        BulletBase bullet = getBullet();
        getWorld().addObject(bullet, getX(), getY());  //indsætter  ved cordinaterne
        bullet.setRotation(getRotation());             //sætter rotation 
        bullet.move(80);
    }
}
