package Rozetka.Pages.TovaryDlyaDoma.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StiralnyeSredstva {
    private WebDriver driver;

    public StiralnyeSredstva(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Локатор для кнопки Показать больше товаров
    @FindBy(xpath = "//div[@name='more_goods']/a")
    private WebElement showProducts;

    //Локаторы для фильтра Минимальной\Максимальной цены
    @FindBy(xpath = "//div[@class='price-input clearfix']//input[@name='price[min]']")
    private WebElement priceMin;
    @FindBy(xpath = "//div[@class='price-input clearfix']//input[@name='price[max]']")
    private WebElement priceMax;
    @FindBy(xpath = "//div[@class='price-input clearfix']//span[@class='slider-submit pos-fix']//button")
    private WebElement button;

    public void MinMaxPrice (int min, int max){

        priceMin.click();
        priceMin.clear();
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

    public void ShowProductinPage (int page) {
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
