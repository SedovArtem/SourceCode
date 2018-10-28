package src;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShowNewContent {

    @FindBy(xpath = "//div[@class='g-i-tile-l g-i-tile-catalog-hover-left-side clearfix']//div[@name='more_goods']/a")
    private WebElement showProducts;

    public void ShowProductinPage(int page) {
        int i = 1;

        for (; i < page; i++) {
            showProducts.click();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
