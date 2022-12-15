package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class ActionItem2_Web {
    public static void main(String[] args) throws InterruptedException {
            ArrayList<String> hobbies = new ArrayList<>();
          //  hobbies.add("baking");
            hobbies.add("surfing");
            hobbies.add("drawing");
            hobbies.add("journaling");

//define the web driver manager setup for chromedriver
            WebDriverManager.chromedriver().setup();
            //define the chrome driver to use for your test
            //creating an instance for a chrome driver(browser) to use for automation
            WebDriver driver = new ChromeDriver();

            for (int i=0; i< hobbies.size(); i++) {

                //navigate to the bing site
                driver.navigate().to("https://www.bing.com");

                //maximize my window

                driver.manage().window().maximize();

                //sleep statement
                Thread.sleep(3000);

                //search a keyword on the search field
                //relative xpath to locate the element
                driver.findElement(By.xpath("//*[@name='q']")).sendKeys(hobbies.get(i));
                //hit submit on the bing search button
                driver.findElement(By.xpath("//*[@id='sb_form']")).submit();

                //sleep statement
                Thread.sleep(3000);

                //capture the search result text
                String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
                //split message to extract out the search number
                String[] splitResult = result.split(" ");
                System.out.println("The search number for " + hobbies.get(i)  + " is " + splitResult[1]);

            }//end of for loop

            //quit the driver to end the session
            driver.quit();

        } //end of main
    }//end of class









