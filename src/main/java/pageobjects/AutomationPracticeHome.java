package pageobjects;

import foundation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutomationPracticeHome extends BasePage {

   public  AutomationPracticeHome(WebDriver driver){
       super(driver);
   }

   public WebElement nonExistingElement(){
       return driver.findElement(By.cssSelector("#non_existing_element"));
   }

   public WebElement nonVisibleElement(){
       return driver.findElement(By.cssSelector("#block_top_menu .submenu-container"));
   }

   public WebElement visibleElement(){
       return driver.findElement(By.cssSelector("#block_top_menu .menu-content"));
   }

    public WebElement nonVisibleElementExplicitWait(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#block_top_menu .submenu-container")));
        return element;
    }

    public WebElement getSearchBarElement(){
       return driver.findElement(By.cssSelector("#search_query_top"));
    }

    public WebElement getSearchedProductElement(){
       return driver.findElement(By.cssSelector("h5[itemprop='name'] a[title='Blouse']"));
    }

}
