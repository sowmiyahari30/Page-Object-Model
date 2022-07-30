package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SelectedHotelBookingPage extends GenericWrappers{
	
	public SelectedHotelBookingPage switchToWindow3() {
		switchToLastWindow();
		return this;
	}
	public SelectedHotelBookingPage waitPageUpload(long time) {
		waitProperty(time);
		return this;
	}
	
	
	  public SelectedHotelBookingPage verifyPrice(String text) {
		  verifyTextContainsByXpath("//div[contains(@class,'faredetails-in faredetails-in-total')]/strong", text);
	    	return this;
	    }
	    public SelectedHotelBookingPage verifyTitleHotel(String text) {
	    	verifyTextContainsByXpath(prop.getProperty("IrctcSelectedHotelBookingPage.verifyHotelName.Xpath"), text);
	    	return this;
	    }
	   
	
	public GuestUserLoginPage clickBookOnHotel() {
		clickByXpath(prop.getProperty("IrctcSelectedHotelBookingPage.clickBookOnhotel.Xpath"));
		return new GuestUserLoginPage();
	}
	
		public SelectedHotelBookingPage clickIAgree() {
			clickByXpath(prop.getProperty("IrctcSelectedHotelBookingPage.clickIagree.Xpath"));
			return this;
		}
		public GstMobileVerifyOtpPage clickOnPayment() {
			clickByXpath(prop.getProperty("IrctcSelectedHotelBookingPage.clickOnPayment.Xpath"));
			return new GstMobileVerifyOtpPage();
			
		}


	

		
	}
	

