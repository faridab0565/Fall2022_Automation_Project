package Day3_10082022;

public class Practice4 {
    public static void main(String[] args) {
        /*Finish the code below to print your grade based on your score.
        The score is an A if you scored 92 or higher, a B if you scored 82 to 91,
        a C if you scored 72 to 81, a D if you scored a 62 to 71, or an E.
         */
        int score = 67;
        if (score >= 92) {
            System.out.println("Grade A");
        } else if (score >= 82) {
            System.out.println("Score B");
        } else if (score >= 71) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }//end of conditional statements

    }//end of main
}//end of class
