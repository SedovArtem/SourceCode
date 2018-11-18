package Rozetka.Pages.TelefonyTViEhlektronika.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Telefony {
    private WebDriver driver;

    public Telefony(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='pab-group-href']//a")
    private WebElement allTelephones;

    @FindBy(xpath = "//li[@param='63304'][1]//div//a[1]")
    private WebElement smartphone;


    public MobilePhones AllMobilePages (){
        allTelephones.click();
        return PageFactory.initElements(driver, MobilePhones.class);
    }

    public MobilePhones SmartphoneMenuCategoriesLeft (){
        smartphone.click();
        return PageFactory.initElements(driver, MobilePhones.class);
    }
}
