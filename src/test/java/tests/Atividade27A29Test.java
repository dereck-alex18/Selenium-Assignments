package tests;

import foundation.InitProcess;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageobjects.AutomationPracticeHome;
import pageobjects.SeleniumEasy;

public class Atividade27A29Test{

    private WebDriver driver;
    private InitProcess initProcess;
    private AutomationPracticeHome automationPracticeHome;

    @BeforeEach
    public void setup(){
        initProcess = new InitProcess();
        driver = initProcess.getDriver();
        automationPracticeHome = new AutomationPracticeHome(driver);
        initProcess.setTimeout(5);
    }

    //Activity 27 can be found in the SeleniumEasy.java file. Scroll to the very bottom, there you will find the 2 page objects asked in the activity

    //Activity 28 is already done since the whole project was made in page objects

    //Atividade 29
    @Test
    public void searchForAnElementTest(){
        String productName = "";

        initProcess.setUrl("http://automationpractice.com/index.php");
        initProcess.launchBrowser();

        automationPracticeHome.getSearchBarElement().sendKeys("Blouse", Keys.ENTER);
        productName = automationPracticeHome.getSearchedProductElement().getText();

        Assert.assertEquals("Blouse", productName);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
