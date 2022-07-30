package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeclass() {
		testCaseName = "TC001";
		testCaseDescription = "Irctc Registration";
		category = "smoke";
		author="Sowmiya";
		browserName="chrome";
		url="https://stagenget.irctc.co.in/nget/train-search";
		sheetName="TC001";
	}
	
	@Test(dataProvider="fetchData")
	public void irctcRegistration(String UserName,String UserPassword,String ConfirmPassword,String FirstName,String MiddleName,String LastName,
			String Email,String Mobile,String ResAddress1,String ResAddress2,String ResAddress3,String Pincode,String ResState,String ResPhone,
			String offAddress1,String offAddress2,String offAddress3,String offPincode,String offState,String offCity,String offPostOff,String offPhone) {
		//Registration
		new CovidAlertPage()
		.clickOnOk()
		.clickOnRegister()
		.waitPageLoad(4000)
		.enterUserName(UserName)
		.enterPassword(UserPassword)
		.enterConfirmPassword(ConfirmPassword)
		.clickLanguage()
		.SelectLanguage()
		.waitPageLoad(4000)
		.clickSecQues()
		.waitPageLoad(4000)
		.SelectSecQues()
		.SecAns("Rajinikanth")
		.clickContinue()
		.enterFname(FirstName)
		.enterMname(MiddleName)
		.enterLname(LastName)
		.waitPageLoad(4000)
		.clickOccu()
		.selectOccu()
		.DateofBirth()
		.selectmarrital()
		.clickGender()
		.selectCountry("94")
		.enterEmail(Email)
		.enterMobile(Mobile)
		.selectNationality("10000")
		.clickCont()
		.enterFNo(ResAddress1)
		.enterStreet(ResAddress2)
		.enterArea(ResAddress3)
		.enterPin(Pincode)
		.enterState(ResState)
		.selectCity("Kanchipuram")
		.selectPostoff("Sriramachandra Deemed Uty S.O")
		.enterPhone(ResPhone)
		.clickRadio()
		.enterOffAddress1(offAddress1)
		.enterOffAddress2(offAddress2)
		.enterOffArea(offAddress3)
		.selectCountry()
		.chooseCountry()
		.enterPincode(offPincode)
		.enterOffcity("kanchipuram")
		.enterOffPost("Sriramachandra Deemed Uty S.O")
		.enterOffphone(offPhone);
		
		
		
	}

}
