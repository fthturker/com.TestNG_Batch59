

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utulities.TestBase;

import java.util.List;


public class Denemeler extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //1. “http://zero.webappsecurity.com/” Adresine gidin
        driver.get("http://zero.webappsecurity.com/");

        //2. Sign in butonuna basin
        driver.findElement(By.id("signin_button")).click();
        Thread.sleep(2000);
        //3. Login kutusuna “username” yazin
        WebElement loginKutusu= driver.findElement(By.xpath("//input[@id='user_login']"));
        loginKutusu.sendKeys("username");
        Thread.sleep(2000);
        //4. Password kutusuna “password” yazin
        WebElement passwordKutusu=driver.findElement(By.xpath("//input[@id='user_password']"));
        passwordKutusu.sendKeys("password");
        Thread.sleep(2000);
        //5. Sign in tusuna basin
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.navigate().back();
        Thread.sleep(3000);

        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//strong[normalize-space()='Online Banking']")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        Thread.sleep(2000);
        //7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.xpath("//a[normalize-space()='Purchase Foreign Currency']")).click();
        Thread.sleep(2000);
        //8. “Currency” drop down menusunden Eurozone’u secin
        WebElement ddo=driver.findElement(By.xpath("//select[@id='pc_currency']"));
        Select select= new Select(ddo);
        select.selectByVisibleText("Eurozone (euro)");
        Thread.sleep(2000);
        //9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin



        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        // "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)",
        // "China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)",
        // "Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)",
        // "New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"




    }
}
