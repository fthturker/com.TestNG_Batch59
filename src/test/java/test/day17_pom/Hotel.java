package test.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import pages.HotelPage;
import utulities.Driver;

public class Hotel {
    @Test
    public void test01() {
        HotelPage hotelPage=new HotelPage();

        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        // login butonuna bas
        hotelPage.loginButon.click();
        // test data username gir
        hotelPage.username.sendKeys("manager"+ Keys.TAB);
        // test data password gir
        hotelPage.password.sendKeys("Manager1!"+Keys.TAB);
        // Log in butonuna bas
        hotelPage.loginInButon.click();

        // degerleri girildiginde sayfaya basarili bir sekilde girildigini test et
        Assert.assertTrue(hotelPage.titlePage.isDisplayed());

        Driver.closeDriver();
    }
}