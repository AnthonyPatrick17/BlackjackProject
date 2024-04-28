import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuWorld extends World
{
    private MuteButton muteButton;
    /**
     * Constructor for objects of class MenuWorld.
     * 
     */
    public MenuWorld()
    {        

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 536, 1); 
        prepare();
        muteButton = new MuteButton();
        addObject(muteButton, 420, 300);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ShopButton shopButton = new ShopButton();
        addObject(shopButton,303,314);
        removeObject(shopButton);

        addObject(shopButton,507,50);
        shopButton.setLocation(324,271);
        shopButton.setLocation(313,311);
        shopButton.setLocation(570,30);
        shopButton.setLocation(544,34);
        BackButton2 backButton2 = new BackButton2();
        addObject(backButton2,40,31);
        ShopButton shopButton2 = new ShopButton();
        addObject(shopButton2,806,31);
        shopButton.setLocation(547,156);
        removeObject(shopButton);
        MuteButton muteButton = new MuteButton();
        addObject(muteButton,388,296);
        removeObject(muteButton);
    }
}
