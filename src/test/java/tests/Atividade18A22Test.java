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

    @Test
    public void goToYoutube(){
        initProcess = new InitProcess();
        initProcess.setUrl("http://automationpractice.com");
        initProcess.setTimeout(60);
        driver = initProcess.launchBrowser();
        AutomationPracticeHome automationPracticeHome = new AutomationPracticeHome(driver);
        automationPracticeHome.nonExistingElement().click();
    }


}
