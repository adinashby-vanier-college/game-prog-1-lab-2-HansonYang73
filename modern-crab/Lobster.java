// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("t")) {
            setLocation(getX() - 50, getY() + 50);
        }
        if (Greenfoot.isKeyDown("y")) {
            setLocation(getX() + 50, getY() - 50);
        }
        removeTouching(Crab.class);
    }
}
