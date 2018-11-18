package Rozetka;

import Rozetka.Pages.TelefonyTViEhlektronika.TelefonyTViEhlektronika;
import Rozetka.Pages.TovaryDlyaDoma.TovaryDlyaDoma;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    @FindBy(xpath = "//nav[@name='nav-m-main']//div[@name='fat-menu']//ul//li[@name='m-main-i'][2]//a")
    private WebElement electronicLink;

    @FindBy(xpath = "//nav[@name='nav-m-main']//div[@name='fat-menu']//ul//li[@name='m-main-i'][4]//a")
    private WebElement householdProducts;

    public TelefonyTViEhlektronika PageTelefonyTViEhlektronika (){
        electronicLink.click();
        return new TelefonyTViEhlektronika(driver);
    }

    public TovaryDlyaDoma PageTovaryDlyaDoma (){
        householdProducts.click();
        return new TovaryDlyaDoma(driver);
    }
}
