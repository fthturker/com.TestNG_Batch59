
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_15_16_Page;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReusableMethods;
import utulities.TestBaseRapor;

public class US16_01_02_03 extends TestBaseRapor {

    US_15_16_Page us_15_16_page = new US_15_16_Page();

    @Test
    public void TestCase01() throws InterruptedException {


        //1- Siteye git:https://tradylinn.com/ gidilebilir
        Driver.getDriver().get(ConfigReader.getProperty("tradllyinnUrl"));
        extentReports.createTest("US16_TC_01","Gecerli email ve sifre ile giris yapabilmeli");

        //2 -Vendor "My Account" butonuna tiklanir
        us_15_16_page.myAccount.click();

        //3- Vendor "username or email address" ve "password" bilgileri girer ve "login" butonuna tiklanir
        us_15_16_page.username.sendKeys(ConfigReader.getProperty("tradllyinnEmail"));
        us_15_16_page.password.sendKeys(ConfigReader.getProperty("tradllyinnPassword"));
        ReusableMethods.waitFor(10);
        us_15_16_page.login.sendKeys(Keys.ENTER);

        //4-Vendor "Store Manager" butonuna tiklanir
        us_15_16_page.storeManager.click();

        //5-Vendor "customers" butonuna tiklanir
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        us_15_16_page.customers.click();


        //6- kayitli kisinin son siparisi gorulebilmeli
        Assert.assertTrue(us_15_16_page.sonSiparis.isDisplayed());
        extentReports.createTest("kayitli kisinin son siparisi gorulebildi");

        ReusableMethods.waitFor(10);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        us_15_16_page.logout.click();
        //Driver.closeDriver();

    }

    @Test
    public void TestCase02() throws InterruptedException {
/*
        //1- Siteye git:https://tradylinn.com/ gidilebilir
        Driver.getDriver().get(ConfigReader.getProperty("tradllyinnUrl"));
        extentReports.createTest("US15_TC_01_02_03","Gecerli email ve sifre ile giris yapabilmeli");

        //2 -Vendor "My Account" butonuna tiklanir
        us_15_16_page.myAccount.click();
        Thread.sleep(3000);

 */
        //3- Vendor "username or email address" ve "password" bilgileri girer ve "login" butonuna tiklanir
        us_15_16_page.username.sendKeys(ConfigReader.getProperty("tradllyinnEmail"));
        us_15_16_page.password.sendKeys(ConfigReader.getProperty("tradllyinnPassword"));


        //ReusableMethods.waitFor(10);
        us_15_16_page.login.sendKeys(Keys.ENTER);

        //4-Vendor "Store Manager" butonuna tiklanir
        us_15_16_page.storeManager.click();

        //5-Vendor "customers" butonuna tiklanir
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        us_15_16_page.customers.click();

        //6- kayitli kisilerin bilgileri "pdf" "excell" ve "csa" olarak tiklanir
        us_15_16_page.printButon.click();
        us_15_16_page.excelButon.click();
        us_15_16_page.csaButon.click();
        extentReports.createTest("kayitli kisilerin bilgileri \"pdf\" \"excell\" ve \"csa\" olarak tiklandi ");

        ReusableMethods.waitFor(10);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        us_15_16_page.logout.click();
        Driver.closeDriver();
    }
/*
    @Test
    public void TestCase03() throws InterruptedException {

        //1- Siteye git:https://tradylinn.com/ gidilebilir
        Driver.getDriver().get(ConfigReader.getProperty("tradllyinnUrl"));
        extentReports.createTest("US15_TC_01_02_03","Gecerli email ve sifre ile giris yapabilmeli");

        //2 -Vendor "My Account" butonuna tiklanir
        us_15_16_page.myAccount.click();

        //3- Vendor "username or email address" ve "password" bilgileri girer ve "login" butonuna tiklanir
        us_15_16_page.username.sendKeys(ConfigReader.getProperty("tradllyinnEmail"));
        us_15_16_page.password.sendKeys(ConfigReader.getProperty("tradllyinnPassword"));
        ReusableMethods.waitFor(1);
        us_15_16_page.login.sendKeys(Keys.ENTER);

        //4-Vendor "Store Manager" butonuna tiklanir
        us_15_16_page.storeManager.click();

        //5-Vendor "customers" butonuna tiklanir
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        us_15_16_page.customers.click();

        //6-  "Add New Customer " butonuna tiklanir
        us_15_16_page.newCustomers.click();

        //7- Kullanici bilgileri username,email,name ve lastname girilebilir
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(us_15_16_page.newUsername).
                sendKeys(faker.internet().domainName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().domainName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().domainName()).perform();
        extentReports.createTest("Kullanici bilgileri username,email,name ve lastname girilebildi");

        //8- "submit" butonuna tiklanir
        ReusableMethods.waitFor(10);
        us_15_16_page.submit.sendKeys(Keys.ENTER);

*/
    }


