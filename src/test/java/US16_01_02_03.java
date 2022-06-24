
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradllyinPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReusableMethods;

public class US16_01_02_03 {

        TradllyinPage tradllyinPage=new TradllyinPage();

        @Test
        public void TestCase01() throws InterruptedException {


            //1-Siteye git:https://tradylinn.com/ gidilebilir
            Driver.getDriver().get(ConfigReader.getProperty("tradllyinnUrl"));

            //2 -Vendor "My Account" butonuna tiklanir
            tradllyinPage.myAccount.click();

            //3- Vendor "username or email address" ve "password" bilgileri girer ve "login" butonuna tiklanir
            tradllyinPage.username.sendKeys(ConfigReader.getProperty("tradllyinnEmail"));
            tradllyinPage.password.sendKeys(ConfigReader.getProperty("tradllyinnPassword"));
            tradllyinPage.login.sendKeys(Keys.ENTER);

            //4-Vendor "Store Manager" butonuna tiklanir
            tradllyinPage.storeManager.click();

            //5-Vendor "customers" butonuna tiklanir
            Thread.sleep(3000);
            Actions actions=new Actions(Driver.getDriver());
            actions.sendKeys(Keys.PAGE_DOWN).perform();

            tradllyinPage.customers.click();
            Thread.sleep(3000);
            //6- kayitli kisinin son siparisi gorulebilmeli

            //Assert.assertFalse(tradllyinPage.sonSiparis.isDisplayed());

            Driver.closeDriver();
        }
    }

