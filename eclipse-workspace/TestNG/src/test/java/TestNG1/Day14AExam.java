package TestNG1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day14AExam {
	  //4) write test case with data providers for login scenario sauce demo lab
	  @Test
	  public void test1() {
		  

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    
	        // Selecting the element
	        driver.get("https://www.saucedemo.com/");
	        WebElement username = driver.findElement(By.cssSelector("#user-name"));
	        WebElement password = driver.findElement(By.cssSelector("#password"));
	        WebElement login = driver.findElement(By.cssSelector("#login-button"));
	        
	        // Dash board element
	        username.sendKeys("standard_user");
	        password.sendKeys("secret_sauce");
	        login.click();
	    
	    
	    
	    
	  }
	    
	  
}
