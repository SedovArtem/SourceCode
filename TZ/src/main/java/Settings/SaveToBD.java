package Settings;

import java.sql.*;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaveToBD {
    private final String SQL = "DELETE FROM test.new_table";
    private final String stat = "insert into test.new_table(Name, Price) values (?, ?)";
    private final String userName = "root";
    private final String password = "qweqwe";
    private final String connectionUrl = "jdbc:mysql://localhost:3306/mysql?allowPublicKeyRetrieval=true&useSSL=false";

    @FindBy(xpath = "//div[@class='g-i-tile-i-box-desc']//div[@class='g-i-tile-i-title clearfix']/a")
    private List<WebElement> nameProducts;
    @FindBy(xpath = "//div[@name='price']//div[@class='g-price-uah']")
    private List<WebElement> priceProducts;

    public void SaveToBD (boolean rewrite){
        ConnectedToBD(nameProducts, priceProducts, rewrite);
    }

    private void ConnectedToBD (List <WebElement> nameProduct, List <WebElement> priceProduct, boolean rewrite){
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); PreparedStatement statement = connection.prepareStatement(stat)){
            Class.forName("com.mysql.jdbc.Driver");

            if (rewrite){
                statement.executeUpdate(SQL);
            }
                for (int i = 0; i < nameProducts.size(); i++) {
                    ((PreparedStatement) statement).setString(1, nameProducts.get(i).getText());
                    ((PreparedStatement) statement).setString(2, priceProducts.get(i).getText());
                    ((PreparedStatement) statement).execute();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
