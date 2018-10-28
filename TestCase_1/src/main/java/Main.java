import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import src.ContentClass;
import src.GoToPage;
import src.ShowNewContent;

public class Main{
    /*
    Отправка письма
     */

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\QA_Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        GoToPage goTo = PageFactory.initElements(driver, GoToPage.class);
        ContentClass saveFile  = PageFactory.initElements(driver, ContentClass.class);
        ShowNewContent show  = PageFactory.initElements(driver, ShowNewContent.class);


        goTo.SmartphoneTvAndElectronics();
        goTo.Telephone();
        goTo.Smartphone();
        show.ShowProductinPage(3);
        saveFile.SaveNameProduct();

        driver.close();
    }
}