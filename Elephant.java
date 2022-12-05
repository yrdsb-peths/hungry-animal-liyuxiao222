import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    private int speed;
    
    public Elephant(int speed){
        this.speed = speed;
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-speed);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(speed);
        }
        
        // eats the apple and spawns a new apple
        eat();
    }
    
    public void eat(){
        if(isTouching(Apple.class)){
           removeTouching(Apple.class);
           elephantSound.play();
           MyWorld world = (MyWorld)getWorld();
           world.createApple();
           speed += 1;
        } 
    }
}
