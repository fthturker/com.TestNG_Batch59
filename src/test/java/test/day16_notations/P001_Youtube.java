package test.day16_notations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class P001_Youtube {
    WebDriver driver;

    @BeforeClass
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test01() {
        // youtube adresine gidiniz
        driver.get("https://www.youtube.com");
    }

    @Test
    public void test02() {
        // sayfa basliginin "YouTube" oldugunu test edin

        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Test
    public void test03() {
        // YouTube resminin goruntulendigini (isDisplayed()) test edin
        WebElement sayfaBasligiElementi = driver.findElement(By.xpath("//div[@class='style-scope ytd-topbar-logo-renderer']"));

        Assert.assertTrue(sayfaBasligiElementi.isDisplayed());
    }

    @Test
    public void test04() {
        // search Box 'in erisilebilir oldugunu test edin (isEnabled)
        WebElement searchBoxElementi = driver.findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue(searchBoxElementi.isEnabled());
    }

    @Test
    public void test05() {
        // sayfa basliginin "youtube" olmadıgını test edin (wrongTitleTest)
        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();
        Assert.assertFalse(actualTitle.contains(expectedTitle));
    }
}