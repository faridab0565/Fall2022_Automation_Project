package Practice;

public class Practice7_SplitMessage {
    public static void main(String[] args) {
        String weather = "I like sweater weather especially autumn";
        String[] splitweather = weather.split("weather");
        System.out.println("season: "+ splitweather[1]);

       String places = "I want to go to Mecca and Medina";
       String[] splitplaces = places.split("and");
        System.out.println("My favorite place is " + splitplaces[1]);

        String houses = "Fillmore is where the house is located";
        String[] splitHouses = houses.split(" ");
        System.out.println("The house is located at " + splitHouses[0]);

        //if you have integers u can use a string data type still to split the message for example:

        String childAge = " 2 3 4 5 6 ";
        String[] splitAge = childAge.split("4");
        System.out.println("Age " + splitAge[1]);









        String mySentence = "I work full time and study";
        String[] splitmySentence = mySentence.split(" ");
        System.out.println("My life right now: " + splitmySentence[1] + " and " + splitmySentence[5]);








    }//end of main

}//end of class
