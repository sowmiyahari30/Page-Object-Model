package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
//BookYourCoach
	
	@BeforeClass
	public void beforeclass() {
		testCaseName = "TC002";
		testCaseDescription = "Irctc Registration";
		category = "smoke";
		author="Sowmiya";
		browserName="chrome";
		url="https://stagenget.irctc.co.in/nget/train-search";
		sheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public void irctcBookYourCoach(String UserId,String Password,String Confirmpassword,String SecQues,String SecAns,String Month,String Year,
			String Email,String Occu,String FirstName,
		 String Middlename,String LastName,String nationality,String flatNo,String Street,String Area,String Country,
			 String isd,String Mobile,String Pincode,String City,String State,String PostOff,String flatNoOffice,String StreetOffice,
			 String areaOffice,String CountOffice,String MobileOffice,String PinOffice,String City1,String State1,String PostOff1) {
		 
		
	
	new CovidAlertPage()
	.clickOnOk()
	.mouseHoverOnHolidays()
	.mouseHoverOnStays()
	.clickOnLounge()
	.switchToWindow()
	.waitpageUpload(4000)
	.clickOnMenu()
	.waitpageUpload(4000)
	.clickBookYourTrain()
	.switchToWindow2()
	.clickNewUser()
	.switchToWindow3()
	.enterId(UserId)
	.enterPassword(Password)
	.enterConfirmPassword(Confirmpassword)
	.selectSecQues(SecQues)
	.enterSecAnswer(SecAns)
	.clickDOB()
	.selectDate()
	.waitforPageUpload(4000)
	.clickGender()
	.clickMarrital()
	.enterEmail(Email)
	.selectOccupation(Occu)
	.enterFirstName(FirstName)
	.enterMiddleName(Middlename)
	.enterlastname(LastName)
	.selectNationality(nationality)
	.enterFlatNo(flatNo)
	.enterStreet(Street)
	.enterArea(Area)
	.selectCountry(Country)
	.enterMobile(Mobile)
	.enterPincode(Pincode)
	.waitforPageUpload(4000)
	.selectcity(City)
	
	.selectstate(State)
	.waitforPageUpload(4000)
	.selectPostOff(PostOff)
	.waitforPageUpload(4000)
	.clickNo()
	.enterOffNo(flatNoOffice)
	.enterOffStreet(StreetOffice)
	.enterOffArea(areaOffice)
	.selectOffCountry(CountOffice)
	.enterMobile1(MobileOffice);
	//.enterOffPin("600116");
	}	
	
}
