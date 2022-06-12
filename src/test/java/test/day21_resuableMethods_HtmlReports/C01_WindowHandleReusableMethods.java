package test.day21_resuableMethods_HtmlReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utulities.Driver;
import utulities.ReusableMethods;

import java.util.Set;

public class C01_WindowHandleReusableMethods {
    @Test
    public void test01() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfamWH = Driver.getDriver().getWindowHandle();
        //          ● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> windowHandleSeti = Driver.getDriver().getWindowHandles();

        String ikinciSayfaWH = "";
        for (String each : windowHandleSeti
        ) {
            if (!each.equals(ilkSayfamWH)) {
                ikinciSayfaWH = each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWH);

        System.out.println(Driver.getDriver().getTitle());
        // acilan yeni tab'in title'nin "New Window" oldugunu test edin
        String expectedTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
        Driver.getDriver();
    }

    @Test
    public void Test02() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //          ● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        // acilan yeni tab'in title'nin "New Window" oldugunu test edin
        ReusableMethods.switchToWindow("New Window");

        Driver.closeDriver();
    }

    }

