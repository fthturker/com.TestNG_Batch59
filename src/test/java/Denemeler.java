

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utulities.Driver;
import utulities.TestBase;

import java.util.List;


public class Denemeler  {

    @Test
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");
        /*
        Bugune kadar TestBase class'ina extends ederek kullandigimiz driver yerine
        bundan sonra Driver class'indan kullanacagimiz getDriver static method'unu kullanacagiz

        Driver.getDriver()    in
        driver                out
         */
        Driver.closeDriver();
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.facebook.com");
        Driver.closeDriver();
    }
}
