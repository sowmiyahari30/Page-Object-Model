package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	@BeforeClass
	public void beforeclass() {
		testCaseName = "TC004";
		testCaseDescription = "IRCTC OTP Verification";
		category ="smoke";
				author="Sowmiya";
			browserName = "chrome";
			url = "https://stagenget.irctc.co.in/nget/train-search";
			sheetName="TC004";
		
		
	}
	@Test(dataProvider="fetchData")
	
	public void irctcHotelOtp(String Email,String MobileNo,String Destination,String HotelRoom,String HotelAdult,String Title,
			String FirstName,String LastName,String Country,String State,String Gst,String Text) {
		
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToWindow()
		.clickOnMenu()
		.clickHotel()
		.switchToWindow2()
		.waitPageUpload(4000)
		.enterCity(Destination)
		.waitPageUpload(3000)
		.clickCity()
		.waitPageUpload(3000)
		.clickCheckInDate()
		.waitPageUpload(5000)
		.selectCheckIndate()
		.waitPageUpload(5000)
		.clickCheckOutDate()
		.waitPageUpload(5000)
		.selectCheckOutDate()
		.waitPageUpload(5000)
		.clickHotelRoom()
		.waitPageUpload(5000)
		.selectHotelRoom(HotelRoom)
        .selectValueAdult(HotelAdult)
		.clickDone()
		.clickFindHotels()
		.waitForPageUpload(4000)
		.selectHotel()
		.switchToWindow3()
		.verifyTitleHotel("Oga Elements Hostel @ Near Chetpet Railway Station")
	     //.verifyPrice("3498")
		.clickBookOnHotel()
		.clickGuestUserLogin()
		.enterEmail(Email)
		.enterMobile(MobileNo)
		.clickLogin()
		.selectTitle(Title)
		.enterName(FirstName)
		.enterLastName(LastName)
		.selectCountry(Country)
		.selectState(State)
		.verifyPrice("3478")
		.selectGst(Gst)
		.clickCont()
		
		.clickIAgree()
		.clickOnPayment()
		.clickVerify()
		.verifyOtp(Text);
		
	}

}
