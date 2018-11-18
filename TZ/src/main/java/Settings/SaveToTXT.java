package Settings;

import java.io.File;
import java.util.List;
import java.io.PrintWriter;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaveToTXT {

    @FindBy(xpath = "//div[@class='g-i-tile-i-box-desc']//div[@class='g-i-tile-i-title clearfix']/a")
    private List<WebElement> nameFile;

    public void SaveNameProduct ()
    {
        SaveInfoMethod(nameFile);
    }

    private void SaveInfoMethod (List<WebElement> a){

        try {
            File file = new File("output.txt");

            if (!file.exists()){
                file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file);

            for (WebElement ss : a) {
                pw.println(ss.getText());
            }
            pw.close();
        }catch (IOException ex)
        {
            System.out.println("Ошибка" + ex);
        }
    }
}
