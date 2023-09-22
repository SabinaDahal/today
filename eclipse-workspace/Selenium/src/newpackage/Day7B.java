package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Day7B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

	//	WebElement option1 =driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]"));
		//WebElement option2=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(3) > input[type=checkbox]"));
		//WebElement option3=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));
	//	WebElement option4=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7) > input[type=checkbox]"));
		//option1.click();
	//	option2.click();
		//option3.click();
	//	option4.click();

		// assertion

		//boolean q1 = option1.isSelected();
	//	boolean q2 = option1.isSelected();
		//boolean q3 = option1.isSelected();
	//	boolean q4 = option1.isSelected();

		//System.out.println(q1);
	//	System.out.println(q2);
		//System.out.println(q3);
	//	System.out.println(q4);
		
	}

}
