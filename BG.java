// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class BG here.
 * @author (your name) @version (a version number or a date)
 */
public class BG extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class BG.
     */
    public BG()
    {
        super(850, 531, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Roket roket =  new Roket();
        addObject(roket, -5, -3);
        roket.setLocation(83, 57);
        Balon balon =  new Balon();
        addObject(balon, 319, 140);
        Balon balon2 =  new Balon();
        addObject(balon2, 702, 61);
        Balon balon3 =  new Balon();
        addObject(balon3, 567, 279);
        Balon balon4 =  new Balon();
        addObject(balon4, 772, 419);
        Balon balon5 =  new Balon();
        addObject(balon5, 300, 413);
        Balon balon6 =  new Balon();
        addObject(balon6, 110, 231);
        Bom bom =  new Bom();
        addObject(bom, 732, 263);
        Bom bom2 =  new Bom();
        addObject(bom2, 508, 96);
        Bom bom3 =  new Bom();
        addObject(bom3, 549, 441);
        Bom bom4 =  new Bom();
        addObject(bom4, 340, 267);
        Bom bom5 =  new Bom();
        addObject(bom5, 254, 42);
    }
}
