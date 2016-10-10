package myProjectPresent;

/**
 * Created by olenyuk on 03.10.2016.
 */
public class Candy {
    protected String name;
    protected int weight;
    protected int sweetness;/// from 1 to 5
    protected int childrenPrefer;///from 1 to 100

    //constructor

    public Candy(String Name, int Weight, int Sweetness, int ChildrenPrefer){
        name = Name;
        weight = Weight;
        sweetness = Sweetness;
        childrenPrefer = ChildrenPrefer;
    }
    public int getWeight(){
        return weight;
    }
    public int getSweetness(){
        return sweetness;
    }
    public String getName(){
        return name;
    }

}
