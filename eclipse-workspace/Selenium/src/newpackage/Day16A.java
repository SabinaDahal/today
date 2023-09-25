package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day16A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabin\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		// Selecting the element
		driver.get("https://www.makemytrip.com/");
		
		
		
		
		

       //  Find and select the FROM, TO, and DEPARTURE TIME elements using appropriate CSS selectors
     //   Elements fromElements = document.select(".from-city"); // Replace with the actual selector for the 'FROM' element
      //  Elements toElements = document.select(".to-city");     // Replace with the actual selector for the 'TO' element
      //  Elements departureTimeElements = document.select(".departure-time"); // Replace with the actual selector for the 'DEPARTURE TIME' element

        // Extract and print the text content of the selected elements
     //   for (int i = 0; i < fromElements.size(); i++) {
         //   String from = fromElements.get(i).text();
         //   String to = toElements.get(i).text();
         //   String departureTime = departureTimeElements.get(i).text();

        //    System.out.println("FROM: " + from);
        //    System.out.println("TO: " + to);
         //   System.out.println("DEPARTURE TIME: " + departureTime);
        //    System.out.println("------");
        }
 //   catch (Exception e) {
   //     e.printStackTrace();
    }





