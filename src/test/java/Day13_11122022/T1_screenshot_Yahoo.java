package Day13_11122022;

import Reusable_Library.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T1_screenshot_Yahoo extends Reusable_Annotations {
    @Test(priority = 1)
    public void tc001_verifySignedInOptionIsChecked() {
        //first navigate to yahoo homepage
        driver.navigate().to("https://www.yahoo.com/");
        //next we need to click on sign in button
        //this will fail because the xpath is incorrect(screenshot would be attached to the report)
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class = '_yb_1933eyyy']", logger, "Sign In");
        //we need to verify that signed in option is checked
        boolean isSignInChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        System.out.println("The checkbox check condition is: " + isSignInChecked);
        logger.log(LogStatus.INFO, "The checkbox check condition is " + isSignInChecked);
    }//end of test 1
}//end of class
