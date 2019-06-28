package homepage;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonApi {

    HomePage homePage;
    String url = "https://www.CNN.com/";

    @BeforeMethod
    public void init(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }


    @Test
    public void clickonPolitics(){
        homePage.clickonPolitics();
    }

    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }

}
