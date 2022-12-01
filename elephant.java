import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The elephant our hero.
 * 
 * @Liyu Xiao 
 * @11/30/2022
 */
public class Elephant extends Actor
{
    private String name;
    /**
     * Act - do whatever the elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Elephant (String theName){
        name = theName;
    }
    public void act()
    {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(1);
        }
        
        
        removeTouching(Apple.class);
    }
    
    
}
