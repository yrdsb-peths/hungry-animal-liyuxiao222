import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        Elephant liyu = new Elephant("liyu");
        addObject(liyu,200,200);
    }
    
    public void createApple(){
        Apple apple = new Apple();
        addObject(apple, Greenfoot.getRandomNumber(300), 0);
    }
}


