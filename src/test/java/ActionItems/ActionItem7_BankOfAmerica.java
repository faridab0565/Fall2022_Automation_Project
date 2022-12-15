package ActionItems;

import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ActionItem7_BankOfAmerica extends Reusable_Annotations {

    @Test
    public void tc001_navigateToShopCar() throws InterruptedException {
        //first navigate to the Bank of America website
        driver.navigate().to("https://www.bankofamerica.com/");
        //click on shop for a car heading
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='navAutoLoans']", logger, "click on auto loans");
        //click on shop for a car
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='shopForCar']", logger, "click on shop for a car");
        logger.log(LogStatus.INFO, "Able to successful navigate to site");
        Thread.sleep(2000);

    }//end of test 1

    @Test(dependsOnMethods = "tc001_navigateToShopCar")
    public void tc002_shopForaCar() throws InterruptedException {
        //use the select command for state dropdown
        WebElement USStates = driver.findElement(By.xpath("//*[@id='stateSelectModal']"));
        Select stateDropDown = new Select(USStates);
        //select new york state from the dropdown
        stateDropDown.selectByVisibleText("New York");
        //click on the go button to submit
        Thread.sleep(2000);
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='stateSelectorSubmit']", logger, "click on go button");
        Thread.sleep(1000);
//scroll to view the page better
        Reusable_Actions_Loggers.scrollByView(driver, "//*[@class='row dtZipContainer show-for-medium-up']", 0, "scroll");
        Thread.sleep(1000);
        //enter zipcode: 14221
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@name='zipCodeField']", "14221", logger, "enter zipcode ");
        //click the 'shop for your car' button
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='row dtZipContainer show-for-medium-up']", logger, "click on auto loans");
        //click on 'shop now' button on the pop-up screen
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='spa-btn spa-btn--primary spa-btn--large']", logger, "click on auto loans");
    }//end of test 2

    @Test(dependsOnMethods = "tc002_shopForaCar")
    public void tc003_filterTheSearchForCars() throws InterruptedException {
        //wait 2 seconds
        Thread.sleep(1000);
        //click on the miles dropdown
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='btn dropdown-toggle btn-default']", logger, "click on miles dropdown");
        Thread.sleep(1000);
        //select 50 miles
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='50 miles']", logger, "click on miles dropdown");
        //click on years
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='btn dropdown-toggle btn-no-decoration btn-default']", logger, "click years dropdown");
        //select 2022 models
        Thread.sleep(1000);
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='2023']", logger, "click on 2023");
//choose make
        Reusable_Actions_Loggers.clickAction(driver, "//*[@title='All Makes']", logger, "click on makes");
        Thread.sleep(1000);
        //choose mercedes
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Audi']", logger, "click on 2023");
        Thread.sleep(1000);
        //click the search button
        Reusable_Actions_Loggers.clickAction(driver, "//*[@type='submit']", logger, "click on search");
        Thread.sleep(1000);
        //print out the one car
        String result = Reusable_Actions_Loggers.getTextAction(driver, "//*[@class='inventory-title single-line-text my-2']", logger, "the car is");
        System.out.println("The car is " + result);

    }//end of test 3


}//end of class
