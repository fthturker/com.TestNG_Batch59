


import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.TradllyinPage;
import utulities.ConfigReader;
import utulities.Driver;




public class Denemeler  {
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

        //6- Vendor "add new "butonuna tiklanir
        tradllyinPage.addNew.click();

        //7- Vendor "limit" butonuna tiklanir
        tradllyinPage.limit.sendKeys(Keys.ARROW_DOWN);

        //tradllyinPage.limit.click();
        tradllyinPage.limit.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        //8- Vendor "Usage limit per coupon" limiti bilgileri eklenebilir


        Driver.closeDriver();

    }
}