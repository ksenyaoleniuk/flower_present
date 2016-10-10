package myProjectsFlower;



/**
 * Created by olenyuk on 03.10.2016.
 */
public class Main {
    public static void main(String[] args){
        Flower chamomile = new Flower("Chamomile", 20,4,4, true);
        Flower lily = new Flower("Lily", 15,4,3, true);
        Bouquet MyFirstBouquet = new Bouquet(10);
        MyFirstBouquet.addFlower(lily);
        MyFirstBouquet.addFlower(chamomile);
        MyFirstBouquet.sortFreshness();
        MyFirstBouquet.showMyBouquet();
        Bouquet MySecondBouquet = new Bouquet(5);
        MySecondBouquet.ExpandBouquetWithOne(lily);
        MySecondBouquet.showMyBouquet();
        MyFirstBouquet.findHeight(2,6);
    }}
