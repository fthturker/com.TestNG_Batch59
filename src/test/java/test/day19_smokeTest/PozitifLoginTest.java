package test.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utulities.ConfigReader;
import utulities.Driver;

public class PozitifLoginTest {
    //class seviyesinde bir tane obje olusturalim
    BrcPage brcPage=new BrcPage();

    @Test
    public void positiveLoginTest() {
        // Bir test method olustur positiveLoginTest()
        //		 https://www.bluerentalcars.com/ adresine git
        //package sayfasindaki locate lere nasil ulasabilirim obje olusturmam gerekir
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //		login butonuna bas
        brcPage.ilkLoginButonu.click();
        // test data user email: customer@bluerentalcars.com
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        // test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        // login butonuna tiklayin
        brcPage.ikinciLoginButonu.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        System.out.println(brcPage.kullaniciProfilIsmi.getText());

        String actualUsername= brcPage.kullaniciProfilIsmi.getText();
        String expectedUsername=ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUsername,expectedUsername);

        Driver.closeDriver();




    }
}
