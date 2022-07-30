package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.FbSignUp;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify Facebook Sign up for new user registration";
		category="Smoke";
		author="Sowmiya";
		browserName="chrome";
		url="https://www.facebook.com";
		sheetName="TC009";
	}
	
	@Test(dataProvider="fetchData")
	public void facebookSignup(String Name,String lastName,String email,String confirmEmail,String Password,String Month,String Day,String Year) {
		new FbSignUp()
		.createNewAcc()
		.enterFname(Name)
		.enterLastName(lastName)
		.enterEmail(email)
		.reEnterEmail(confirmEmail)
		.enterPassword(Password)
		.selectMonth(Month)
		.selectDay(Day)
		.selectYear(Year)
		.clickGender();
		
	}

}
