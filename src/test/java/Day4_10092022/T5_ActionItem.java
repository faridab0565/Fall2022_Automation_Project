package Day4_10092022;
//write an array list with at least 4 values by choosing one of the following categories - hobbies,
//        regions, sports, regions, or places. create a for/while loop to iterate through your list
//step 1: navigate to bing.com
//    step 2: wait few seconds
//step3:  enter your desire value from the category you chose in to the search field
//step 4: click on search icon
//step 5: wait few seconds
//step 6: capture the search result text
//step 7: extract out the search number
//step 8: print the search number and the category it belongs to
// step 9: finally outside of for loop quit the session

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class T5_ActionItem {
    public static void main(String[] args) throws InterruptedException {
        //declare and define the variable values in an array list
        ArrayList<String> sports = new ArrayList<>();
        sports.add("basketball");
        sports.add("soccer");
        sports.add("tennis");
        sports.add("baseball");
        //declare webdriver manger to set up chrome
        WebDriverManager.chromedriver().setup();
        //create an instance for chrome
        WebDriver driver = new ChromeDriver();

        //create your for loop to iterate through the array list for sports
        for (int i = 0; i < sports.size(); i++) {

            //navigate to bing.com website

            driver.navigate().to("https://www.bing.com/");
            //wait 3 seconds
            Thread.sleep(3000);
//click on the search bar
            driver.findElement(By.xpath("//*[@id='sb_form_q']")).click();
            //enter the values for the variables
            driver.findElement(By.xpath("//*[@id='sb_form_q']")).sendKeys(sports.get(i));
            //click on the search icon
            driver.findElement(By.xpath("//*[@id='search_icon']")).click();
            //wait 3 seconds
            Thread.sleep(3000);
           String searchResult = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
           //split the results. since it's a string, it becomes a linear array so we have use the index # and []
            String[] splitSearchResult = searchResult.split(" ");
            //print out only the results
            System.out.println(" Sport: " + sports.get(i) + " the search result is " + splitSearchResult[1]);
        }//end of for loop
        driver.quit();

    }//end of main


}//end of class
