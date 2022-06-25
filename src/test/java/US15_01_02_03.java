import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradllyinPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReusableMethods;


public class US15_01_02_03 {
    TradllyinPage tradllyinPage=new TradllyinPage();

    @Test
    public void positiveLoginTest() throws InterruptedException {


        //1- Siteye git:https://tradylinn.com/ gidilebilir
        Driver.getDriver().get(ConfigReader.getProperty("tradllyinnUrl"));

        //2 -Vendor "My Account" butonuna tiklanir
        tradllyinPage.myAccount.click();

        //3- Vendor "username or email address" ve "password" bilgileri girer ve "login" butonuna tiklanir
        tradllyinPage.username.sendKeys(ConfigReader.getProperty("tradllyinnEmail"));
        tradllyinPage.password.sendKeys(ConfigReader.getProperty("tradllyinnPassword"));
        tradllyinPage.login.sendKeys(Keys.ENTER);

        //4-Vendor "Store Manager" butonuna tiklanir
        tradllyinPage.storeManager.click();

        //5-Vendor "Coupons" butonuna tiklanir
        tradllyinPage.coupons.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(10);
        //6- Vendor "add new "butonuna tiklanir
        tradllyinPage.addNew.click();

        //7- Vendor "limit" butonuna tiklanir


        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        tradllyinPage.limit.click();



        //8- Vendor "Usage limit per coupon" limiti bilgileri eklenebilir

        //action.sendKeys(Keys.TAB);
        tradllyinPage.usageLimitCoupon.sendKeys("5");
        tradllyinPage.usLimitItems.sendKeys("5");
        tradllyinPage.perUser.sendKeys("5");

        Assert.assertTrue(tradllyinPage.usageLimitCoupon.getAttribute("value").contains("5"));
        Assert.assertTrue(tradllyinPage.usLimitItems.getAttribute("value").contains("5"));
        Assert.assertTrue(tradllyinPage.perUser.getAttribute("value").contains("5"));
        //Driver.closeDriver();



    }
}