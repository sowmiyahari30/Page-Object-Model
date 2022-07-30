package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers {
	
	public AccommodationPage clickOnMenu() {
		clickByXpath(prop.getProperty("IrctcAccomodationPage.clickOnMenu.Xpath"));
		return this;
	}
	public NewUserSignUpPage clickBookYourTrain() {
		clickByXpath(prop.getProperty("IrctcAccomodationPage.clickBookYourTrain.Xpath"));
		return new NewUserSignUpPage();
	}
	public EnquiryForm clickOnCharter() {
		clickByXpath(prop.getProperty("IrctcAccomodationPage.clickOnCharter.Xpath"));
		return new EnquiryForm();
	}
     public HotelBookingPage clickHotel() {
    	 clickByXpath(prop.getProperty("IrctcAccomodationpage.clickHotel.Xpath"));
    	 return new HotelBookingPage();
     }
     public GuestUserLoginPage clickLogin() {
    	 clickByXpath(prop.getProperty("IrctcAccomodationPage.clickLogin.Xpath"));
    	 return new GuestUserLoginPage();
    	 
     }
     public AccommodationPage switchToWindow() {
 		switchToLastWindow();
 		return  this;
 	}
     public AccommodationPage waitpageUpload(long time) {
    	 waitProperty(time);
    	 return this;
    	 
     }
   

     
}
