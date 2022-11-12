package Day6_10162022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_FindElements {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //navigate to the yahoo site
        driver.navigate().to("https://www.yahoo.com");
        //maximize my window
        driver.manage().window().maximize();
        //wait few seconds
        Thread.sleep(3000);
        //using find elements I want to click on a second link within the group which is News
        driver.findElements(By.xpath("//*[contains(@class,'_yb_sc88r')]")).get(1).click();


    }//end of main

}//end of class
