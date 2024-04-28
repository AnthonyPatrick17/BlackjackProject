import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends buttons
{
    private GreenfootImage MenuImage;
    private GreenfootSound clickSound;
    public Menu(){
        GreenfootImage image = new GreenfootImage(150, 50); 
        Font adjustedFont = new Font(true, false, 32); 
        image.setFont(adjustedFont);
        image.setColor(Color.WHITE);
        image.drawString("Menu", 0, 30); 
        setImage(image);
        clickSound = new GreenfootSound("click.mp3");
    }
    
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkMouse();
        if (Greenfoot.mouseClicked(this)) {
            clickSound.play();
            Greenfoot.setWorld(new MenuWorld());
        }
    }
}
