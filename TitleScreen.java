import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Label startLabel = new Label("Hungry Animal", 70);
        addObject(startLabel,getWidth()/2, getHeight()/2);

        prepare();
    }
    //The main world act loop 
    public void act(){
        // start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant(1);
        addObject(elephant,422,105);
        Label label = new Label("Press space to Start", 100);
        addObject(label,346,311);
        label.setLocation(313,333);
        label.setValue(10);
        label.setLocation(362,320);
        label.setLocation(360,320);
        label.setValue("Press space to start");
        label.setLocation(435,316);
        label.setLocation(263,38);
        label.setLocation(554,49);
        label.setLocation(554,49);
        removeObject(label);
        Label label1 = new Label("Press space to start", 50);
        addObject(label1,305,305);
        Label label2 = new Label(" use <--> to move", 50);
        addObject(label2,228,115);
        label2.setLocation(307,255);
    }
}
