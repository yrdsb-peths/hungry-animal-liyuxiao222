import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bomb extends Actor
{
    int speed = 1;
    GreenfootImage bomb = new GreenfootImage("images/bomb.png");
    public Bomb(){
        bomb.scale(100,100);
        setImage(bomb);
    }
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x,y);
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Elephant.class)){
            removeTouching(Elephant.class);
            world.gameOver();
        }
    }
    
    
    public void setSpeed(int speed){
        speed += 1;
    }
}
