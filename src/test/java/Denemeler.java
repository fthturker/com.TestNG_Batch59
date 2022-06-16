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
    @Test
    public void facebook() {
        Driver.getDriver().get("https://www.facebook.com");
    }
    @Test(dependsOnMethods = "facebook")
    public void google() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Test(dependsOnMethods = "google")
    public void amazon() {
        Driver.getDriver().get("https://www.amazon.com");
    }

    }

