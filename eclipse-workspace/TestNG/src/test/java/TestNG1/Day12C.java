package TestNG1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day12C {
	@Parameters({"browser"})
	@Test
	public void TestcaseFour(@Optional("chromeC")String bw) {
		System.out.println(bw);
	}




}
