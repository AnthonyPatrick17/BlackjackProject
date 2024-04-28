import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MuteButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MuteButton extends Actor
{
    private GreenfootImage muteImage;
    private GreenfootImage unmuteImage;
    private GreenfootSound gameSound;
    private GreenfootSound muteSound;
    private boolean isMuted;
    
    public MuteButton() {
        muteImage = new GreenfootImage("mute_button.png");
        unmuteImage = new GreenfootImage("unmute_button.png");
        setImage(unmuteImage);

        gameSound = new GreenfootSound("");
        muteSound = new GreenfootSound("");
        isMuted = false;
    }
    /**
     * Act - do whatever the MuteButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            toggleMute();
        }
    }
    
    private void toggleMute() {
        if (isMuted) {
            setImage(unmuteImage);
            gameSound.playLoop();
            isMuted = false;
        } else {
            setImage(muteImage);
            gameSound.stop();
            muteSound.play();
            isMuted = true;
        }
    }
}
