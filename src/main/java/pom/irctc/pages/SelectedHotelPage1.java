package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SelectedHotelPage1 extends GenericWrappers {
	
	public SelectedHotelPage1 selectTitle(String value) {
		selectValueByXpath(prop.getProperty("IrctcSelectedHotelPage1.selectTitle.Xpath"), value);
		return this;
	}
    public SelectedHotelPage1 enterName(String data) {
    	enterByXpath(prop.getProperty("IrctcSelectedHotelPage1.enterName.Xpath"), data);
    	return this;
    }
    public SelectedHotelPage1 enterLastName(String data) {
    	enterByXpath(prop.getProperty("IrctcSelectedHotelPage1.enterLastName.Xpath"), data);
    	return this;
    }
    public SelectedHotelPage1 selectCountry(String value) {
    	selectValueByXpath(prop.getProperty("IrctcSelectedHotelPage1.selectCountry.Xpath"), value);
    	return this;
    }
    public SelectedHotelPage1 selectState(String value) {
    	selectValueByXpath(prop.getProperty("IrctcSelectedHotelPage1.selectState.Xpath"), value);
    	return this;
    }
    public SelectedHotelPage1 enterMobile(String data) {
    	enterByXpath(prop.getProperty("IrctcSelectedHotelPage1.enterMobile.Xpath"), data);
    	return this;
    }
    public SelectedHotelPage1 enterEmail(String data) {
    	enterByXpath(prop.getProperty("IrctcSelectedHotelPage1.enterEmail.Xpath"), data);
    	return this;
    }
    public SelectedHotelPage1 selectGst(String value) {
    	selectValueByXpath(prop.getProperty("IrctcSelectedHotelPage1.selectGst.Xpath"), value);
    	return this;
    }
    public GstMobileVerifyOtpPage clickContinue() {
    	clickByXpath(prop.getProperty("IrctcSelectedHotelPage1.clickContinue.Xpath"));
    	return new GstMobileVerifyOtpPage();
    }
    public SelectedHotelPage1 enterGst(String data) {
    	enterByXpath(prop.getProperty("IrctcSelectedHotelPage1.enterGst.Xpath"), data);
    	return this;
    	
    }
    public SelectedHotelPage1 enterCompanyName(String data) {
    	enterByXpath(prop.getProperty("IrctcSelectedHotelPage1.enterCompanyName.Xpath"), data);
    	return this;
    }
    public SelectedHotelPage1 enterCompanyAddress(String data) {
    	enterByXpath(prop.getProperty("IrctcSelectedHotelPage1.enterCompanyAddress.Xpath"), data);
    	return this;
    }
    public SelectedHotelBookingPage clickCont() {
    	clickByXpath(prop.getProperty("IrctcSelectedHotelPage1.clickCont.Xpath"));
    	return new SelectedHotelBookingPage();
    }

	  public SelectedHotelPage1 verifyPrice(String text) {
		  verifyTextContainsByXpath(prop.getProperty("IrctcSelectedHotelPage1.verifyPrice.Xpath"), text);
	    	return this;
	    }
	  public SelectedHotelPage1 waitPageUpload(long time) {
		  waitProperty(time);
		  return this;
	  }
  
    

}
