package Day4_10092022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearchExample {
    public static void main(String[] args) throws InterruptedException {

        // setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //navigate to the Google site
        driver.navigate().to("https://www.google.com");
        //maximize my window
        driver.manage().window().maximize();
        //sleep statement
        Thread.sleep(3000);
        //search a keyword on the search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        //hit submit on the Google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        //sleep statement
        Thread.sleep(3000);
        //capture the search result text
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //split message to extract out the search number
        String[] splitResult = result.split( " ");
        System.out.println(" the search number is " + splitResult[1]);
        //wait 3 seconds
        Thread.sleep(3000);
        //close Chrome
        driver.quit();

    }//end of main
}//end of class