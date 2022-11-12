package Practice;

public class Study3_ConditionalStatements {
    public static void main(String[] args) {
        int time = 18;
        if (time > 30) { //if 20 is greater than 30 = false
            System.out.println("get to class");
        } else if (time > 20) { //if time is less than 20 = false
            System.out.println("your not late");
        } else if (time == 20) {
            System.out.println("go to sleep");
        } else if (time != 20){
            System.out.println("jump off a bridge");
        }
        if (time==18){
            System.out.println("time is 18");
        } else {
            System.out.println("im tired");
        }//end of conditional statement

    }//end of main
    }//end of class


