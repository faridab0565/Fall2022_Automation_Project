package Day5_10142022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_ChromeOptions {
    public static void main(String[] args) {
        //set up your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        //add options for maximizing the Chrome window
        options.addArguments("start-maximized", "incognito");
        //options.addArguments ("headless");
        /*this allows your code to run in the background. it is helpful
        if you ran the code a few times and know what to expect. */
        //for mac use full screen
        //options.addArguments("full-screen");
        //define the webdriver and pass the options into the methods
        WebDriver driver = new ChromeDriver(options);
        //go to the Google page
        driver.navigate().to("https://www.google.com");
        //locate the element for the search field and type cars
        //this is an example of relative xpath
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("cars");
        //submit on Google search button
        driver.findElement(By.xpath("//*[@name= 'btnK']")).submit();
        //capture the search result and print it
        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //extract out the number and print out the search number only
        String[] arrayResult = searchResult.split(" ");
        System.out.println("My search number is " + arrayResult[1]);
        //quit driver
        driver.quit();

    }//end of main

}//end of class

