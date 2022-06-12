package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class AmazonPage {
    //ilk once constructor olusturmaliyiz
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        //Driver'i bu class'a tanitmaliyiz.
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

}
