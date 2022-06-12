package test.day21_resuableMethods_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.TestBaseRapor;

public class C03_PozitifLoginTestiRaporlu extends TestBaseRapor {

        BrcPage brcPage=new BrcPage();

        @Test
        public void positiveLoginTest() {
            extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve sifre ile giris yapabilmeli");
            // Bir test method olustur positiveLoginTest()
            //		 https://www.bluerentalcars.com/ adresine git
            Driver.getDriver().get("https://www.bluerentalcars.com/");
            extentTest.info("Brc anasayfaya gidildi");
            //		login butonuna bas
            brcPage.ilkLoginButonu.click();
            extentTest.info("Login butonuna tiklandi");
            // test data user email: customer@bluerentalcars.com ,
            brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
            extentTest.info("Gecerli email yazildi");
            // test data password : 12345
            brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
            extentTest.info("Gecerli password yazildi");
            // login butonuna tiklayin
            brcPage.ikinciLoginButonu.click();
            extentTest.info("Login butonuna basildi");
            // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

            String actualUsername= brcPage.kullaniciProfilIsmi.getText();
            String expectedUsername=ConfigReader.getProperty("brcValidUsername");
            Assert.assertEquals(actualUsername,expectedUsername);
            extentTest.pass("kullanici basarili sekilde giris yapti");
            Driver.closeDriver();

        }
    }

