package ActionItems;
/*Using String[] region & int[] areaCode with while loop and linear array
create at least 4 data for each variable and iterate through each to print out the i for both variables.
For instance, System.out.printIn("My region is
" + region!] +
" and my area code is " + areaCode li]); */

public class ActionItem1_Region {

    public static void main(String[] args) {
        //declaring String region variable
        String[]Region;
        //defining String region variable for the string array
        Region= new String[] {"Brooklyn", "Queens", "Bronx", "Long Island"};

        //declaring int variable for area code
        int[]AreaCode;
        //defining int areaCode variable for the string array
        AreaCode= new int[]{23, 45, 78,79};

        int i=0; //initialize the i variable
        //set the conditions for while loop
        while(i<AreaCode.length){
            System.out.println("my region is "+Region[i]+ " and my area code is "+ AreaCode[i]);
            i++;

        }//end of while loop
    }//end of main
}//end of class



