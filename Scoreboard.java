import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    private String label;
    private int fontSize;
    private Color textColor;
    private Color backgroundColor;
    private int score;
    
    public Scoreboard(int score){
        this.score = score;
        fontSize = 20;
        textColor = Color.WHITE;
        backgroundColor = new Color(0,0,0,0);//transparent
        this.label = ""+score;
        updateImage();
    }
    
    public void update(int change){
        score += change;
        setLabel(""+score);
    }
    
    public void setLabel(String text){
        this.label = text;
        updateImage();
    }
    
    public void updateImage(){
        GreenfootImage myImage = new GreenfootImage(label, fontSize, textColor, backgroundColor);
        setImage(myImage);
    }
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
