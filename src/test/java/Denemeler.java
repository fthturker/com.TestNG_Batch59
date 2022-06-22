
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.TradllyinPage;
import utulities.ConfigReader;
import utulities.Driver;


public class Denemeler  {
    TradllyinPage tradllyinPage=new TradllyinPage();

    @Test
    public void positiveLoginTest() {


        //1- Siteye git:https://tradylinn.com/ gidilebilir
        Driver.getDriver().get(ConfigReader.getProperty("tradllyinnUrl"));
        //2 -Vendor "My Account" butonuna tiklanir
        tradllyinPage.myAccount.click();
        //3- Vendor "username or email address" ve "password" bilgileri girer ve "login" butonuna tiklanir
        Actions actions = new Actions(Driver.getDriver());


        tradllyinPage.username.sendKeys("tradllyinnUsername");
        tradllyinPage.password.sendKeys("tradllyinnPassword");

        tradllyinPage.login.click();

        //4-Vendor "Store Manager" butonuna tiklanir
        //5-Vendor "Coupons" butonuna tiklanir
        //6- Vendor "add new "butonuna tiklanir
        //7- Vendor "limit" butonuna tiklanir
        //8- Vendor "Usage limit per coupon" limiti bilgileri eklenebilir


    }
}