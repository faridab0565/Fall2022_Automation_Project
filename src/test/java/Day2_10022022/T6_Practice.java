package Day2_10022022;

public class T6_Practice {   /*Using String[] region & int[] areaCode with for  loop and linear array
create at least 4 data for each variable and iterate through each to print out the i for both variables.
For instance, System.out.printIn("My region is
" + region!] +
" and my area code is " + areaCode li]); */
    public static void main(String[] args) {
        //declare and define the regions in a linear array
        String[] regions = new String[]{"Depew", "West Seneca", "Cheektowaga", "Sanborn"};
        //declare and define the areaCode in linear array
        int[] areaCode = new int[]{1, 2, 3, 4};
        for (int i = 0; i < regions.length; i++) {
            System.out.println(" My region is " + regions[i] + " and area code is " + areaCode[i]);

        }//end of for loop

    }//end of main

}//end of class
