package myProjectsFlower;

/**
 * Created by olenyuk on 03.10.2016.
 */

public class Bouquet{
    public Integer size;
    public Integer counter = 0;
    protected Flower[] bouquet;

    public Bouquet(int Size){
        size = Size;
        bouquet = new Flower[size];}

    // checks length and makes array twice bigger if it`s needed
    public void checkLength(){
        if((counter + 1) > size){
            Flower[] bucketEx = new Flower[counter*2];
            for (int i  = 0; i  < counter; i ++){
                bucketEx[i] = bouquet[i];
                size = counter + 1;
            }
            bouquet = bucketEx;
        }
        counter += 1;}

    // adds flower to the bouquet
    public void addFlower(Flower fl){
        this.checkLength();
        bouquet[counter - 1] = fl;}

    // checks if flower is in bouquet
    public boolean isFlowerIn(Flower fl){
        for(int i = 0; i < size; i ++){
            if(bouquet[i] == fl) {
                return true;
            }
            }
        return false;
    }

    // sorts bouquet by the freshness
        public void sortFreshness() {
            for (int i = 0; i < counter - 1; i++) {
                boolean swapped = false;
                for (int j = 0; j < counter - i - 1; j++)
                    if (bouquet[j].getFreshness() >  bouquet[j + 1].getFreshness()){
                        Flower tmp = bouquet[j];
                        bouquet[j] = bouquet[j + 1];
                        bouquet[j + 1] = tmp;
                        swapped = true;
                    }
                if(!swapped){
                    break;}
            }}

    //finds flowers with height from x to y
    public void findHeight(int x, int y){


        for (int i = 0; i < counter; i ++){
            if(x <= bouquet[i].getHeight() && bouquet[i].getHeight() <= y){
                System.out.println(bouquet[i].getName() + " " + "has a right height.");
            }}}

    /// Add one type of flowers and get bouquet with this flowers with size you created bouquet
    public void ExpandBouquetWithOne(Flower fl){

            for (int i = 0; i < size; i ++){
                this.addFlower(fl);
            }}
    //prints bouquet
    public void showMyBouquet(){
        System.out.println("This is a list with customer flowers:");
//        System.out.println(Integer.toString(counter));
        for(int i = 0; i < counter; i ++){
        System.out.println(bouquet[i].getName());}

    }
}
