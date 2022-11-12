package Practice;

public class Practice6_LinearArrayWhileLoop {
    public static void main(String[] args) {

        String[] regions = new String[]{"Asia", "Africa", "Europe", "North America"};
        int[] areaCode = new int[]{1, 2, 3, 4, 5, 6};

        int i = 0;
        while (i <= regions.length) {
            i++;
            //System.out.println(" Please print  the " + regions[0] + " and " + areaCode[0]);
            System.out.println(" Please print " + regions[0] );
        }//end of while loop


    }//end of main

}//end of class
