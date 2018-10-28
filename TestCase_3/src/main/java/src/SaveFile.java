package src;

import org.openqa.selenium.WebElement;

import java.io.*;
import java.util.List;

public class SaveFile {

    public void SaveInfoMethod (List<WebElement> nameProduct, String nameFile){

        try {
            File file = new File(nameFile);

            if (!file.exists()){
                file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file);

            for (WebElement name : nameProduct) {
                pw.println(name.getText());
            }
            pw.close();
        }catch (IOException  ex)
        {
            System.out.println("Ошибка" + ex);
        }
    }
}
