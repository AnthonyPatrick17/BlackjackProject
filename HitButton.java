import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HitButton extends Actor
{
    
    public HitButton(){
        GreenfootImage image = new GreenfootImage("hit_button.png");
        setImage(image);
    }
    /**
     * Act - do whatever the HitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            // Add code here to perform hit action when the button is clicked
        }
    }
}
