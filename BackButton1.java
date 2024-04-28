import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButton1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton1 extends Actor
{
    private World prevWorld;
    
    public BackButton1(World prevWorld){
        GreenfootImage image = new GreenfootImage("backbutton5.png");
        setImage(image);
        this.prevWorld = prevWorld;
    }
    /**
     * Act - do whatever the BackButton1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            if (prevWorld == null){
                Greenfoot.setWorld(new startScreen());
            } else {
                Greenfoot.setWorld(prevWorld);
            }
        }
    }
}
