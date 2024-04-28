import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends buttons
{
    
    public Exit(){
        GreenfootImage myTitle = new GreenfootImage(100,60);
        Font adjustedFont = new Font(true, false, 35);
        myTitle.setFont(adjustedFont);
        myTitle.setColor(Color.WHITE);
        myTitle.drawString("Exit",0,50);
        setImage(myTitle);
    }
    

    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
            World myWorld = getWorld();
            if (myWorld != null){
                ((startScreen)myWorld).stopMusic();
            }
        }
    }
}
