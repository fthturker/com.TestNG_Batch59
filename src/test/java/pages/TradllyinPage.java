package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class TradllyinPage {
    public TradllyinPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//li[@id='menu-item-1074']//a[contains(text(),'Hesabım')]")
    public WebElement myAccount;

    @FindBy (xpath = "//span[contains(text(),'Giriş Yap')]")
    public WebElement giris;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement login;

    @FindBy(xpath = "//a[normalize-space()='Store Manager']")
    public WebElement storeManager;

    @FindBy(xpath = "(//a[@class='wcfm_menu_item '])[5]")
    public WebElement coupons;

    @FindBy(xpath = "//a[@id='add_new_coupon_dashboard']")
    public WebElement addNew;



    @FindBy(xpath = "//div[@class='collapse wcfm-collapse']//div[5]")
    public WebElement limit;

//div[@id='coupons_manage_limit']
}
