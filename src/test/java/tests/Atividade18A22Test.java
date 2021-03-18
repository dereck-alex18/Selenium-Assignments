package tests;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import foundation.BasePage;
import foundation.InitProcess;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;


public class Atividade18A22Test{

    private WebDriver driver;

    @Test
    public void goToYoutube(){
        InitProcess initProcess = new InitProcess();
        initProcess.setUrl("https://www.google.com");
        driver = initProcess.launchBrowser();

        driver.findElement(By.name("q")).sendKeys("test");
    }


}
