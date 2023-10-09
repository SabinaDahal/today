package TestNG1;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Day14C {
	
	//Test cases with assertions
	WebDriver driver;
	       @Test
	   

	      @BeforeMethod
	      public void beforeMethod() {
	          System.out.println("Before Method: This will run before each test method");
	      }

	      @AfterMethod
	      public void afterMethod() {
	          System.out.println("After Method: This will run after each test method");
	      }

	      @Test
	      public void test1() {
	          System.out.println("Test 1");
	          int result = 10 + 5;
	          Assert.assertEquals(result, 15, "Expected result is not equal to the actual result.");
	      }

	      @Test
	      public void test2() {
	          System.out.println("Test 2");
	          String str1 = "Hello World";
	          String str2 = "Hello World";
	          Assert.assertTrue(str1.equals(str2), "Strings are not equal.");
	      }
	  }


