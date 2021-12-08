import greenfoot.*;

public class enemy_1 extends Actor
{
    int time;
    private int playerHealth = 3;
    
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
    
    public void takeDamage(int damage)
    {
        playerHealth = playerHealth - damage;
    }
    
    public boolean intersects(Actor other)
    {
        return super.intersects(other);
    }
    
    public int getPlayerHealth()
    {
        return playerHealth;
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
        time++;
        
        Actor bullet;
        Actor enemy_1;
        
        bullet = getOneObjectAtOffset(0, 0, bullet.class);
        enemy_1 = getOneObjectAtOffset(0, 0, enemy_1.class);
        if (time >= 150)
        {
            bullet();
            time = 0;
        }
    }
    
    public void bullet()
    {
        enemy_bullet enemy_bullet = new enemy_bullet();
        getWorld().addObject(enemy_bullet, getX(), getY());
        enemy_bullet.setRotation(getRotation()); 
    }
}