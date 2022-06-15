package test.day16_notations;

import org.testng.annotations.Test;
import utulities.TestBase;

public class C03_priority extends TestBase {
    /*
    TestNG test mehod'larini isim sirasina gore calistirir
    eger isim siralamsinin disinda bir siralama ile calismasini iserseniz
    o zaman test method'larina oncelik (priority) tanimlayabiliriz

    priority kucukten buyuge gore calisir
    eger bir test method'una priority degeri atanmamissa
    default olarak priority=0 olarak kabul edilir
     */
    @Test(priority = -5)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test(priority = -6)
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}
