package Day6_10162022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_WebElement_Mlcalc {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //navigate to the yahoo site
        driver.navigate().to("https://www.mlcalc.com");
        //maximize my window
        driver.manage().window().maximize();
        //wait few seconds
        Thread.sleep(3000);
        //clear and enter a new value on purchase price field
        WebElement pPrice = driver.findElement(By.xpath("//*[@name='ma']"));
        //clear the purchase price
        pPrice.clear();
        //type new value on the purchase price
        pPrice.sendKeys("450000");

        //clear and enter a new value on down payment field
        WebElement dPayment = driver.findElement(By.xpath("//*[@name='dp']"));
        //clear the down payment
        dPayment.clear();
        //type new value on the purchase price
        dPayment.sendKeys("25");
        //wait for 3 seconds
        Thread.sleep(3000);
        //close the browser
        driver.quit();

    }//end of main

}//end of class
