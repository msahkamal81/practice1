package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonApi {

    public WebDriver driver = null;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }



}
