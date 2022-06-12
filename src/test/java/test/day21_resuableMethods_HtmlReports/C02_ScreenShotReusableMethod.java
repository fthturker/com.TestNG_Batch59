package test.day21_resuableMethods_HtmlReports;

import org.testng.annotations.Test;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReusableMethods;

import java.io.IOException;

public class C02_ScreenShotReusableMethod {
    @Test
    public void test01() throws IOException {
        //amazon sayfasina gidip fotografini cekelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.getScreenshot("amazon");

    }
}
