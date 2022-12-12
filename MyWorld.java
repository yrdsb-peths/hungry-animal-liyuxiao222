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
    int level = 1;
    public MyWorld()
    {    
        super(600, 400, 1, false);
        //create elephant object
        Elephant liyu = new Elephant(3);
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
        
        if(sum % 5 == 0){
            level += 10;
        }
    }
    
    //creates a new apple every time an apple is eaten
    public void createApple(){
        Apple apple = new Apple();
        apple.setSpeed(level);
        addObject(apple, Greenfoot.getRandomNumber(600), 0);
        increaseScore();
        createBomb();
    }
    public void createBomb(){
        Bomb bomb = new Bomb();
        addObject(bomb, Greenfoot.getRandomNumber(600), 0);
    }
}


