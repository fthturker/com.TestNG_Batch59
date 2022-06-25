
import com.github.javafaker.Faker;
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

    TradllyinPage tradllyinPage = new TradllyinPage();

    @Test
    public void TestCase01() throws InterruptedException {


        //1-Siteye git:https://tradylinn.com/ gidilebilir
        Driver.getDriver().get(ConfigReader.getProperty("tradllyinnUrl"));

        //2 -Vendor "My Account" butonuna tiklanir
        tradllyinPage.myAccount.click();

        //3- Vendor "username or email address" ve "password" bilgileri girer ve "login" butonuna tiklanir
        tradllyinPage.username.sendKeys(ConfigReader.getProperty("tradllyinnEmail"));
        tradllyinPage.password.sendKeys(ConfigReader.getProperty("tradllyinnPassword"));
        tradllyinPage.login.click();

        //4-Vendor "Store Manager" butonuna tiklanir
        //tradllyinPage.storeManager.sendKeys(Keys.ENTER);

        //5-Vendor "customers" butonuna tiklanir
        //Thread.sleep(3000);
        //Actions actions=new Actions(Driver.getDriver());
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        //tradllyinPage.customers.sendKeys(Keys.ENTER);


        //6- kayitli kisinin son siparisi gorulebilmeli


        //Assert.assertFalse(tradllyinPage.sonSiparis.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void TestCase02() throws InterruptedException {

        //1-Siteye git:https://tradylinn.com/ gidilebilir
        Driver.getDriver().get(ConfigReader.getProperty("tradllyinnUrl"));

        //2 -Vendor "My Account" butonuna tiklanir
        tradllyinPage.myAccount.click();

        //3- Vendor "username or email address" ve "password" bilgileri girer ve "login" butonuna tiklanir
        tradllyinPage.username.sendKeys(ConfigReader.getProperty("tradllyinnEmail"));
        tradllyinPage.password.sendKeys(ConfigReader.getProperty("tradllyinnPassword"));
        tradllyinPage.login.click();

        //4-Vendor "Store Manager" butonuna tiklanir
        tradllyinPage.storeManager.sendKeys(Keys.ENTER);

        //5-Vendor "customers" butonuna tiklanir
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradllyinPage.customers.sendKeys(Keys.ENTER);

        //6- kayitli kisilerin bilgileri "pdf" "excell" ve "csa" olarak tiklanir
        tradllyinPage.printButon.click();
        tradllyinPage.excelButon.click();
        tradllyinPage.csaButon.click();
    }

    @Test
    public void TestCase03() throws InterruptedException {

        //1-Siteye git:https://tradylinn.com/ gidilebilir
        Driver.getDriver().get(ConfigReader.getProperty("tradllyinnUrl"));

        //2 -Vendor "My Account" butonuna tiklanir
        tradllyinPage.myAccount.click();

        //3- Vendor "username or email address" ve "password" bilgileri girer ve "login" butonuna tiklanir
        tradllyinPage.username.sendKeys(ConfigReader.getProperty("tradllyinnEmail"));
        tradllyinPage.password.sendKeys(ConfigReader.getProperty("tradllyinnPassword"));
        tradllyinPage.login.click();

        //4-Vendor "Store Manager" butonuna tiklanir
        tradllyinPage.storeManager.sendKeys(Keys.ENTER);

        //5-Vendor "customers" butonuna tiklanir
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradllyinPage.customers.sendKeys(Keys.ENTER);
        //6-  "Add New Customer " butonuna tiklanir
        tradllyinPage.newCustomers.click();

        //7- Kullanici bilgileri username,email,name ve lastname girilebilir
        Faker faker=new Faker();
        actions.sendKeys(faker.internet().avatar())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.ENTER)
                .sendKeys(faker.internet().domainName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().domainWord()).perform();

        //8- "submit" butonuna tiklanir
        tradllyinPage.submit.click();


    }

}
