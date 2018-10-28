import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import src.ContentClass;
import src.GoToPage;

import java.util.concurrent.TimeUnit;

public class Main{
    /*
    Не реализовано:
    Переход на другие страницы
    Отправка письма
     */

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\QA_Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        GoToPage goTo = PageFactory.initElements(driver, GoToPage.class);
        ContentClass saveFile  = PageFactory.initElements(driver, ContentClass.class);

        goTo.SmartphoneTvAndElectronics();
        goTo.Telephone();
        goTo.Smartphone();
        saveFile.SaveInfo();

        driver.close();
    }
}