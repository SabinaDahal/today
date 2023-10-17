package TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ProductPage;
import pages.LoginPage;
import Utilities.Utils;

public class ProductTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private ProductPage ProductPage;
    private Utils Utils;
    
    
    @BeforeMethod
    public void setUp() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");
        loginPage = new LoginPage(driver);
        ProductPage = new ProductPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Utils = new Utils(driver);
    }

    @Test
    public void VerifyTitleforProduct() {
        // Assuming verifyTitle method in Utils class
        boolean result = Utils.verifyTitle(driver, "Swag Labs");
        Assert.assertTrue(result);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}


