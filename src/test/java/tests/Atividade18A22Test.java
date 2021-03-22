package tests;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import foundation.BasePage;
import foundation.InitProcess;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.AutomationPracticeHome;
import pageobjects.SeleniumEasy;

import java.sql.Driver;


public class Atividade18A22Test{

    private WebDriver driver;
    private InitProcess initProcess = new InitProcess();

    @BeforeEach
    public void setup(){
        driver = initProcess.getDriver();
    }

 //   Atividade 18
    @Test
    public void nonExistingElement1minuteTest(){

        initProcess.setUrl("http://automationpractice.com");
        initProcess.setTimeout(6);
        initProcess.launchBrowser();
        AutomationPracticeHome automationPracticeHome = new AutomationPracticeHome(driver);
        automationPracticeHome.nonExistingElement().click();
    }

    //Atividade 19
    @Test
    public void nonVisibleElement30SecondsTest(){

        initProcess.setUrl("http://automationpractice.com");
        initProcess.setTimeout(3);
        initProcess.launchBrowser();
        AutomationPracticeHome automationPracticeHome = new AutomationPracticeHome(driver);
        automationPracticeHome.nonVisibleElement().click();
    }

    //Atividade 20
    @Test
    public void visibleElement5MinutesTest(){

        initProcess.setUrl("http://automationpractice.com");
        initProcess.setTimeout(3);
        initProcess.launchBrowser();
        AutomationPracticeHome automationPracticeHome = new AutomationPracticeHome(driver);
        automationPracticeHome.visibleElement().click();
    }

    //Atividade 21
    @Test
    public void nonvisibleElement5SecondsExplicitWaitTest(){
        initProcess.setUrl("http://automationpractice.com");
        initProcess.launchBrowser();
        AutomationPracticeHome automationPracticeHome = new AutomationPracticeHome(driver);
        automationPracticeHome.nonVisibleElementExplicitWait().click();
    }

    //Atividade 22
    @Test
    public void printSubmitMessageInConsole(){
        initProcess.setUrl("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
        initProcess.launchBrowser();
        SeleniumEasy seleniumEasy = new SeleniumEasy(driver);
        seleniumEasy.getNameFieldElement().sendKeys("Dereck Portela");
        seleniumEasy.getCommentFieldElement().sendKeys("This is a comment");
        seleniumEasy.getBtnSubmitElement().click();
        System.out.println(seleniumEasy.getSubmitMessageElement().getText());
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

}
