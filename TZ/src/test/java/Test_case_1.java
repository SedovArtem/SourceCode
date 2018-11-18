import Rozetka.Pages.TelefonyTViEhlektronika.Pages.MobilePhones;
import Rozetka.Pages.TelefonyTViEhlektronika.Pages.Telefony;
import Rozetka.Pages.TelefonyTViEhlektronika.TelefonyTViEhlektronika;
import Settings.SaveToExcel;
import Settings.SaveToTXT;
import Settings.WebDriverSetting;
import Rozetka.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class Test_case_1 extends WebDriverSetting {

    @Test
    public void Test1 (){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        TelefonyTViEhlektronika tv = homePage.PageTelefonyTViEhlektronika();
        Telefony tel = tv.TelefonyPage();
        MobilePhones mobilePhones = tel.AllMobilePages();
        mobilePhones.ShowProductinPage(3);

        SaveToTXT save = PageFactory.initElements(driver, SaveToTXT.class);
        save.SaveNameProduct();
    }
}