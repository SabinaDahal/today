package TestNG1;

import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions; 
import org.testng.Assert; 
import org.testng.annotations.Test; 

public class Day6 {

	 WebDriver driver; 
	  
	 @Test 
	 public void TestCase1() { 
	   
	  // javascript executor to click on element 
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	  
	    driver.get("http://www.webdriveruniversity.com/"); 
	  //driver.findElement(By.id("contact-us")).click();  
	  WebElement contatcUsLink  = driver.findElement(By.id("contact-us")); 
	  JavascriptExecutor je = (JavascriptExecutor) driver; 
	  je.executeScript("arguments[0].click()",contatcUsLink );  
	  driver.close(); 
	   
	    
	 } 
	  
	 @Test() 
	 public void TestCase2() throws InterruptedException { 
	  // javascript executor to click on element 
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
	    	ChromeDriver driver = new ChromeDriver(); 
	  driver.get("http://www.webdriveruniversity.com/"); 
	  //driver.findElement(By.id("contact-us")).click();  
	  WebElement scrollElement  = driver.findElement(By.id("scrolling-around")); 
	  JavascriptExecutor je = (JavascriptExecutor) driver; 
	  je.executeScript("arguments[0].scrollIntoView(true)", scrollElement); 
	  Thread.sleep(5000); 
	  driver.close(); 
	 } 
	  
	 // set up new attribute for element 
	 // <h1 id = "hello">Hello</h1> 
	  
	 @Test() 
	 public void TestCase3() throws InterruptedException { 
	  // Javascript executor to click on element 
	 
		 	System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	  driver.get("http://www.webdriveruniversity.com/"); 
	  
	  //driver.findElement(By.id("contact-us")).click();  
	  WebElement scrollElement  = driver.findElement(By.id("scrolling-around")); 
	  JavascriptExecutor je = (JavascriptExecutor) driver; 
	  je.executeScript("arguments[0].setAttribute('data-cy','two')", scrollElement); 
	  //je.executeScript("arguments[0].removeAttribute('data-cy')", scrollElement); 
	  String attributeValue = scrollElement.getAttribute("data-cy");// two 
	  System.out.println(attributeValue); 
	  //driver.close(); 
	 } 
	  
	 @Test 
	 public void TestCase4() throws InterruptedException { 
	  // javascript executor to click on element 
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	  driver.get("http://www.webdriveruniversity.com/"); 
	  //driver.findElement(By.id("contact-us")).click();  
	  WebElement scrollElement  = driver.findElement(By.id("scrolling-around")); 
	  JavascriptExecutor je = (JavascriptExecutor) driver; 
	  String title = (String)je.executeScript("return document.title;"); 
	  // First parameter of  JavascriptExecutor is script 
	  Assert.assertEquals(title, "WebDriverUniversity.com"); 
	  driver.close(); 
	 } 
	  
	 @Test 
	 public void TestCase5() throws InterruptedException { 
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	  driver.get("http://www.webdriveruniversity.com/Actions/index.html"); 
	  Actions ac = new Actions(driver); 
	  WebElement e = driver.findElement(By.id("double-click")); 
	  ac.doubleClick(e).build().perform(); 
	  String className = e.getAttribute("class"); 
	  Assert.assertEquals(className, "div-double-click double"); 
	  driver.close();  
	 } }

