package ActionItems;
/* Using String country & int countryCode with for loop and ArrayList create at least 4 data for each variable and iterate through each
 to print out the i for both
variables.For instance, System.out.println("My country is " + country.get(i) + " and my country code is 3I + countryCode.get(i));
*/
import java.util.ArrayList;
public class ActionItem1_Countries {
    public static void main(String[] args) {
        //created an array list for country variable
        ArrayList<String> Country= new ArrayList<String>();
        Country.add("Bangladesh");
        Country.add("Indonesia");
        Country.add("Dubai");
        Country.add("Switzerland");

        //created an array list for country code variable
        ArrayList<Integer> CountryCode = new ArrayList<Integer>();

        //adding to country code list
        CountryCode.add(345);
        CountryCode.add(562);
        CountryCode.add(738);
        CountryCode.add(987);

        for (int i=0; i< Country.size();i++){
           //print out all country name and all country code in one statement
            System.out.println("My country is "+ Country.get(i)+ " and my country code is"+ " "+ CountryCode.get(i));
        }//end of loop
    }//end of main
}//end of java
