package LearnTestng;

import org.testng.annotations.Test;

public class ClassC {
// Group Execution
	
	@Test(groups = "functional")
	public void testE() {
		System.out.println("testE");
	}
	
	@Test(groups = "integration")
	public void testF() {
		System.out.println("testF");
	}
	
	@Test(groups = {"system","integration"})
	public void testG() {
		System.out.println("testG");
	}
	
	@Test(groups = {"smoke","integration"})
	public void testH() {
		System.out.println("testH");
	}
}
