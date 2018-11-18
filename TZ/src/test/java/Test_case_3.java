import Rozetka.HomePage;
import Rozetka.Pages.TelefonyTViEhlektronika.Pages.MobilePhones;
import Rozetka.Pages.TelefonyTViEhlektronika.Pages.Telefony;
import Rozetka.Pages.TelefonyTViEhlektronika.TelefonyTViEhlektronika;
import Settings.SaveToExcel;
import Settings.WebDriverSetting;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class Test_case_3 extends WebDriverSetting {

    @Test
    public void Test1 ()   {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        TelefonyTViEhlektronika telefonyTViEhlektronika = homePage.PageTelefonyTViEhlektronika();
        Telefony telefony = telefonyTViEhlektronika.TelefonyPage();

        MobilePhones mobilePhones = telefony.SmartphoneMenuCategoriesLeft();
        mobilePhones.ShowProductinPage(3);

        SaveToExcel saveToExcel = PageFactory.initElements(driver, SaveToExcel.class);
        saveToExcel.ProductNamePriceTopSale("TopSales", "test");

        mobilePhones.MinMaxPrice(3000, 6000);
        mobilePhones.ShowProductinPage(5);
        saveToExcel.ProductNamePriceTopSale("3000", "test");
        saveToExcel.ProductNamePriceMaxMinPrice("3000-6000", "test2");
    }
}
