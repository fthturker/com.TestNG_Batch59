import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.BrcPage;
import pages.FacebookPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.TestBase;

import java.time.Duration;

public class Denemeler {
    BrcPage brcPage=new BrcPage();

    @Test
    public void positiveLoginTest() {
        // Bir test method olustur positiveLoginTest()
        //		 https://www.bluerentalcars.com/ adresine git

        //		login butonuna bas

        // test data user email: customer@bluerentalcars.com ,

        // test data password : 12345
        ;
        // login butonuna tiklayin

        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et


    }
    }

