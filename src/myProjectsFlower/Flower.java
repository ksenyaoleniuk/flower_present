package myProjectsFlower;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by olenyuk on 03.10.2016.
 */
public class Flower {
    protected String name;
    protected int price;
    protected int height;
    protected int freshness; //1 - 5
    protected boolean suitable;
    //constructor
    public Flower(String Name, int Price, int Height, int Freshness, boolean Suitable) {
        name = Name;
        price = Price;
        height = Height;
        setFreshness(Freshness);
        suitable = Suitable;
    }
    public int getFreshness()
    {
        return freshness;
    }
    public String getName()
    {
        return name;
    }
    public int getHeight(){
        return height;
    }

    public void setFreshness(int freshness)
    {
        if (1 <= freshness && freshness<= 5) {
            this.freshness = freshness;
        }
        else{
            this.freshness = 1;
        }
    }
}

