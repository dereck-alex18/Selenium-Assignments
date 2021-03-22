package foundation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class InitProcess{

    private int timeout;
    private String url;
    private WebDriver driver;

    public InitProcess(){
        System.setProperty("webdriver.chrome.driver", "/home/dereck/Documents/chromedriver");
        this.timeout = 1;
        this.url = "http://www.google.com";
        driver = new ChromeDriver();

    }

    public void launchBrowser(){
      //  WebDriver driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(this.timeout, TimeUnit.SECONDS);
        this.driver.get(this.url);
        this.driver.manage().window().maximize();


    }

    public void setTimeout(int timeout){
        this.timeout = timeout;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public WebDriver getDriver(){
        return this.driver;
    }


}
