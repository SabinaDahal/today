package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {
	private WebDriver driver;

	public Utils(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verifyTitle(WebDriver driver, String expectedTitle) {
		String actualTitle = driver.getTitle();
		return actualTitle.equals(expectedTitle);
	}
	
	public void selectDropDown(WebDriver driver,WebElement dropDown, String optionToselect) {
		Select select = new Select(dropDown);
		select.deselectByVisibleText(optionToselect);
	}
	
	public void selectDropDownByIndex(WebDriver driver,WebElement dropDown, int optionToselect) {
		Select select = new Select(dropDown);
		select.selectByIndex(optionToselect);
	}
	
}
