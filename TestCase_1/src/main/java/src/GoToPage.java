package src;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoToPage {
    @FindBy(xpath = "//div[@name='fat-menu']/ul/li[2]/a")
    private WebElement ElectronicLink;

    @FindBy(xpath = "//li[@param='63304'][1]/div/a[1]")
    private WebElement smartphone;

    @FindBy(xpath = "//ul[@class='m-cat-l']/li[1]//a")
    private WebElement telephone;

    public GoToPage SmartphoneTvAndElectronics (){
        ElectronicLink.click();
        return this;
    }

    public GoToPage Telephone (){
        telephone.click();
        return this;
    }

    public GoToPage Smartphone (){
        smartphone.click();
        return this;
    }
}
