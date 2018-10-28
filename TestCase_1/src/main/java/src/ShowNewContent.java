package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShowNewContent {

    private WebDriver driver;

    @FindBy(xpath = "//nav[@id='navigation_block']/ul/li")
    private List<WebElement> showProducts;

    public void showMore () {

        for (WebElement ss : showProducts) {
            ss.click();
        }
    }
}
