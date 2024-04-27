import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Scoreboard scoreboard;
    private Timer timer;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1);
        prepare();
        addObject(new BackButton1(null), 35, 40);
        addTimer();
        
        HitButton hitButton = new HitButton();
        addObject(hitButton, getWidth() - hitButton.getImage().getWidth() / 2, getHeight() - hitButton.getImage().getHeight() / 2);
        
        StandButton standButton = new StandButton();
        addObject(standButton, 150,770);
    
    }
    
    public MyWorld(World prevWorld)
    {
        super(1100, 800, 1);
        prepare();
        addObject(new BackButton1(prevWorld), 35, 40);
        addTimer();
        
        HitButton hitButton = new HitButton();
        addObject(hitButton, getWidth() - hitButton.getImage().getWidth() / 2, getHeight() - hitButton.getImage().getHeight() / 2);
        
        StandButton standButton = new StandButton();
        addObject(standButton, 150,770);

    }
    
    private void prepare(){
        scoreboard = new Scoreboard(0);
        addObject(scoreboard, getWidth()/2, scoreboard.getImage().getHeight()/2);

    }
    
    private void addTimer() {
        timer = new Timer();
        addObject(timer, getWidth() - timer.getImage().getWidth()/2, timer.getImage().getHeight()/2);
    }
}
