package Day3_10082022;

public class T5_ReturnMethodExample {
    public static void main(String[] args) {
        //the result of return method is equal to the result you stored in the new variable
        int value = ReusableClass.returnTwoAddNumbers(5, 2);//values =7
        //now you can set additional calculation to the value since you stored it as a variable
        System.out.println("new value is " + (value + 3));//values(7)+3=10


    }//end of main
}//end of class

//store it as a value and perform another operation


