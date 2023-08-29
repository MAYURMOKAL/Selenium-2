package LearnTestng;

import org.testng.annotations.Test;

public class ClassB extends ClassA {

	@Test
	public void testA() {
		System.out.println("testA");
	}
	
	@Test
	public void testB() {
		System.out.println("testB");
	}
	
	@Test
	public void testC() {
		System.out.println("testC");
	}
	
	@Test
	public void testD() {
		System.out.println("testD");
	}
}
