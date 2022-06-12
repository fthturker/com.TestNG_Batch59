package test.day16_notations;

import org.testng.annotations.Test;
import utulities.TestBase;

public class C01_BeforeMethod_After_Method extends TestBase {
    // @BeforeMethod ve @AfterMethod  notasyonlari
    // JUnit'deki @Before ve @After gibidir
    // her test method'undan once ve sonra calisirlar
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }
    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
    }
}

