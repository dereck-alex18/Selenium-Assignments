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

import java.util.List;

public class Atividade23A26Test{

    private WebDriver driver;
    private InitProcess initProcess;
    private SeleniumEasy seleniumEasy;

    @BeforeEach
    public void setup(){
        initProcess = new InitProcess();
        driver = initProcess.getDriver();
        seleniumEasy = new SeleniumEasy(driver);
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

    //Atividade 24
    @Test
    public void printRowNamesTest(){
        String rowName = "";

        initProcess.setUrl("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        initProcess.launchBrowser();
        List <WebElement> elements = seleniumEasy.getRowNameElement();

        for (int i = 0; i < elements.size() - 1; i++){
            rowName += elements.get(i).getText() + " ";
        }

        rowName += elements.get(elements.size() - 1).getText();
        Assert.assertEquals("1 Wireframes John Smith in progress", rowName);

    }

    //Atividade 25
    @Test
    public void printColumnNamesTest(){
        String columnName = "";

        initProcess.setUrl("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        initProcess.launchBrowser();
        WebElement secondHeader = seleniumEasy.getSecondHeaderOfTaskTableElement();
        List <WebElement> elements = seleniumEasy.getSecondColumnElements();

        columnName = secondHeader.getText() + " ";
        for (int i = 0; i < elements.size() - 1; i++){
            columnName += elements.get(i).getText() + " ";
        }

        columnName += elements.get(elements.size() - 1).getText();
        Assert.assertEquals("Assignee John Smith Mike Trout Loblab Dan Emily John Holden Charles Jane Doe Kilgore Trout", columnName);
    }

    //Atividade 26
    @Test
    public void checkIfThereAre4SanFranciscoInTheTableTest(){
        int counter = 0;

        initProcess.setUrl("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
        initProcess.launchBrowser();

        List <WebElement> elements = seleniumEasy.getAllAgesOfTheTableElements();

        for (int i = 0; i < elements.size(); i++){
            if(elements.get(i).getText().equalsIgnoreCase("San Francisco")){
                counter++;
            }
        }
        Assert.assertEquals(4, counter);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

}
