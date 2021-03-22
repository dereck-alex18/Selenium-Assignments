package tests;

import foundation.InitProcess;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.AutomationPracticeHome;
import pageobjects.SeleniumEasy;

public class Atividade23A26Test{

    private WebDriver driver;
    private InitProcess initProcess = new InitProcess();

    @BeforeEach
    public void setup(){
        driver = initProcess.getDriver();
        initProcess.setTimeout(5);
    }

   // Atividade 23
    @Test
    public void fillTheFormAndSubmit(){
        String[] formData = {"Dereck", "Portela", "email@dummy.com", "3235556439", "Diamond Bar", "Los Angeles",
        "California", "21312312", "www.test.com", "description"
        };


        initProcess.setUrl("https://www.seleniumeasy.com/test/input-form-demo.html");
        initProcess.launchBrowser();
        SeleniumEasy seleniumEasy = new SeleniumEasy(driver);

        for (int i = 0; i < seleniumEasy.getFormsElements().size(); i++){
            seleniumEasy.getFormsElements().get(i).sendKeys(formData[i]);
        }

        seleniumEasy.getRadioBtnElement().click();
        seleniumEasy.getFormBtnSubmit().click();

        if(seleniumEasy.getGreenCheckIconElement().size() == 0){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }

    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

}
