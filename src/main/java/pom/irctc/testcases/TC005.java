package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	@BeforeClass
	public void beforeclass() {
		testCaseName="TC005";
		testCaseDescription="Irctc Gst Verification";
		author = "Sowmiya";
		category ="smoke";
		browserName ="chrome";
		url = "https://stagenget.irctc.co.in/nget/train-search";
		sheetName="TC005";
		
	}
	@Test(dataProvider="fetchData")
	
	public void irctcGst(String Email,String MobileNo,String Destination,String HotelRoom,String Hoteladult,String Email1,String MobileNo1,
			String Title,String FirstName,String LastName,String country,String State,String Gst,String CompanyName,String CompanyAddress,String Gstno,String Text) {
		
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
		.waitPageUpload(4000)
		.clickCity()
		.waitPageUpload(4000)
		.clickCheckInDate()
		.waitPageUpload(4000)
		.selectCheckIndate()
		.waitPageUpload(4000)
		.clickCheckOutDate()
		.waitPageUpload(4000)
		.selectCheckOutDate()
		.waitPageUpload(4000)
		.clickHotelRoom()
		.waitPageUpload(4000)
		.selectHotelRoom(HotelRoom)
        .selectValueAdult(Hoteladult)
        .waitPageUpload(4000)
		.clickDone()
		.waitPageUpload(4000)
		.clickFindHotels()
		.selectHotel()
		.switchToWindow3()
		.waitPageUpload(4000)
		.verifyTitleHotel("Oga Elements Hostel @ Near Chetpet Railway Station")
		//.verifyPrice("₹ 3500")
		.clickBookOnHotel()
		.clickGuestUserLogin()
		.enterEmail(Email1)
		.enterMobile(MobileNo)
		.clickLogin()
		.selectTitle(Title)
		.enterName(FirstName)
		.enterLastName(LastName)
		.selectCountry(country)
		.selectState(State)
		.selectGst(Gst)
		.enterGst(Gstno)
		.enterCompanyName(CompanyName)
		.enterCompanyAddress(CompanyAddress)
		.verifyPrice("345789")
		.waitPageUpload(4000)

		.clickContinue()
		.verifyGst(Text);
		
		
	}

}
