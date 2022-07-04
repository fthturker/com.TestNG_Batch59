import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_15_16_Page;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReusableMethods;
import utulities.TestBaseRapor;

import java.io.IOException;


public class US15_01_02_03 extends TestBaseRapor {
    US_15_16_Page us_15_16_page = new US_15_16_Page();

    @Test
    public void US15_TC_01_02_03() throws InterruptedException, IOException {

        Driver.getDriver().get(ConfigReader.getProperty("tradllyinnUrl"));
        extentTest=extentReports.createTest("US15_TC_01_02_03","Gecerli email ve sifre ile giris yapabildi");
        us_15_16_page.myAccount.click();
        extentTest.pass("My Account butonu erisilebildi");

        us_15_16_page.username.sendKeys(ConfigReader.getProperty("tradllyinnEmail"));
        us_15_16_page.password.sendKeys(ConfigReader.getProperty("tradllyinnPassword"));
        ReusableMethods.waitFor(1);
        us_15_16_page.login.sendKeys(Keys.ENTER);
        extentTest.pass("Vendor bu bilgilerle Login butonu erisebildi");
        us_15_16_page.storeManager.click();
        extentTest.pass("Store Manger butonu erisilebildi");
        us_15_16_page.coupons.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(10);
        extentTest.info("Coupons butonu erisilebildi");
        us_15_16_page.addNew.click();
        extentTest.info("add new butonu erisilebildi");
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        us_15_16_page.limit.click();
        extentTest.info("limit butonu erisilebildi");
        us_15_16_page.usageLimitCoupon.sendKeys("5");
        Assert.assertTrue(us_15_16_page.usageLimitCoupon.getAttribute("value").equals("5"));
        extentTest.info("limit bilgileri eklenebildi");
        Thread.sleep(2000);
        extentReports.createTest("kupon basina kullanim limiti eklenebilir");
        us_15_16_page.usLimitItems.sendKeys("15");
        Assert.assertTrue(us_15_16_page.usLimitItems.getAttribute("value").equals("15"));
        Thread.sleep(2000);
        extentReports.createTest("kullanimi belirlenen urunlerle uygulanabildi");
        us_15_16_page.perUser.sendKeys("10");
        Thread.sleep(2000);
        Assert.assertTrue(us_15_16_page.perUser.getAttribute("value").equals("10"));
        extentReports.createTest("kullanici basina kullanim siniri uygulanabildi");
        ReusableMethods.getScreenshot("Limit uygulama");
        Driver.closeDriver();

    }
}