package homepage;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonApi {

@FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[3]")
    WebElement Politics;

public void clickonPolitics(){
    Politics.click();

  }



}
