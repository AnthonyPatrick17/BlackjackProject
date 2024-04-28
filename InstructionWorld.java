import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionWorld extends World
{

    /**
     * Constructor for objects of class InstructionWorld.
     * 
     */
    public InstructionWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 536, 1); 
        setBackground();
        addObject(new BackButton(), 25, 20);
    }
    
    private void setBackground(){
        GreenfootImage InstructionsImage = new GreenfootImage("rules1.png");
        setBackground(InstructionsImage);
    }
}
