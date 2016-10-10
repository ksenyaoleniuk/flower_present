package myProjectPresent;

/**
 * Created by olenyuk on 03.10.2016.
 */
public class Main {
    public static void main(String[] args){
        Candy firstCandy = new Candy("шалена бджілка",20,2,30);
        Candy secondCandy = new Candy("шоколадка",40,5,100);
        Candy thirdCandy = new Candy("льодяник",20,3,50);
        CreatingPresent myFirstPresent = new CreatingPresent(3);
        myFirstPresent.addCandies(firstCandy);
        myFirstPresent.addCandies(secondCandy);
        myFirstPresent.addCandies(thirdCandy);
        myFirstPresent.showMyPresent();
        myFirstPresent.getAllWeight();
        myFirstPresent.findSugar(2,3);

    }
}
