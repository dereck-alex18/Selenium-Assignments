package pageobjects;

import foundation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumEasy extends BasePage {

    public SeleniumEasy(WebDriver driver){
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
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Form submited')]")));
        return element;
    }

    public List<WebElement> getFormsElements(){
        List<WebElement> elements = driver.findElements(By.cssSelector(".form-control"));
        return elements;
    }

    public WebElement getRadioBtnElement(){
        return driver.findElement(By.cssSelector("input[value='yes']"));
    }

    public WebElement getFormBtnSubmit(){
        return driver.findElement(By.cssSelector(".form-group:last-child div button"));
    }

    public List<WebElement> getGreenCheckIconElement(){
        return driver.findElements(By.cssSelector(".glyphicon-ok"));
    }

    public List<WebElement> getRowNameElement(){
        List<WebElement> elements = driver.findElements(By.cssSelector(".table-hover tbody tr:nth-child(1) td"));
        return elements;
    }

    public WebElement getSecondHeaderOfTaskTableElement(){
        return driver.findElement(By.cssSelector("thead tr th:nth-child(3)"));
    }

    public List<WebElement> getSecondColumnElements(){
        return driver.findElements(By.cssSelector(".table-hover tbody tr td:nth-child(3)"));
    }

    public List<WebElement> getAllAgesOfTheTableElements(){
        return driver.findElements(By.cssSelector("#example tbody tr td:nth-child(3)"));
    }



    //Atividade 27
    public List<WebElement> getLeftNavBarElements(){
        return driver.findElements(By.cssSelector(".navbar-nav:nth-child(1) li.dropdown a.dropdown-toggle"));
    }

    public List<WebElement> getExamplesMenuElements(){
        return driver.findElements(By.cssSelector(".tree-branch li.tree-branch"));
    }
}
