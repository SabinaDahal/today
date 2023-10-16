package TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductPage;


public class LoginTest {
	 private WebDriver driver;
	    private LoginPage loginPage;
	    private ProductPage productPage;
	    
	    @BeforeMethod
	    public void setUp() {
	        // Set up WebDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
	        driver = new ChromeDriver();

	        driver.get("https://www.saucedemo.com/v1/");
	        loginPage = new LoginPage(driver);
	        productPage = new ProductPage(driver);
	    }

	    @Test
	    public void loginTest() {
	        // Perform login
	        loginPage.enterUsername("standard_user");
	        loginPage.enterPassword("secret_sauce");
	        loginPage.clickLoginButton();

	        // Verify login by checking the product page
	        String productName = productPage.getProductName();
	        Assert.assertEquals(productName, "Sauce Labs Backpack");
	    }

	    @Test
	    public void loginWithoutPassword() {
	        loginPage.enterUsername("standard_user");
	        loginPage.clickLoginButton();

	        // Verify error state
	        Assert.assertTrue(loginPage.errorstate());
	    }

	    @Test
	    public void verifyTitle() {
	        String actualTitle = loginPage.verifyTitle();
	        String expectedTitle = "Swag Labs";
	        Assert.assertEquals(actualTitle, expectedTitle);
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Close the WebDriver
	        driver.quit();
	    }
	}



