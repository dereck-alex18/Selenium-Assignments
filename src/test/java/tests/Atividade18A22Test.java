package tests;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import foundation.BasePage;
import foundation.InitProcess;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.AutomationPracticeHome;

import java.sql.Driver;


public class Atividade18A22Test{

    private WebDriver driver;
    private InitProcess initProcess;


    @Before
    public void setup(){


    }

    //Atividade 18
    @Test
    public void nonExistingElement1minuteTest(){
        initProcess = new InitProcess();
        initProcess.setUrl("http://automationpractice.com");
        initProcess.setTimeout(60);
        driver = initProcess.launchBrowser();
        AutomationPracticeHome automationPracticeHome = new AutomationPracticeHome(driver);
        automationPracticeHome.nonExistingElement().click();
    }

    //Atividade 19
    @Test
    public void nonVisibleElement30SecondsTest(){
        initProcess = new InitProcess();
        initProcess.setUrl("http://automationpractice.com");
        initProcess.setTimeout(30);
        driver = initProcess.launchBrowser();
        AutomationPracticeHome automationPracticeHome = new AutomationPracticeHome(driver);
        automationPracticeHome.nonVisibleElement().click();
    }

    //Atividade 20
    @Test
    public void visibleElement5MinutesTest(){
        initProcess = new InitProcess();
        initProcess.setUrl("http://automationpractice.com");
        initProcess.setTimeout(3);
        driver = initProcess.launchBrowser();
        AutomationPracticeHome automationPracticeHome = new AutomationPracticeHome(driver);
        automationPracticeHome.visibleElement().click();
    }

    //Atividade 21
    @Test
    public void nonvisibleElement5SecondsExplicitWaitTest(){
        initProcess = new InitProcess();
        initProcess.setUrl("http://automationpractice.com");
        initProcess.setTimeout(3);
        driver = initProcess.launchBrowser();
        AutomationPracticeHome automationPracticeHome = new AutomationPracticeHome(driver);
        automationPracticeHome.nonVisibleElementExplicitWait().click();
    }


}
