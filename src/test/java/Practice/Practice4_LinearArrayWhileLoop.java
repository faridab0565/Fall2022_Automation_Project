package Practice;

/*using string country and CountryCode with while  loop and ArrayList
create at least 4 data for each variable and iterate through each to print out the
 i for both variables.
*/

import java.util.ArrayList;

public class Practice4_LinearArrayWhileLoop {
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

        int i = 0;
        while (i < country.size()){
            i++;
        System.out.println(" Please print out Greece 5 times " + country.get(2));


    } //end of while loop
} //end of main
}//end of class
