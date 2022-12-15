package ActionItems;

import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ActionItem6_BankOfAmerica extends Reusable_Annotations {

    @Test
    public void tc001_navigateToAutoLoanCalculator() throws InterruptedException {
        //first navigate to the Bank of America website
        driver.navigate().to("https://www.bankofamerica.com/");
        //click on the auto loans heading
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='navAutoLoans']", logger, "click on auto loans");
        //click on use the auto loan calculator
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='useAutoLoanCalculator']", logger, "click on auto loan calculator");
        logger.log(LogStatus.INFO, "Able to successful navigate to site");
    }//end of test 1

    @Test(dependsOnMethods = "tc001_navigateToAutoLoanCalculator")
    public void tc002_enterTheValuesOnCalculator() throws InterruptedException {
        //use the select command for state dropdown
        WebElement USStates = driver.findElement(By.xpath("//*[@id='stateSelectModal']"));
        Select stateDropDown = new Select(USStates);
        //select new york state from the dropdown
        stateDropDown.selectByVisibleText("New York");
        Thread.sleep(1000);
        //click on the go button to submit
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='stateSelectorSubmit']", logger, "click on go button");
//wait 1 second
        Thread.sleep(1000);
        //scroll for better view
        Reusable_Actions_Loggers.scrollByView(driver, "//*[@class='row']", 0, "scroll");
        //clear the value on total loan amount
        Reusable_Actions_Loggers.clearText(driver, "//*[@id='totalLoanAmountField']", logger, "clear loan amount");
        //wait 1 second
        Thread.sleep(1000);
        //enter $45000 for the total loan amount
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='totalLoanAmountField']", "45000", logger, "enter 45000");
        //clear the term field
        Reusable_Actions_Loggers.clearTextByIndex(driver, "//*[@id='term']", 0, logger, "clear term field");
        //wait 1 second
        Thread.sleep(1000);
        //enter 23 months for term
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='term']", "23", logger, "enter 23 months");
        //clear the interest rate field
        Reusable_Actions_Loggers.clearText(driver, "//*[@id='interestRateField']", logger, "clear interest rate field");
        //wait 1 second
        Thread.sleep(1000);
        //enter 6% interest rate
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='interestRateField']", "6", logger, "enter 6% interest rate");
    }//end of test 2

    @Test(dependsOnMethods = "tc002_enterTheValuesOnCalculator")
    public void tc003_calculateMonthlyEstimate() throws InterruptedException {
        //click on the calculate payment button
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='calculateButton']", logger, "click on calculate payment button");
        //print out the monthly cost
        String result = Reusable_Actions_Loggers.getTextAction(driver, "//*[@class='payment']", logger, "monthly cost is");
        System.out.println("Monthly cost is " + result);
        //click on apply now to start the application
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='apply_now']", logger, "click on apply now");
        Thread.sleep(2000);
        //click on the dropdown to select the right option
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='autoLoanTypeSelect']", logger, "click to choose the type of loan");
        //choose dealer purchase
        Reusable_Actions_Loggers.clickAction(driver, "//*[@value='DealerPurchase']", logger, "click on dealer purchase");
        Thread.sleep(1000);
        //click on the option: I don't have car information
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='vehicle-loan-idonthavecarinformation']", logger, "click on i don't have car information");
        Thread.sleep(1000);
        //scroll to continue
        Reusable_Actions_Loggers.scrollByView(driver, "//*[@id='continueButtonLarge']", 0, "scroll");
        //wait 2 seconds
        Thread.sleep(1000);
        //click on the continue button
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='continueButtonLarge']", logger, "click on to continue");
        //scroll to continue
        Reusable_Actions_Loggers.scrollByView(driver, "//*[contains(@class,'cancelButton active modifyDOM')]", 0, "scroll");
        //click on cancel and exit application
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='cancelButtonLarge']", logger, "exit application");
        // click on exit without saving
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='exitWithoutSavingModalButton']", logger, "close the application and return to home");

    }//end of test 3
}//end of class
