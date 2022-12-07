import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    private int speed;
    GreenfootSound sound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage idle[] = new GreenfootImage[8];
    public Elephant(int speed){
        this.speed = speed;
        for(int i = 0; i < idle.length; i++){
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
        
    }
    //animate the elephant
    int imageIndex = 0;
    public void animate(){
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
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
        animate();
    }
    
    public void eat(){
        if(isTouching(Apple.class)){
           removeTouching(Apple.class);
           sound.play();
           MyWorld world = (MyWorld)getWorld();
           world.createApple();
           speed += 1;
        } 
    }
}
