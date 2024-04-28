import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShopButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopButton extends Actor
{
    public ShopButton(){
        GreenfootImage buttonImage = new GreenfootImage("shopButton1.png");
        setImage(buttonImage);
    }
    /**
     * Act - do whatever the ShopButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            // Create a new instance of the ShopWorld and set it as the new world
            ShopWorld shopWorld = new ShopWorld();
            Greenfoot.setWorld(shopWorld);
        }
    }
}
