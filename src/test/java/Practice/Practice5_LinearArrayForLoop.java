package Practice;

/* using String region and int area Code with for loop and linear array create at least
4 data for each variable and iterate through each to print out both variables
 */

import java.lang.reflect.Array;

public class Practice5_LinearArrayForLoop {
    public static void main(String[] args) {

        String[] regions = new String[]{"Asia", "Africa", "Europe", "North America"};
        int[] areaCode = new int[]{1, 2, 3, 4, 5, 6};

        for (int i=0; i< regions.length; i++) {
            System.out.println(" My regions are " + regions[0] + " the area code is " + areaCode[0]);
            System.out.println( "There are a total of " + regions.length + " regions " + " and " + areaCode.length + " area codes");

        } //end of for loop

    } //end of main
    }//end of class

