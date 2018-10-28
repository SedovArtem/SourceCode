package src;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Content extends SaveFile  {
    //Локатор поиска по имени, всех товар на странице.
    @FindAll({
            @FindBy(xpath = "//div[@class='g-i-tile-i-box-desc']//div[@class='g-i-tile-i-title clearfix']/a"),
            @FindBy(xpath = "//div[@name='goods_list']//div[@class='g-price-uah']")}
            ) private List<WebElement> nameProduct;


            //Локаторы товар с пометкой Топ продаж.
    @FindAll({
            @FindBy(xpath = "//i[@class='g-tag g-tag-icon-middle-popularity sprite']/../../../..//div[@class='g-i-tile-i-title clearfix']"),
            @FindBy(xpath = "//i[@class='g-tag g-tag-icon-middle-popularity sprite']/../../../..//div[@class='g-i-tile-i-title clearfix']/../../div[@class='g-i-tile-i-box-desc']//div[@class='g-price-uah']")
    }) private List<WebElement> topsales;

    //Локаторы минимальной и максимальной цены, для фильтра.
    @FindBy(xpath = "//div[@class='filter-parametrs-i slider']//input[@id='price[min]']")
        private WebElement priceMin;
    @FindBy(xpath = "//div[@class='filter-parametrs-i slider']//input[@name='price[max]' and @value='']")
        private WebElement priceMax;
    @FindBy(xpath = "//span[@class=' btn-link-gray btn-link']/button")
        private WebElement button;


    public void SaveNameProductOnAllPages ()
    {

        SaveInfoMethod(nameProduct, "NameProduct.txt");
    }

    public void SaveProductTopSale ()
    {
         SaveInfoMethod(topsales, "TopSale.txt");
    }

    public void SetMinMaxPrice(int min, int max){
        priceMin.sendKeys(String.valueOf(min));

        priceMax.click();
        priceMax.sendKeys(Keys.CONTROL+"a");
        priceMax.sendKeys(Keys.DELETE);
        priceMax.sendKeys(String.valueOf(max));
        button.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
