import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShopWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopWorld extends World
{

    /**
     * Constructor for objects of class ShopWorld.
     * 
     */
    public ShopWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground();
        addObject(new BackButton(), 25, 20);
        
        
    }
    private void setBackground(){
        GreenfootImage ShopImage = new GreenfootImage("shop_screen.png");
        setBackground(ShopImage);
    }
}
