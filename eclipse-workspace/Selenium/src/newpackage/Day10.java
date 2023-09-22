package newpackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		

		   WebElement option1=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]"));
		      WebElement option2=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(3) > input[type=checkbox]"));
		      WebElement option4=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7) > input[type=checkbox]"));
		      WebElement option3=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));
		      option1.click();
		      option2.click();
		      option4.click();
		      
		      
		      
		    
		      boolean a1 = option1.isSelected();
		      System.out.println(a1);
		      boolean a2 = option2.isSelected();
		      System.out.println(a2);
		      boolean a3 = option3.isSelected();
		      System.out.println(a3);
		      boolean a4 = option4.isSelected();
		      System.out.println(a4);
		      
		      //for  loop
		      for (String selector : args) {
		              WebElement checkbox = driver.findElement(By.cssSelector(selector));
		              checkbox.click();
		
	}

} }
