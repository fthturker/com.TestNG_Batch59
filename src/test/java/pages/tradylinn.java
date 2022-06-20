package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class tradylinn {
    public tradylinn() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[@class='text'][normalize-space()='Kuponlar']")
    public WebElement kuponButonu;

    @FindBy(xpath = "//span[contains(text(),'Yeni ekle')]")
    public WebElement kuponyeniEkle;


}
