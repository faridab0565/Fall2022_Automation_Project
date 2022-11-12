package Practice;

import java.util.ArrayList;
import java.util.concurrent.LinkedTransferQueue;

/* Create a list of words and combine them with a space in between.
        Example: if you had: "Hello","my","name","is" we want it to be
        "Hello my name is" and use a loop for your solution*/
public class Study2_10072022 {
    public static void main(String[] args) {
        //declare and define the ArrayList
        ArrayList<String> Introduction = new ArrayList<String>();
        Introduction.add("Hello");
        Introduction.add("my");
        Introduction.add("name");
        Introduction.add("is");

        //declare the for loop
       for (int i=0; i< Introduction.size(); i++){
           System.out.println(Introduction.get(i));
       } //end of loop
        //print out the solution
       //System.out.print(Introduction.get(i)


    }//end of main
}//end of class//
