package Rozetka.Pages.TelefonyTViEhlektronika;

import Rozetka.Pages.TelefonyTViEhlektronika.Pages.Telefony;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TelefonyTViEhlektronika {
    private WebDriver driver;

    public TelefonyTViEhlektronika(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='m-cat-l']//li[1]//a")
    private WebElement telephone;

    public Telefony TelefonyPage (){
        telephone.click();
        return PageFactory.initElements(driver, Telefony.class);
    }
}
