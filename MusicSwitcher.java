import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicSwitcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicSwitcher extends Actor
{
    private startScreen world;
    private GreenfootImage buttonImage;
    
    public MusicSwitcher(startScreen world){
        this.world = world;
        buttonImage = new GreenfootImage("images.png");
        setImage(buttonImage);
    }

    /**
     * Act - do whatever the MusicSwitcher wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            world.switchSoundtrack();
        }
    }
}
