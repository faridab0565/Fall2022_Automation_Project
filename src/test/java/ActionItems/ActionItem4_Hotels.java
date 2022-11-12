package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class ActionItem4_Hotels {
    public static void main(String[] args) throws InterruptedException {

        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();

        //initialize chrome options
        ChromeOptions options = new ChromeOptions();

// add the options for maximizing the chrome meeting
// options.addArguments("start-fullscreen") for mac
        options.addArguments("start-maximized");

        //define the chrome driver to use for your test
//creating an instance for a chrome driver(browser) to use for automation
        WebDriver driver = new ChromeDriver(options);

        //array list of adults
        ArrayList<Integer> adult = new ArrayList<>();
        adult.add(2);
        adult.add(3);
        adult.add(4);
        //array list of adults
        ArrayList<String> destination = new ArrayList<>();
        destination.add("New york");
        destination.add("California");
        destination.add("Florida");

        for (int i=0; i < destination.size(); i++) {

//navigate to hotel.com
            driver.navigate().to("https://www.hotels.com/");

            Thread.sleep(2000);

            try {
                //click on the location
                WebElement location = driver.findElement(By.xpath("//*[@class='uitk-fake-input uitk-form-field-trigger']"));
                location.click();
                driver.findElement(By.xpath("//*[@id='destination_form_field']")).sendKeys(destination.get(0));
                Thread.sleep(2000);
                //click on dorp down
                driver.findElements(By.xpath("//*[@class='is-subText truncate']")).get(0).click();
            } catch (Exception e) {
                System.out.println("destination error " + e);
            }//catch

            Thread.sleep(3000);
            //click on travellers
            driver.findElement(By.xpath("//*[@class='uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']")).click();

            //reduce the adult number by1
            driver.findElement(By.xpath("//*[@class='uitk-icon uitk-step-input-icon uitk-icon-medium']")).click();
            Thread.sleep(2000);
            //adding 1 to adult
            driver.findElements(By.xpath("//*[@class='uitk-icon uitk-step-input-icon uitk-icon-medium']")).get(1).click();

            //click on child to add 1
            driver.findElements(By.xpath("//*[@class='uitk-icon uitk-step-input-icon uitk-icon-medium']")).get(3).click();

            try {
                //click on dropdown for child by select
                WebElement childAge = driver.findElement(By.xpath("//*[@name='child-traveler_selector_children_age_selector-0-0']"));
                //childAge.click();
                Thread.sleep(2000);
                Select childageDp = new Select(childAge);
                childageDp.selectByVisibleText("3");

            } catch (Exception e) {
                System.out.println("child error  " + e);
            }

            Thread.sleep(3000);
            //click done
            driver.findElement(By.xpath("//*[@id='traveler_selector_done_button']")).click();
            Thread.sleep(2000);
            //click search
            driver.findElement(By.xpath("//*[@id='submit_button']")).click();
            //*[@class="uitk-icon uitk-icon-leading uitk-icon-medium"]
            Thread.sleep(2000);
            //click on package
            driver.findElements(By.xpath("//*[@class='uitk-image-link']")).get(0).click();

            //store tabs
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            //switch to new tab
            driver.switchTo().window(tabs.get(1));
            Thread.sleep(2000);
            String resortName = driver.findElements(By.xpath("//*[@class='uitk-heading uitk-heading-3']")).get(0).getText();
            System.out.println(resortName);

            //wait 2 seconds
            Thread.sleep(2000);
            //click on reserve a room button
            driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']")).click();
            //wait 2 seconds
            Thread.sleep(2000);

            //define javascript executor to scroll
            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            //scroll to reserve button
            WebElement scrollView = driver.findElement(By.xpath("//*[@class= 'uitk-heading uitk-heading-7 uitk-layout-flex-item']"));
            //scroll into extras
            scroll.executeScript("arguments[0].scrollIntoView(true);", scrollView);

            //print out the first price per night
            String price = driver.findElement(By.xpath("//*[@class='uitk-text uitk-type-600 uitk-type-bold uitk-text-emphasis-theme']")).getText();
            System.out.println(price);

//wait 2 seconds
            Thread.sleep(2000);
            //click on the reserve now button
            driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-primary']")).click();
//wait 2 seconds
            Thread.sleep(2000);

            //scroll to view the check in/out dates
            WebElement scrollCheckIn = driver.findElement(By.xpath("//*[@class= 'col-description va-t pv-tiny']"));
            //scroll into extras to view the price better
            scroll.executeScript("arguments[0].scrollIntoView(true);", scrollCheckIn);

            //print out the check in and out date.
            String dates = driver.findElement(By.xpath("//*[@class= 'travel-details w-full table-bc-s ph-base mt-mouse mb-tiny']")).getText();
            System.out.println(dates);

            //wait 2 seconds
            Thread.sleep(2000);
            //close the second tab
            driver.close();
            //switch to the initial tab (parent tab)
            driver.switchTo().window(tabs.get(0));

        } //end of for loop
        driver.quit();
    }//main
}//end of class
