package foundation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class InitProcess{

    private int timeout;
    private String url;

    public InitProcess(){
        this.timeout = 10;
        this.url = "http://www.google.com";
    }

    public WebDriver launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "/home/dereck/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(this.timeout, TimeUnit.SECONDS);
        driver.get(this.url);
        driver.manage().window().maximize();

        return driver;

    }

    public void setTimeout(int timeout){
        this.timeout = timeout;
    }

    public void setUrl(String url){
        this.url = url;
    }

//    public WebDriver getDriver(){
//        return driver;
//    }


}
