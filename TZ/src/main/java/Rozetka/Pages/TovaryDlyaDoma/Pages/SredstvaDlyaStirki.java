package Rozetka.Pages.TovaryDlyaDoma.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SredstvaDlyaStirki {
    private WebDriver driver;

    public SredstvaDlyaStirki(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='cat-tree-l']//li[@class='cat-tree-l-i active']/ul/li[4]/a")
    private WebElement stiralnieSredstvaLeftLink;

    @FindBy(xpath = "//div[@class='title-page-with-filters-wrap']//div[@class='sub-cat-l-wrap']//li[4]/a")
    private WebElement stiralnieSredstvaSubCatLink;

    @FindBy(xpath = "//div[@name='goods_list_container']//div[@class='sub-cat-l-wrap']//li[4]/a")
    private WebElement stiralnieSredstvaGoodsListContainerCatLink;

    public StiralnyeSredstva StiralnyeSredstvaLeftLink (){
        stiralnieSredstvaLeftLink.click();
        return PageFactory.initElements(driver, StiralnyeSredstva.class);
    }

    public StiralnyeSredstva StiralnyeSredstvaSubCatLink (){
        stiralnieSredstvaSubCatLink.click();
        return PageFactory.initElements(driver, StiralnyeSredstva.class);
    }

    public StiralnyeSredstva StiralnyeSredstvaGoodsListContainerCatLink (){
        stiralnieSredstvaGoodsListContainerCatLink.click();
        return PageFactory.initElements(driver, StiralnyeSredstva.class);
    }


}
