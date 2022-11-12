package ActionItems;

import Reusable_Library.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActionItem5_UHC {
    WebDriver driver;

    @BeforeSuite
    public void setChromeDriver() {
        driver = Reusable_Actions.setUpDriver();
    }//end of set driver method

    @AfterSuite
    public void quitTheSession() {
        //  driver.quit();
    }//end of after suite

    @Test
    public void findDentist() throws InterruptedException {
        //navigate to the website
        driver.navigate().to("https://www.UHC.com");
        //wait
        //  Thread.sleep(2000);
        //click on find a doctor
        Reusable_Actions.clickAction(driver, "//*[@aria-label='Find a doctor']", "Find a doctor");
        //Thread.sleep(3000);
        //click no on popup if it appears
        Reusable_Actions.clickAction(driver, "//*[@id='ip-no']", "clickPopUp");
        //scroll to view to find a doctor
        Reusable_Actions.scrollByView(driver, "//*[@id='main-content']", 0, "main content");
        //Thread.sleep(3000);
        //click on find a dentist
        Reusable_Actions.clickAction(driver, "//*[text()='Find a dentist']", " Find a dentist ");
        // Thread.sleep(3000);
        //switch tabs
        Reusable_Actions.switchTab(driver, 1);
        //reload the site
        // driver.navigate().refresh();
        //click on employer and individual plan
        Reusable_Actions.clickAction(driver, "//*[text()='Employer and Individual Plans']", "Employer and Individual Plans");
        //Thread.sleep(3000);
    }//end of test 1

    @Test
    public void zipCode() throws InterruptedException {
        //input zipcode
        Reusable_Actions.sendKeysAction(driver, "//*[@id='location']", "14226", "Zipcode");
        //wait
        Thread.sleep(1000);
        //click on continue to submit zip
        Reusable_Actions.clickAction(driver, "//*[text()='Continue']", "click on continue");
        //wait
        Thread.sleep(3000);
        //click on national options
        Reusable_Actions.clickAction(driver, "//*[text()='*National Options PPO 30']", "click on National options");
        Thread.sleep(3000);
        //reload the site
        driver.navigate().refresh();
        //reload the site
        driver.navigate().refresh();
        //click on general dentist
        Reusable_Actions.clickAction(driver, "//*[@id='nodeDescription1']", "click on general dentist");

    }//end of test 2

    @Test
    public void test3() throws InterruptedException {
        Reusable_Actions.selectByTextAction(driver, "//*[@id='distance']", 0, "Within 50 Miles", "clicks miles dropdown on general dentist page ");
        //class="radiusMiles ng-valid ng-not-empty ng-touched ng-dirty ng-valid-parse ally-focus-within"
        Thread.sleep(3000);
        Reusable_Actions.clickActionByIndex(driver, "//*data-test-id='provider-name-link']", 0, "miles dropdown on general dentist page ");
        //click on save button
        Reusable_Actions.clickActionByIndex(driver, "//*[data-test-id='saved-provider-button']", 0, "save button");
        //capture address, miles, and network
        String info = Reusable_Actions.getTextAction(driver, "//*[@class='outer-container tbl']", "Address, Miles, and Network");
        //print the info
        System.out.println(info);
        //close the tab
        driver.close();

    }//test of 3

    @Test
    public void doctor() throws InterruptedException {
        //switch to the default tab
        Reusable_Actions.switchTab(driver, 0);
        //navigate back to the website
        driver.navigate().to("https://www.UHC.com");
        Thread.sleep(3000);



    }//end of test 4


}//end of java class
