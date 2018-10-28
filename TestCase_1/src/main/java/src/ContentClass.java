package src;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContentClass extends SaveFile  {
    @FindBy(xpath = "//div[@class='g-i-tile-i-box-desc']//div[@class='g-i-tile-i-title clearfix']/a")
    private List<WebElement> nameFile;

    public void SaveInfo ()
    {
        SaveInfoMethod(nameFile, "ProductName.txt");
    }
}
