package Day3_10082022;

public class Practice3 {
    public static void main(String[] args) {
          /* Finish the code to print It is freezing if the temperature is below 30,
        It is cold if it is below 50, It is nice out if it is below 90, or It is hot. /*
         */

        int temp = 100;
        if (temp < 30) {
            System.out.println("It is freezing");
        } else if (temp < 50) {
            System.out.println("It is cold");
        } else if (temp < 90) {
            System.out.println("It is nice out");
        } else {
            System.out.println("It is hot!");
        }//end of conditional statements


    }//end of main
}//end of class
