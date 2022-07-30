package pom.irctc.pages;

import wrappers.GenericWrappers;

public class EnquiryFormSaloonPage extends GenericWrappers {
	
	public EnquiryFormSaloonPage switchToWindow3() {
		switchToLastWindow();
		return this;
	}
	

	
	public EnquiryFormSaloonPage enterName(String data) {
		enterByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.enterName.Xpath"), data);
		return this;
	}
	
	public EnquiryFormSaloonPage enterOrganisation(String data) {
		enterByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.enterOrganisation.Xpath"), data);
		return this;
	}
	
	public EnquiryFormSaloonPage enterAddress(String data) {
		enterByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.enterAddress.Xpath"), data);
		return this;
	}
	
	public EnquiryFormSaloonPage enterMobile(String data) {
		enterByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.enterMobile.Xpath"), data);
		return this;
	}
	
	public EnquiryFormSaloonPage enterEmail(String data) {
		enterByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.enterEmail.Xpath"), data);
		return this;
	}
	
	public EnquiryFormSaloonPage selectCharter(String Value) {
		selectValueByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.selectCharter.Xpath"), Value);
		return this;
	}
	
	public EnquiryFormSaloonPage enterStation(String data) {
		enterByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.enterStation.Xpath"), data);
		return this;
	}
	
	public EnquiryFormSaloonPage enterDestination(String data) {
		enterByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.enterDestination.Xpath"), data);
		return this;
	}
	public EnquiryFormSaloonPage clickCheckIn() {
		clickByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.clcikCheckIN.Xpath"));
		return this;
	}
	public EnquiryFormSaloonPage selectCheckIn() {
		clickByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.selectCheckIn.Xpath"));
		return this;
	}
	
	public EnquiryFormSaloonPage clickcheckOut() {
	    clickByXpath(prop.getProperty("IrctcEnquiryFormPage.clickCheckOut.Xpath"));  
	    return this;
	}

    public EnquiryFormSaloonPage selectCheckOut() {
    	clickByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.selectCheckOut.Xpath"));
    	return this;
    }
    
    public EnquiryFormSaloonPage enterDuration(String data) {
    	enterByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.enterDuration.Xpath"), data);
    	return this;
    }
    
    public EnquiryFormSaloonPage enterCoach(String data) {
    	enterByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.enterCoach.Xpath"), data);
    	return this;
  
    }
    
    public EnquiryFormSaloonPage enterPassengers(String data) {
    	enterByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.enterPassengers.Xpath"), data);
    	return this;
    }
    
    public EnquiryFormSaloonPage enterPurpose(String data) {
    	enterByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.enterPurpose.Xpath"), data);
    	return this;
    }
    
    public EnquiryFormSaloonPage enterAdditional(String data) {
    	enterByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.enterAdditionalDetails.Xpath"), data);
    	return this;
    }
    public GstMobileVerifyOtpPage clickSubmit() {
		clickByXpath(prop.getProperty("IrctcEnquiryFormSaloonPage.clickSubmit.Xpath"));
		return new GstMobileVerifyOtpPage();
	}
    public EnquiryFormSaloonPage waitPageUpload(long time) {
    	waitProperty(time);
    	return this;
    }
   public EnquiryFormSaloonPage scrollDown() {
	   scrollDownByXPath();
	   return this;
   }
    
	
    
}


