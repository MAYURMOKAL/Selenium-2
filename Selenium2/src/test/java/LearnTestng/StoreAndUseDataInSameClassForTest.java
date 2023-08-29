package LearnTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StoreAndUseDataInSameClassForTest {

	@Test(dataProvider = "storeDataHere")
	public void facebookSignup (String firstName, String surName, String emailAddress, String password, String day, String month, String year, String gender){
		System.out.println("My firstName is : " + firstName);
		System.out.println("My surName is : " + surName);
		System.out.println("My emailAddress is : " + emailAddress);
		System.out.println("My password is : " + password);
		System.out.println("My DOB is : " + day +"-" + month + "-" + year);
		System.out.println("My gender is : " + gender);
	}

// Create the Non-Static Method
	// Return type should be Two dimensional Array Object
	
	@DataProvider
	public Object [][] storeDataHere(){
		Object [][] obj = new Object [2][8]; //Count values
		
		obj[0][0] = "sai";
		obj[0][1] = "Pallavi";
		obj[0][2] = "saipallavi@gmail.com";
		obj[0][3] = "saipallavi@1234";
		obj[0][4] = "9";
		obj[0][5] = "May";
		obj[0][6] = "1992";
		obj[0][7] = "Female";
		
		obj[1][0] = "Vikram";
		obj[1][1] = "Batra";
		obj[1][2] = "kargilHero@gmail.com";
		obj[1][3] = "Dil_Mange_More";
		obj[1][4] = "9";
		obj[1][5] = "Sep";
		obj[1][6] = "1974";
		obj[1][7] = "Male";
		return obj;
	}
}

