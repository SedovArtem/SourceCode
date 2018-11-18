package Settings;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class SaveToExcel {
    //Локаторы для товаров с пометкой Топ Продаж
    @FindBy(xpath = "//i[@class='g-tag g-tag-icon-small-popularity sprite']//..//..//..//../div[@class='g-i-tile-i-box-desc']//div[@class='g-i-tile-i-title clearfix']/a")
    private List<WebElement> TopSaleNameProduct;
    @FindBy(xpath = "//i[@class='g-tag g-tag-icon-small-popularity sprite']//..//..//..//div[@class='g-price-uah']")
    private List<WebElement> TopSalePrice;

    @FindBy(xpath = "//div[@class='g-i-tile-i-box-desc']//div[@class='g-i-tile-i-title clearfix']/a")
    private List<WebElement> nameProduct;
    @FindBy(xpath = "//div[@name='price']//div[@class='g-price-uah']")
    private List<WebElement> priceProduct;


    //Метод для сохранения названия\цены товаров с пометкой Топ Продаж
    public void ProductNamePriceTopSale (String nameList, String nameFile)   {
        SaveNameProductToExcel(TopSaleNameProduct,TopSalePrice,nameList, nameFile);
    }

    public void ProductNamePriceMaxMinPrice (String nameList, String nameFile)   {
        SaveNameProductToExcel(nameProduct,priceProduct,nameList, nameFile);
    }

    private void SaveNameProductToExcel (List<WebElement> Name, List<WebElement> Price,String nameList, String nameFile)  {

        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet(nameList);



        for (int i = 0; i < Name.size(); i++) {
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < 1; j++) {
                Row row1 = sheet.createRow(j);
                row1.createCell(0).setCellValue("Название");
                row1.createCell(1).setCellValue("Цена");
            }

                row.createCell(0).setCellValue(Name.get(i).getText());
                row.createCell(1).setCellValue(Price.get(i).getText());
        }
        try {
            FileOutputStream fos = new FileOutputStream("D:/" + nameFile + ".xlsx");
            wb.write(fos);
        }catch (IOException e) {
        }
    }
}
