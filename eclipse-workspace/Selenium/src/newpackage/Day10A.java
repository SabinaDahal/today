package newpackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
			  WebElement option1 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]"));
          WebElement option2 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(3) > input[type=checkbox]"));
          WebElement option4 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7) > input[type=checkbox]"));

          // Select the checkboxes
          option1.click();
          option2.click();
          option4.click();

          // Check if they are selected
          boolean a1 = option1.isSelected();
          System.out.println("Option 1 selected: " + a1);
          boolean a2 = option2.isSelected();
          System.out.println("Option 2 selected: " + a2);
          boolean a4 = option4.isSelected();
          System.out.println("Option 4 selected: " + a4);

          // Deselect the checkboxes
          option1.click();
          option2.click();
          option4.click();

          // Check if they are deselected
          a1 = option1.isSelected();
          System.out.println("Option 1 deselected: " + !a1);
          a2 = option2.isSelected();
          System.out.println("Option 2 deselected: " + !a2);
          a4 = option4.isSelected();
          System.out.println("Option 4 deselected: " + !a4);

                 //loop through it
          
                  String[] checkboxSelectors = {
                  "#checkboxes > label:nth-child(1) > input[type=checkbox]",
                  "#checkboxes > label:nth-child(3) > input[type=checkbox]",
                  "#checkboxes > label:nth-child(7) > input[type=checkbox]"
              };

              // Loop through the checkbox locators
              for (String selector : checkboxSelectors) {
                  WebElement checkbox = driver.findElement(By.cssSelector(selector));

                  // Select the checkbox
                  checkbox.click();

                  // Check if it is selected
                  boolean isSelected = checkbox.isSelected();
                  System.out.println("Checkbox " + selector + " selected: " + isSelected);

                  // Deselect the checkbox
                  checkbox.click();

                  // Check if it is deselected
                  isSelected = checkbox.isSelected();
                  System.out.println("Checkbox " + selector + " deselected: " + !isSelected);
              }

              // Close the WebDriver
              driver.quit();
      }
  
      }
  

