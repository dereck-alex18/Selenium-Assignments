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
    private InitProcess initProcess;
    private AutomationPracticeHome automationPracticeHome;
    private SeleniumEasy seleniumEasy;

    @BeforeEach
    public void setup(){
        initProcess = new InitProcess();
        driver = initProcess.getDriver();
        seleniumEasy = new SeleniumEasy(driver);
        automationPracticeHome = new AutomationPracticeHome(driver);

    }

 //   Atividade 18
    @Test
    public void nonExistingElement1minuteTest(){
        initProcess.setUrl("http://automationpractice.com");
        initProcess.setTimeout(60);
        initProcess.launchBrowser();
        automationPracticeHome.nonExistingElement().click();
    }

    //Atividade 19
    @Test
    public void nonVisibleElement30SecondsTest(){
        initProcess.setUrl("http://automationpractice.com");
        initProcess.setTimeout(30);
        initProcess.launchBrowser();
        automationPracticeHome.nonVisibleElement().click();
    }

    //Atividade 20
    @Test
    public void visibleElement5MinutesTest(){
        initProcess.setUrl("http://automationpractice.com");
        initProcess.setTimeout(300);
        initProcess.launchBrowser();
        automationPracticeHome.visibleElement().click();
    }

    //Atividade 21
    @Test
    public void nonvisibleElement5SecondsExplicitWaitTest(){
        initProcess.setUrl("http://automationpractice.com");
        initProcess.launchBrowser();
        automationPracticeHome.nonVisibleElementExplicitWait().click();
    }

    //Atividade 22
    @Test
    public void printSubmitMessageInConsole(){
        initProcess.setUrl("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
        initProcess.launchBrowser();
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
