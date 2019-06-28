package homePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage {


    @Test
    public void sum() {

        System.out.println("sum");

        int a = 10;
        int b = 20;
        Assert.assertEquals(30, a + b);
    }
}


