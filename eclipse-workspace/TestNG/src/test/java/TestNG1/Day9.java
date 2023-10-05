package TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day9 {

WebDriver driver;
	
	@DataProvider(name = "loginData")
	public Object[][]  provideLoginData(){
		return new Object [][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
		};
		
	}
	
	@Test(dataProvider = "loginData")
	public  void Login(String username , String pass) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		boolean avail = driver.getCurrentUrl().contains("inventory");
		Assert.assertTrue(avail);
		driver.close();
	}}
	
	

//	@Test
//	public  void Login2() {
//		
//		System.setProperty("webdriver.chrome.driver",
//"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
//ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com");
//		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		boolean avail = driver.getCurrentUrl().contains("inventory");
//		Assert.assertTrue(avail);
//		driver.close();
//		
//	}
	
	
	
	
	
	
	
	

