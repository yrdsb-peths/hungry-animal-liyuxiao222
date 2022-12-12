import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    private int speed;
    GreenfootSound sound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    
    //direction the elephant is facing
    String facing = "right";
    
    public Elephant(int speed){
        this.speed = speed;
        for(int i = 0; i < idleRight.length; i++){
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(50, 50);
        }
        //Initial elephant image
        
        for(int i =0; i< idleLeft.length; i++){
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(50, 50);
        }
        setImage(idleRight[0]);
        
        animationTimer.mark();
        
    }
    //animate the elephant
    int imageIndex = 0;
    public void animate(){
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        if(facing.equals("right")){
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else{
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex+1) % idleLeft.length;
        }
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-speed, getY());
            facing = "left";
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+speed, getY());
            facing = "right";
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - speed);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + speed);
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
        } 
    }
}
