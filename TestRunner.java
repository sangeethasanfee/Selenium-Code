package pkg;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;	

public class TestRunner {
	public static void main(String[] args) {									
	      Result result = Assertion.runClasses(Assertion.class);					
				for (Failure failure : result.getFailures()) {							
	         System.out.println(failure.toString());					
	      }		
	      System.out.println("Result=="+result.wasSuccessful());	

}
}
