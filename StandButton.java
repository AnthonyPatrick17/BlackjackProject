import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StandButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StandButton extends Actor
{
    public StandButton(){
        GreenfootImage image = new GreenfootImage("stand_button.png");
        setImage(image);
    }
    /**
     * Act - do whatever the StandButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (Greenfoot.mouseClicked(this)) {
            // Add code here to perform hit action when the button is clicked
        }
    }
}
