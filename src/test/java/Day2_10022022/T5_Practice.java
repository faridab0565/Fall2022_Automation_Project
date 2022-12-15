package Day2_10022022;

import java.util.ArrayList;

public class T5_Practice {
    /* Using String country & int countryCode with while loop and ArrayList create at least 4 data for each variable and iterate through each
     to print out the i for both
    variables.For instance, System.out.println("My country is " + country.get(i) + " and my country code is 3I + countryCode.get(i));
    */
    public static void main(String[] args) {
        //declare and define the string variable for countries in an array list
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("Argentina");
        countries.add("Qatar");
        countries.add("Brazil");
        countries.add("Wales");

        //declare and define the int variables in an array list
        ArrayList<Integer> countryCode = new ArrayList<Integer>();
        countryCode.add(12);
        countryCode.add(13);
        countryCode.add(14);
        countryCode.add(15);

        //initialize the while loop
        int i = 0;

//set the conditions for the while loop. since we know the number of times it will execute in this case while loop is the best option.
        while (i < countries.size()) {

//print out the statement
            System.out.println("My country is " + countries.get(i) + " and my country code is " + countryCode.get(i));

            //set the incrementation
            i++;

        }//end of while loop
    }//end of main
}//end of class
