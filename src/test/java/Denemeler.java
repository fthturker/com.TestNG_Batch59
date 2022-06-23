

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.TradllyinPage;
import utulities.ConfigReader;
import utulities.Driver;

import java.security.Key;


public class Denemeler  {
    TradllyinPage tradllyinPage=new TradllyinPage();

    @Test
    public void positiveLoginTest() throws InterruptedException {


        //1- Siteye git:https://tradylinn.com/ gidilebilir
        Driver.getDriver().get(ConfigReader.getProperty("tradllyinnUrl"));
        //2 -Vendor "My Account" butonuna tiklanir
        tradllyinPage.myAccount.click();
        //Driver.getDriver().findElement(By.xpath("//li[@id='menu-item-1074']//a[contains(text(),'Hesabım')]")).click();
        //tradllyinPage.giris.click();
        //3- Vendor "username or email address" ve "password" bilgileri girer ve "login" butonuna tiklanir
        //Driver.getDriver().findElement(By.xpath("//input[@id='username']")).sendKeys(ConfigReader.getProperty("tradllyinnEmail"));
        //Driver.getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys(ConfigReader.getProperty("tradllyinnPassword"));
        //Driver.getDriver().findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);


        tradllyinPage.username.sendKeys(ConfigReader.getProperty("tradllyinnEmail"));
        tradllyinPage.password.sendKeys(ConfigReader.getProperty("tradllyinnPassword"));
        tradllyinPage.login.sendKeys(Keys.ENTER);
        //Thread.sleep(3000);
        //tradllyinPage.myAccount.click();
        //4-Vendor "Store Manager" butonuna tiklanir
        tradllyinPage.storeManager.click();
        //Driver.getDriver().findElement(By.xpath("//a[normalize-space()='Store Manager']")).click();
        //5-Vendor "Coupons" butonuna tiklanir

        Driver.getDriver().findElement(By.xpath("//a[@href='https://tradylinn.com/store-manager/coupons-manage/']")).sendKeys(Keys.ENTER);

        //6- Vendor "add new "butonuna tiklanir
        //tradllyinPage.addNew.click();
        //Thread.sleep(3000);
        //7- Vendor "limit" butonuna tiklanir
        //tradllyinPage.limit.click();
        //8- Vendor "Usage limit per coupon" limiti bilgileri eklenebilir


        Driver.closeDriver();

    }
}