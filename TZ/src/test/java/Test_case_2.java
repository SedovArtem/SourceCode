import org.junit.Test;
import Rozetka.HomePage;
import Settings.SaveToBD;
import Settings.WebDriverSetting;
import org.openqa.selenium.support.PageFactory;
import Rozetka.Pages.TovaryDlyaDoma.TovaryDlyaDoma;
import Rozetka.Pages.TovaryDlyaDoma.Pages.BytovayaHimiya;
import Rozetka.Pages.TovaryDlyaDoma.Pages.StiralnyeSredstva;
import Rozetka.Pages.TovaryDlyaDoma.Pages.SredstvaDlyaStirki;

public class Test_case_2 extends WebDriverSetting {

    @Test
    public void Teststs () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        TovaryDlyaDoma tovaryDlyaDoma = homePage.PageTovaryDlyaDoma();
        BytovayaHimiya bytovayaHimiya = tovaryDlyaDoma.BytovayaHimiyaPagePortalImageLink();

        SredstvaDlyaStirki sredstvaDlyaStirki = bytovayaHimiya.BytovayaHimiyaPortalAutomaticLink();

        StiralnyeSredstva stiralnyeSredstva = sredstvaDlyaStirki.StiralnyeSredstvaSubCatLink();
        stiralnyeSredstva.MinMaxPrice(100, 300);
        stiralnyeSredstva.ShowProductinPage(5);

        SaveToBD saveToBD = PageFactory.initElements(driver, SaveToBD.class);
        saveToBD.SaveToBD(true);
    }
}
