package Practice;

import java.util.ArrayList;

/*using string country and CountryCode with for loop and ArrayList
create at least 4 data for each variable and iterate through each to print out the
 i for both variables.
 */
public class Practice3_LinearArrayForLoop {
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>();
        country.add("Turkey");
        country.add("Maldives");
        country.add("Greece");
        country.add("Colombia");
        country.add("Pakistan");

        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(23);
        countryCode.add(24);
        countryCode.add(25);
        countryCode.add(26);
        countryCode.add(27);

        for (int i = 0; i < countryCode.size(); i++ ) {
            //System.out.println("My country name is " + country.get(i) + " and the country code is " + countryCode.get(i));




        } //end of for loop
    }//end of main
}//end of class
