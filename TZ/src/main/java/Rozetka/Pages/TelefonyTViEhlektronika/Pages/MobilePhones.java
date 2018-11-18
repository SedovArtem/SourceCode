package Rozetka.Pages.TelefonyTViEhlektronika.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePhones {
    private WebDriver driver;

    public MobilePhones(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Локатор для кнопки Показать больше товаров
    @FindBy(xpath = "//div[@class='g-i-tile g-i-tile-catalog preloader-trigger']//a")
    private WebElement showProducts;

    //Локаторы для фильтра Минимальной\Максимальной цены
    @FindBy(xpath = "//div[@class='price-input clearfix']//input[@name='price[min]']")
    private WebElement minPrice;
    @FindBy(xpath = "//div[@class='price-input clearfix']//input[@name='price[max]']")
    private WebElement maxPrice;
    @FindBy(xpath = "//div[@class='price-input clearfix']//span[@class='slider-submit pos-fix']//button")
    private WebElement button;

    //Локаторы сортировки
    @FindBy(xpath = "//div[@name='drop_parent']//a[@name='drop_link']")
    private WebElement dropLink;
    @FindBy(xpath = "//li[@class='sort-view-l-i pos-fix'][2]//a")
    private WebElement maxPriceToMinPrice;

    public void Sorting(){
        dropLink.click();
        maxPriceToMinPrice.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void MinMaxPrice (int min, int max){

        minPrice.click();
        minPrice.clear();
        minPrice.sendKeys(String.valueOf(min));

        maxPrice.click();
        maxPrice.sendKeys(Keys.CONTROL+"a");
        maxPrice.sendKeys(Keys.DELETE);
        maxPrice.sendKeys(String.valueOf(max));
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
