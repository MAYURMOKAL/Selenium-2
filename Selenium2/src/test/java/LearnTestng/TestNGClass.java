package LearnTestng;

import org.testng.annotations.Test;

public class TestNGClass {
	@Test(dataProvider = "storeDataHere" , dataProviderClass = DataClass.class)
	public void facebookSignup (String firstName, String surName, String emailAddress, String password, String day, String month, String year, String gender){
		System.out.println("My firstName is : " + firstName);
		System.out.println("My surName is : " + surName);
		System.out.println("My emailAddress is : " + emailAddress);
		System.out.println("My password is : " + password);
		System.out.println("My DOB is : " + day +"-" + month + "-" + year);
		System.out.println("My gender is : " + gender);
	}
}
