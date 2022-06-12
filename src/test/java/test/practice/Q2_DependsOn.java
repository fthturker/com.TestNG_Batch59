package test.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import utulities.Driver;
import utulities.TestBase;

public class Q2_DependsOn extends TestBase {

    /*
 birbirine bagimli testler olusturun..
 .beforClass olusturup setUp ayarlarini yapin..
   birbirine bagimli testler olusturarak;
       ilk once facebook a gidin
       sonra facebook a bagimli olarak google a gidin,
       daha sonra google a bagimli olarak amazon a gidin
 driver i kapatin

*/
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
