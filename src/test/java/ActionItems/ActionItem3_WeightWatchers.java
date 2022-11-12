package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem3_WeightWatchers {
    public static void main(String[] args) throws InterruptedException {

        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();

        //initialize chrome options
        ChromeOptions options = new ChromeOptions();

        //add options for maximizing the Chrome window in incognito mode
        options.addArguments("start-maximized", "incognito");

        //define the web driver and pass the options into the methods
        WebDriver driver = new ChromeDriver(options);

//define and declare array list
        ArrayList<String> ZipCode = new ArrayList<>();
        ZipCode.add("14221");
        ZipCode.add("14225");
        ZipCode.add("14228");

        for (int i = 0; i < ZipCode.size(); i++) {

            //navigate to the weight watchers site
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");

            //wait 2 seconds
            Thread.sleep(2000);

            //locate the search bar
            WebElement searchBar = driver.findElement(By.xpath("//*[@id='location-search']"));

            //clear the search bar
            searchBar.clear();

            //type the zipcode
            searchBar.sendKeys(ZipCode.get(i));

            //click on the arrow
            driver.findElement(By.xpath("//*[@id='location-search-cta']")).click();

            //wait 2 seconds
            Thread.sleep(2000);

            //declare and define the array list
            ArrayList<WebElement> address = new ArrayList<>(driver.findElements(By.xpath("//*[@class='wrapperLink-2NobU']")));
            //use the conditional statements
            if (i == 0) {
                address.get(1).click();
            }
            else if (i == 1) {
                address.get(2).click();
            }
            else if (i == 2) {
                address.get(0).click();

            }//end of conditional statements

            //sleep
            Thread.sleep(2000);

            //capture the location address
            String location = driver.findElement(By.xpath("//*[@class='infoContainer-12kv1']")).getText();

            //split the address column to print out the address only
            String[] locationSplits = location.split("\\R");

            //print the message from the split in separate line
            System.out.println(locationSplits[0] + "\n" + locationSplits[1] + "/n" + locationSplits[2]);

            //define javascript executor to scroll
            JavascriptExecutor scroll = (JavascriptExecutor) driver;

            //scroll to studio workshops schedule
            WebElement scrollView = driver.findElement(By.xpath("//*[contains(@class,'workshopSchedule')]"));

            //scroll
            scroll.executeScript("arguments[0].scrollIntoView(true);", scrollView);

            //capture the information with days and hours for studio workshops schedule and print it
            String table = driver.findElement(By.xpath("//*[@class='workshopSchedule-2foP8']")).getText();

            //print
            System.out.println(table);
            System.out.println();

            //close the browser
            driver.quit();

        }//end of for loop
    }//end main
}//end of class
