package myProjectPresent;

/**
 * Created by olenyuk on 03.10.2016.
 */

public class CreatingPresent {
    public int size;
    public int counter = 0;
    protected Candy[] presentPacket;
    //constructor
    public CreatingPresent(int Size){
        size = Size;
        presentPacket = new Candy[size];
    }
    // adds candy to array
    public void addCandies(Candy cn){
        this.checkLength();
        presentPacket[counter - 1] = cn;
    }
    // checks length and makes array twice bigger if it`s needed
    public void checkLength(){
        if((counter + 1) > size){
            Candy[] newPacket = new Candy[counter*2];
            for (int i  = 0; i  < counter; i ++){
                newPacket[i] = presentPacket[i];
                size = counter + 1;
            }
            presentPacket = newPacket;
        }
        counter += 1;}

    public int getAllWeight(){
        int all = 0;
        for (int i  = 0; i < counter; i++){
            all += presentPacket[i].getWeight();
        }
        return all;
    }
    public void findSugar(int x, int y){
        for(int i  = 0; i < counter;  i ++){
            if(presentPacket[i].getSweetness() <= y && presentPacket[i].getSweetness() >= x){
                System.out.println("This candy consist right spectrum of sugar" + presentPacket[i].getName());
            }
        }
    }
    public void showMyPresent(){
        System.out.println("This are candies in my present: ");
        for(int i = 0; i < counter; i ++){
            System.out.println(presentPacket[i].getName());
        }
    }

}