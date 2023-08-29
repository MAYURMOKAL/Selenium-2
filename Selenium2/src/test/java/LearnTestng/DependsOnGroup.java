package LearnTestng;

import org.testng.annotations.Test;

public class DependsOnGroup {
	@Test(groups = "functional")
	public void testCase1() {
		System.out.println("Functional TestCase 1");
	}
	@Test(groups = "functional")
	public void testCase2() {
//		int a[] = {1,2,3};
//		System.out.println(a[4]);
		System.out.println("Functional TestCase 2");
	}
	@Test(groups = "integration" , dependsOnGroups = "functional")
	public void testCase3() {
		System.out.println("Integration TestCase 1");
	}
}
