package Practice;

public class Practice1_LinearArray {
    public static void main(String[] args) {

//declare and define the linear array data and variable type
        String[] flowersName = new String[]{"roses", "daisies", "tulips", "jasmine", "marigold"};

        //re-assign a value for the index 2 element

        flowersName[2] = "dandelions";
        //declare and define the linear array data and variable type

        int[] flowersPrice = new int[]{2, 4, 6, 7, 8, 9, 10,};

        //print out a few examples
        System.out.println(flowersPrice[2]);
        System.out.println(flowersName[2]);
        System.out.println(flowersName.length);
        System.out.println("My favorite flower is " + flowersName[0] + " and the price is " +
                flowersPrice[0] + " dollars");

    }//end of main
}//end of class
