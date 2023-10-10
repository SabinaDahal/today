package TestNG1;


import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Day15Assignment {

	 WebDriver driver;
	 
	 @Test
	 public void TestCaseOne(){
	  
	
		 
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	  driver.get("http://www.webdriveruniversity.com/");
	  driver.findElement(By.id("contact-us")).click();
	  Set <String > handles = driver.getWindowHandles();
	  boolean windowFound  = false;
	  for( String wd:handles) {
	   System.out.println(wd);
	   driver.switchTo().window(wd);
	   if(driver.getCurrentUrl().contains("Contact-Us")){
	    windowFound = true;
	   }
	  }
	  
	  Assert.assertTrue(windowFound);
	  
	  TakesScreenshot screenshot = (TakesScreenshot)driver;
	  // Capturing the screenshot as file
	  File src = screenshot.getScreenshotAs(OutputType.FILE);
	  String path ="C:\\Users\\sabin\\eclipse-workspace\\TestNG\\src\\test\\java\\TestNG1\\img.png";
	  File destination = new File(path);
	  try {
	   FileUtils.copyFile(src,destination);
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
}}
