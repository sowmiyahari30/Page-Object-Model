package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	@BeforeClass
	public void beforeclass() {
		testCaseName = "TC003";
		testCaseDescription = "IRCTc Charter";
		category = "smoke";
		author="Sowmiya";
		browserName="chrome";
		url="https://stagenget.irctc.co.in/nget/train-search";
		sheetName="TC003";
	}
	
	@Test(dataProvider="fetchData")
	
	public void irctcCharter(String Name,String Organization,String Address,String Mobile,String Email,
			String RequestFor,String Origin,String DestStation,String Duration,String Coach,String PassengerNo,String Purpose,String Services,String Text) 
		
		
	{
	
	new CovidAlertPage() 
	.clickOnOk()
	.mouseHoverOnHolidays()
	.mouseHoverOnStays()
	.clickOnLounge()
	.switchToWindow()
	.clickOnMenu()
	.clickOnCharter()
	.switchToWindow2()
	.clickEnquiry()
	.switchToWindow3()
	.enterName(Name)
	.enterOrganisation(Organization)
	.enterAddress(Address)
	.enterMobile(Mobile)
	.enterEmail(Email)
	.selectCharter(RequestFor)
	.enterStation(Origin)
	.enterDestination(DestStation)
	.clickCheckIn()

	.waitPageUpload(4000)
	.selectCheckIn()
	.waitPageUpload(4000)
	.clickcheckOut()
	.scrollDown()
	.waitPageUpload(4000)
	
	.selectCheckOut()
	.enterDuration(Duration)
	 .enterCoach(Coach)
	 .enterAdditional(Services)
	 .clickSubmit()
	.verifyMobileText(Text);

	}}
