import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButton2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton2 extends Actor
{
    public BackButton2(){
        GreenfootImage image = new GreenfootImage("backbutton5.png");
        setImage(image);
    }
    /**
     * Act - do whatever the BackButton2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new startScreen());
        }
    }
}
