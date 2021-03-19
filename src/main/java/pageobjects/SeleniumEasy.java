package pageobjects;

import foundation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumEasy extends BasePage {

    public  SeleniumEasy(WebDriver driver){
        super(driver);
    }

    public WebElement getNameFieldElement(){
        return driver.findElement(By.cssSelector(".form-group #title"));
    }

    public WebElement getCommentFieldElement(){
        return driver.findElement(By.cssSelector(".form-group #description"));
    }

    public WebElement getBtnSubmitElement(){
        return driver.findElement(By.cssSelector("#btn-submit"));
    }

    public WebElement getSubmitMessageElement(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#submit-control")));
        return element;
    }

}
