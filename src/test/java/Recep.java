import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPageRecep;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReusableMethods;

public class Recep {
    TradylinnPageRecep trd=new TradylinnPageRecep();
    @Test (priority = 1)
    public void US013() {
        Driver.getDriver().get(ConfigReader.getProperty("tradllyinnUrl"));
        trd.loginButton.click();
        trd.username.sendKeys(ConfigReader.getProperty("tradllyinnEmail"));
        trd.password.sendKeys(ConfigReader.getProperty("tradllyinnPassword"));
        trd.loginButton2.click();
        ReusableMethods.waitFor(10);
        trd.hesabimButton.click();
        trd.storeManagerButton.click();
        trd.kuponlar.click();
        trd.yeniEkle.click();
        trd.couponCode.sendKeys(trd.codeID);
        trd.description.sendKeys("10.000 üzeri alışverişlerde sepette %50 indirim");
        Select select= new Select(trd.percent);
        select.selectByIndex(0);
        trd.amount.sendKeys("50");
        trd.expirydate.sendKeys("2022-06-30");
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",trd.freeCheckBox);
        js.executeScript("arguments[0].click();",trd.showOnCheck);
        js.executeScript("arguments[0].click();",trd.submitTıkla);
        ReusableMethods.waitFor(10);
        trd.kuponlar.click();
        ReusableMethods.waitFor(10);
        WebElement newCoupon=Driver.getDriver().findElement(By.xpath("//*[text()='"+trd.codeID+"']"));
        Assert.assertTrue(newCoupon.isDisplayed());
    }
    @Test (priority = 2)
    public void US014() {
        WebElement newCoupon=Driver.getDriver().findElement(By.xpath("//*[text()='"+trd.codeID+"']"));
        newCoupon.click();
        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        trd.minumumSpend.sendKeys("10000");
        trd.maxSpend.sendKeys("50000");
        trd.individualCheckBox.click();
        trd.excludeCheckBox.click();
        //action.sendKeys(Keys.PAGE_DOWN).perform();
        Select select = new Select(trd.ddp);
        select.selectByIndex(1);
        trd.submitTıkla.click();
        ReusableMethods.waitFor(10);
        trd.kuponlar.click();
        ReusableMethods.waitFor(10);
        WebElement new1Coupon=Driver.getDriver().findElement(By.xpath("//*[text()='"+trd.codeID+"']"));
        new1Coupon.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(trd.minumumSpend.getAttribute("value").contains("10000"));
        Assert.assertTrue(trd.maxSpend.getAttribute("value").contains("50000"));
        Assert.assertTrue(trd.individualCheckBox.isSelected());
        Assert.assertTrue(trd.excludeCheckBox.isSelected());
    }
    @Test (priority = 3)
    public void US015() {
        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_UP).perform();
        trd.kuponlar.click();
        ReusableMethods.waitFor(10);
        WebElement newCoupon=Driver.getDriver().findElement(By.xpath("//*[text()='"+trd.codeID+"']"));
        newCoupon.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        trd.limitUygula.click();
        trd.usageLimitCoupon.sendKeys("5");
        trd.usLimitİtems.sendKeys("5");
        trd.perUser.sendKeys("5");
        trd.submitTıkla.click();
        ReusableMethods.waitFor(5);
        trd.kuponlar.click();
        ReusableMethods.waitFor(5);
        WebElement new1Coupon=Driver.getDriver().findElement(By.xpath("//*[text()='"+trd.codeID+"']"));
        new1Coupon.click();
        ReusableMethods.waitFor(5);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        trd.limitUygula.click();
        Assert.assertTrue(trd.usageLimitCoupon.getAttribute("value").contains("5"));
        Assert.assertTrue(trd.usLimitİtems.getAttribute("value").contains("5"));
        Assert.assertTrue(trd.perUser.getAttribute("value").contains("5"));
        Driver.closeDriver();
    }
}