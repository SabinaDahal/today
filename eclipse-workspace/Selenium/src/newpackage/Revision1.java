package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Revision1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
				//"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.saucedemo.com/");	

		
	WebElement username=driver.findElement(By.cssSelector("#user-name"));
	WebElement password=driver.findElement(By.cssSelector("#password"));
	WebElement login=driver.findElement(By.cssSelector("#login-button"));
	
	username.sendKeys("standard_user");
	password.sendKeys("secret_sauce");
	login.click();
	
	//driver.close(); 
	
	
	
	
		

	}

}
