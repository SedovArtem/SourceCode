package Rozetka.Pages.TovaryDlyaDoma.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BytovayaHimiya {
    private WebDriver driver;

    public BytovayaHimiya(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='m-cat']/ul[2]/li[2]//a")
    private WebElement sredstvaDlyaStirkiLeftLink;

    @FindBy(xpath = "//div[@class='custom-top-block portal-notebooks']//div[@class='p-auto-block p-auto-block-1'][1]/p/a")
    private WebElement sredstvaDlyaStirkiPortalAutomaticLink;


    public SredstvaDlyaStirki BytovayaHimiyaLeftLink (){
        sredstvaDlyaStirkiLeftLink.click();
        return PageFactory.initElements(driver, SredstvaDlyaStirki.class);
    }

    public SredstvaDlyaStirki BytovayaHimiyaPortalAutomaticLink (){
        sredstvaDlyaStirkiPortalAutomaticLink.click();
        return PageFactory.initElements(driver, SredstvaDlyaStirki.class);
    }
}
