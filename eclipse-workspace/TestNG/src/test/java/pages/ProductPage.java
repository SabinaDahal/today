package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductPage {
	  private WebDriver driver;
	    private By productName = By.className("inventory_item_name");

	    public ProductPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public String getProductName() {
	        return driver.findElement(productName).getText();
	    }
	}


