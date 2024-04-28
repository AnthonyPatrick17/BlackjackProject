import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startScreen extends World
{
    private GreenfootSound[] soundtracks = new GreenfootSound[8];
    private int currentSoundtrackIndex = 0;
    

    public startScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 536, 1); 
        prepare();
        loadSoundtracks();
        
    }
    
    private void prepare(){
        GreenfootImage logo = new GreenfootImage("blackjack.png");
        picture logoPic = new picture(logo);
        addObject(logoPic,getWidth()/2,150);

        Play play = new Play();
        addObject(play,747,489);
        removeObject(play);

        addObject(play,492,374);
        Instructions instructions = new Instructions();
        addObject(instructions,150,39);
        Exit exit = new Exit();
        addObject(exit,128,483);

        MusicSwitcher musicSwitcher = new MusicSwitcher(this);
        addObject(musicSwitcher,690,45);

        Menu menu = new Menu();
        addObject(menu,742,493);
        Exit exit2 = new Exit();
        addObject(exit2,292,500);
        removeObject(exit2);
    }
    
    private void loadSoundtracks(){
        soundtracks[0] = new GreenfootSound("Drake - Controlla.mp3");
        soundtracks[1] = new GreenfootSound("Mustard - Ballin ft. Roddy Ricch.mp3");
        soundtracks[2] = new GreenfootSound("Sleepy Hallow - 2055 .mp3");
        soundtracks[3] = new GreenfootSound("YG - My Nigga .mp3");
        soundtracks[4] = new GreenfootSound("Pop Smoke - Merci Beaucoup (Lyrics).mp3");
        soundtracks[5] = new GreenfootSound("Cash Cobain - Dunk Contest [Official Video].mp3");
        soundtracks[6] = new GreenfootSound("Sleepy Hallow - Driver's Seat (Intro) (Official Video).mp3");
        soundtracks[7] = new GreenfootSound("S1MBA - Rover (feat. Lil Tecca) [Lyric Video].mp3");
    }
    
    public void started(){
        playCurrentSoundtrack();
    }
    
    public void stopped(){
        stopCurrentSoundtrack();
    }
    
    public void switchSoundtrack(){
        stopCurrentSoundtrack();
        currentSoundtrackIndex = (currentSoundtrackIndex + 1) % soundtracks.length;
        playCurrentSoundtrack();
        
    }
    
    public void playCurrentSoundtrack(){
        if(currentSoundtrackIndex >= 0 && currentSoundtrackIndex < soundtracks.length && soundtracks[currentSoundtrackIndex] != null){
            soundtracks[currentSoundtrackIndex].play();
        }
    }
    
    public void stopCurrentSoundtrack(){
        if(currentSoundtrackIndex >= 0 && currentSoundtrackIndex < soundtracks.length && soundtracks[currentSoundtrackIndex] != null){
            soundtracks[currentSoundtrackIndex].stop();
        }
    }
    
    public void stopMusic(){
        stopCurrentSoundtrack();

    }
    
    
}
