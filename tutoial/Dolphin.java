import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Actor
{
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private final int GRAVITY = 1;
    private int velocity;
    
    public Dolphin ()
    {
      velocity = 0;
    }
    
    public void act()
    {
      fall();
      if(Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight() -70) jump();
      move();
    }
    
    public void fall(){ 
        setLocation(getX(), getY() + velocity);
        if(getY() > getWorld().getHeight() - 70) velocity = 0;
        else velocity += GRAVITY; 
    }
    
    public void jump()
    {
      velocity = -20;
    }
    
    public void move()
    {
        int x = super.getX();
        int y = super.getY();

        if(Greenfoot.isKeyDown("left"))
        {
          x--;
        } else if(Greenfoot.isKeyDown("rigth"))
        {
         x++;
        }
        
        this.setLocation(x, y);
        
    }
}

