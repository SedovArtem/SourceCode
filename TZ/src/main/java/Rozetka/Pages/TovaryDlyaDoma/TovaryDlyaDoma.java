package Rozetka.Pages.TovaryDlyaDoma;

import Rozetka.Pages.TovaryDlyaDoma.Pages.BytovayaHimiya;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TovaryDlyaDoma {
    private WebDriver driver;

    public TovaryDlyaDoma(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

            //--Categories Left Menu--
    //Локатор ссылки на категорию Бытовая химия
    @FindBy(xpath = "//ul[@name='menu_categories_left']//li[7]//a[@class='m-cat-l-i-title-link']")
    private WebElement bytovayaHimiyaLeftLink;
    //Локатор кнопки (показать подкатегории) -> Бытовая химия
    @FindBy(xpath = "//ul[@name='menu_categories_left']//li[7]//a[@name='menu_section_title']")
    private WebElement bytovayaHimiyaLeftLinkRol;
    //Локатор Подкатегории  -> Бытовая химия
    @FindBy(xpath = "//ul[@name='menu_categories_left']//li[7]//ul[@class='m-cat-subl']/li[2]//a")
    private WebElement bytovayaHimiyaLeftSubLink;

            //--Portal Automatic--
    @FindBy(xpath = "//div[@class='portal-automatic']//div[@class='pab-row pab-row-tierce'][9]/div[@name='block_with_goods'][2]//div[@class='pab-img']/a")
    private WebElement bytovayaHimiyaPortalImageLink;
    @FindBy(xpath = "//div[@class='portal-automatic']//div[@class='pab-row pab-row-tierce'][9]/div[@name='block_with_goods'][2]//a[@class='pab-h3-link']")
    private WebElement bytovayaHimiyaPortalLink;
    @FindBy(xpath = "//div[@class='portal-automatic']//div[@class='pab-row pab-row-tierce'][9]/div[@name='block_with_goods'][2]//ul//li[6]/a")
    private WebElement AllbytovayaHimiyaPortalLink;

    public BytovayaHimiya BytovayaHimiyaPageLeftMenu (){
        bytovayaHimiyaLeftLink.click();
        return PageFactory.initElements(driver, BytovayaHimiya.class);
    }

    /*
    public BytovayaHimiya BytovayaHimiyaPageLeftLinkRolMenu (){
        bytovayaHimiyaLeftLinkRol.click();
        return PageFactory.initElements(driver, BytovayaHimiya.class);
    }
    public BytovayaHimiya BytovayaHimiyaPageLeftSubLink (){
        bytovayaHimiyaLeftSubLink.click();
        return PageFactory.initElements(driver, BytovayaHimiya.class);
    }
*/
    public BytovayaHimiya BytovayaHimiyaPagePortalImageLink (){
        bytovayaHimiyaPortalImageLink.click();
        return PageFactory.initElements(driver, BytovayaHimiya.class);
    }
    public BytovayaHimiya BytovayaHimiyaPagePortalLink (){
        bytovayaHimiyaPortalLink.click();
        return PageFactory.initElements(driver, BytovayaHimiya.class);
    }
    public BytovayaHimiya AllBytovayaHimiyaPagePortalLink (){
        AllbytovayaHimiyaPortalLink.click();
        return PageFactory.initElements(driver, BytovayaHimiya.class);
    }
}
