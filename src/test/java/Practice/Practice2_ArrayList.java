package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practice2_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> flowerNames = new ArrayList<>(); //define and declare the variable type and elements
        flowerNames.add("Roses");
        flowerNames.add("Tulips");
        flowerNames.add("Sunflower");
        flowerNames.add("Daisies");
        flowerNames.add("Marigold");

        ArrayList<Integer> flowerPrice = new ArrayList<>(); //define and declare the variable type and elements
        flowerPrice.add(2);
        flowerPrice.add(4);
        flowerPrice.add(6);
        flowerPrice.add(8);
        flowerPrice.add(10);
        flowerPrice.add(12);
        flowerPrice.add(14);

        //print out the size for array list using .size and to get a specific element its .get
        System.out.println("My favorite type of flower is " + flowerNames.get(0) +
                " the price is " + flowerPrice.get(0) + " dollars ");

        System.out.println(" There are currently " + flowerPrice.size() + " in my cart "
                + " but I only want to pay " + flowerPrice.get(5) + " dollars");

    }//end of main
}// end of class
