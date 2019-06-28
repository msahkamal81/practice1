package homepage;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonApi {
    @FindBy(xpath = "//*[@id=\"nav-logo\"]/a[1]/span[1]")
    WebElement Logo;

    public void showLogo(){

        Logo.isDisplayed();
    }

}
