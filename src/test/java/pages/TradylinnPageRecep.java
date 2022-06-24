package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.Random;

public class TradylinnPageRecep {
    public TradylinnPageRecep() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //Faker faker = new Faker();
    //public String codeID= String.valueOf(faker.code());
    public Random rnd = new Random();
    public String codeID= String.valueOf(rnd.nextInt(10000));
    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton2;
    @FindBy(xpath = "(//*[text()='Hesabım'])[1]")
    public WebElement hesabimButton;
    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerButton;
    @FindBy(xpath = "(//span[@class='text'])[6]")
    public WebElement kuponlar;
    @FindBy(xpath = "//*[text()='Yeni ekle']")
    public WebElement yeniEkle;
    @FindBy(xpath = "//input[@class='wcfm-text wcfm_ele']")
    public WebElement couponCode;
    public WebElement code;
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement description;
    @FindBy(xpath = "//select[@id='discount_type']")
    public WebElement percent;
    @FindBy(xpath = "//input[@id='coupon_amount']")
    public WebElement amount;
    @FindBy(xpath = "//input[@id='expiry_date']")
    public WebElement expirydate;
    @FindBy (xpath = "//input[@id='free_shipping']")
    public WebElement freeCheckBox;
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement showOnCheck;
    @FindBy(xpath = "//input[@id='wcfm_coupon_manager_submit_button']")
    public WebElement submitTıkla;
    @FindBy(xpath = "//input[@id='minimum_amount']")
    public WebElement minumumSpend;
    @FindBy(xpath = "//input[@id='maximum_amount']")
    public WebElement maxSpend;
    @FindBy (xpath = "//input[@id='individual_use']")
    public WebElement individualCheckBox;
    @FindBy(xpath = "//input[@id='exclude_sale_items']")
    public WebElement excludeCheckBox;
    @FindBy(xpath = "//select[@id='exclude_product_categories']")
    public WebElement ddp;
    @FindBy(xpath = "//div[@id='coupons_manage_limit']")
    public WebElement limitUygula;
    @FindBy(xpath ="//input[@id='usage_limit']")
    public WebElement usageLimitCoupon;
    @FindBy(xpath = "//input[@id='limit_usage_to_x_items']")
    public WebElement usLimitİtems;
    @FindBy(xpath = "//input[@id='usage_limit_per_user']")
    public WebElement perUser;
}

