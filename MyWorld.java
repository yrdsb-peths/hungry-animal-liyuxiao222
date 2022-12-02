import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int sum = -1;
    Label scoreLabel;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1, false);
        //create elephant object
        Elephant liyu = new Elephant();
        addObject(liyu,200,200);
        //create lable
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 20, 20 );
        
        //creates apple
        createApple();

    }
    
    //stops when the game is over
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 50);
        addObject(gameOverLabel, 300, 300);
    }
    
    //increase the score each time the elephant eats an apple
    public void increaseScore(){
        sum++;
        scoreLabel.setValue(sum);
    }
    
    //creates a new apple every time an apple is eaten
    public void createApple(){
        Apple apple = new Apple();
        addObject(apple, Greenfoot.getRandomNumber(600), 0);
        increaseScore();
    }
}


