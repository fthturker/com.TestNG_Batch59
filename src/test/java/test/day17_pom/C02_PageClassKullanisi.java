package test.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utulities.Driver;

public class C02_PageClassKullanisi {
    @Test
    public void test01(){
        AmazonPage amazonPage=new AmazonPage();

        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //nutella aratalim
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        //sonuc yazisinin nutella icerdigini test edelim
        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        String arananKelime="nutella";

        Assert.assertTrue(actualSonuc.contains(arananKelime));

        Driver.closeDriver();
    }
}
