package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {

	public RegistrationPageBasicDetails clickOnRegister() {
		clickByXpath(prop.getProperty("IrctcHomePage.clickOnRegister.Xpath"));
		return new RegistrationPageBasicDetails();
	}
	
	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXpath(prop.getProperty("IrctcHomePage.mouseHoverOnHolidays.Xpath"));
		return this;
	}

	public HomePage mouseHoverOnStays() {
		mouseHoverByXpath(prop.getProperty("IrctcHomePage.mouseHoverOnStays.Xpath"));
		return this;
	}
	
	public AccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("IrctcHomePage.clickOnLounge.Xpath"));
		return new AccommodationPage();
	}
	


		
		
	}

