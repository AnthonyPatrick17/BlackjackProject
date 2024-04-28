import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends buttons
{
    private GreenfootImage InstructionsImage;
    
    public Instructions(){
        GreenfootImage myTitle = new GreenfootImage(230,60);
        Font adjustedFont = new Font(true, false, 27);
        myTitle.setFont(adjustedFont);
        myTitle.setColor(Color.WHITE);
        myTitle.drawString("Instructions",0,50);
        setImage(myTitle);
    }
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkMouse();
        checkClick(new InstructionWorld());
    }
}
