package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Day8A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sabina\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
		WebElement select = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		Select dropdown = new Select(select);
		dropdown.selectByIndex(0);		
		dropdown.selectByValue("python");
		dropdown.selectByVisibleText("Python");
		
		List<WebElement> opt = dropdown.getOptions();
//		for(int i = 0 ; i < opt.size(); i++) {
//			dropdown.selectByIndex(i);
//		}
				
		List<WebElement> opt1 = dropdown.getOptions();
		for(int i = 0 ; i < opt.size(); i++) {
			System.out.println(opt1.get(i).getText());
			if(opt1.get(i).getText().startsWith("P")) {
				dropdown.selectByVisibleText(opt1.get(i).getText());
				break;
			}
		}
			
		driver.close();

	}

}
