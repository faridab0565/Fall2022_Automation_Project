package Day2_10022022;

public class T1_LinearArray {
    public static void main(String[] args) {
        //declare a String array variable
        String[] zipCode;
        //define a zipcode values for the Linear string array
        zipCode = new String[]{"11218", "11222", "10001", "11377"};
        //reassign the value of an element
        zipCode [2]= "14208";
        //print a value from zipcode. Array always starts from zero index
        System.out.println("zipcode: " + zipCode[2]);

    }//end of main

} //end of java class
