package src;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoToPage {
    @FindBy(linkText = "Смартфоны, ТВ и электроника")
    private WebElement ElectronicLink;

    @FindBy(linkText = "Смартфоны")
    private WebElement smartphone;

    @FindBy(linkText = "Телефоны")
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
