package LearnTestng;

import org.testng.annotations.Test;

public class KGF {
	@Test(priority = 2)
	public void garuda() {
		System.out.println("Garuda controlled KGF");
	}
	
	@Test(priority = 3, invocationCount = 7)
	public void rockyBhai() {
		System.out.println("RockyBhai controlled KGF");
	}
	
	@Test(priority = 7)
	public void mumbaiShetty() {
		System.out.println("MumbaiShetty controlled KGF");
	}
	
	@Test(priority = 4)
	public void adheera() {
		System.out.println("Adheera controlled KGF");
	}
	
	@Test(priority = 6)
	public void rajendraDesai() {
		System.out.println("RajendraDesai controlled KGF");
	}
	
	@Test(priority = 5)
	public void ramikaSen() {
		System.out.println("RamikaSen controlled KGF");
	}
	
	@Test(priority = 1)
	public void suryaVardhan() {
		System.out.println("SuryaVardhan controlled KGF");
	}
	
	@Test(enabled = false)
	public void vanaram() {
		System.out.println("Vanaram controlled KGF");
	}
}
