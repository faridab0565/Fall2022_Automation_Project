package Day5_10142022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_XpathTextContains {
    public static void main(String[] args) throws InterruptedException {
//setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //navigate to the yahoo site
        driver.navigate().to("https://www.yahoo.com");
        //maximize my window
        driver.manage().window().maximize();
        //click on sign in button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text() = 'Sign in']")).click();
        //wait 2 seconds
        Thread.sleep(2000);
        //go to the yahoo home page
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(1000);
        //click on the bell icon
        driver.findElement(By.xpath("//*[contains(@class,'rapid-nonanchor')]")).click();
        //wait 2 seconds
        Thread.sleep(2000);
        //quit chrome
        driver.quit();

    }//end of main

}//end of class
