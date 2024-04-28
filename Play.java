import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends buttons
{
    public Play(){
        GreenfootImage Playbutton = new GreenfootImage(100,60);
        Font adjustedFont = new Font(true,false,37);
        Playbutton.setFont(adjustedFont);
        Playbutton.setColor(Color.WHITE);
        Playbutton.drawString("Play",0,50);
        setImage(Playbutton);
    }
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkMouse();
        World startWorld = getWorld();
        checkClick(new MyWorld(startWorld));
        
    }
}
