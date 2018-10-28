import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import src.Content;
import src.GoToPage;
import src.ShowNewContent;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class main {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {

        /*
        Не реализовано:
        Отправка письма
        Запись в excel
         */

        System.setProperty("webdriver.chrome.driver", "D:\\QA_Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        GoToPage goTo = PageFactory.initElements(driver, GoToPage.class);
        Content saveFile  = PageFactory.initElements(driver, Content.class);
        Content setPrice = PageFactory.initElements(driver, Content.class);
        ShowNewContent show = PageFactory.initElements(driver, ShowNewContent.class);

        goTo.SmartphoneTvAndElectronics();
        goTo.Telephone();
        goTo.Smartphone();

        show.ShowProductinPage(3);
        saveFile.SaveProductTopSale();


        setPrice.SetMinMaxPrice(3000, 6000);
        show.ShowProductinPage(5);
        saveFile.SaveNameProductOnAllPages();

        driver.close();
    }
}
