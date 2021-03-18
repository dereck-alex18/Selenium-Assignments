package pageobjects;

import foundation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPracticeHome extends BasePage {

   public  AutomationPracticeHome(WebDriver driver){
       super(driver);
   }

   public WebElement nonExistingElement(){
       return driver.findElement(By.cssSelector("#non_existing_element"));
   }

}
