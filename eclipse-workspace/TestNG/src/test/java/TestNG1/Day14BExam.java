package TestNG1;
import org.testng.annotations.Test;

public class Day14BExam {
	
	//6 Group the test cases as login
	  @Test(groups={"smoke"})
	    public void Testcase1() {
	      System.out.println("smoke test1");
	    }
	    @Test(groups={"smoke","regression"})
	    public void Testcase2() {
	      System.out.println("smoke test2");
	    }
	    @Test(groups={"smoke"})
	    public void Testcase3() {
	      System.out.println("smoke test3");
	    

	  }
	  }

	


