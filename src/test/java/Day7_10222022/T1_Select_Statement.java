package Day7_10222022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_Select_Statement {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();

        //initialize chrome options
        ChromeOptions options = new ChromeOptions();

        // add the options for maximizing the chrome meeting
        // options.addArguments("start-fullscreen") for mac
        options.addArguments("start-fullscreen");

        //define the chrome driver to use for your test
        //creating an instance for a chrome driver(browser) to use for automation
        WebDriver driver = new ChromeDriver(options);

        //navigate to mlcalc
        driver.navigate().to("https://www.mlcalc.com");

        //sleep statement
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text()='Show advanced options']")).click();

        Thread.sleep(2000);

        //use the select command for month dropdown
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='sm']"));
        Select startMonthDropDown = new Select(startMonth);
        //select by visible text
        startMonthDropDown.selectByVisibleText("Nov");

//        //use the select command for month dropdown
//        WebElement startYear = driver.findElement(By.xpath("//*[@name='sy']"));
//        Select startYearDropDown = new Select(startYear);
//        //select by visible text
//        startYearDropDown.selectByVisibleText("2023");


        //example using click and text
        driver.findElement(By.xpath("//*[@name='sy']")).click();
        driver.findElement(By.xpath("//*[text()='2023']")).click();















    }//end of main













}//end of java class
