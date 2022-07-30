package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPageAddress extends GenericWrappers {
	
	public RegistrationPageAddress enterFNo(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.enterFlatNo.Xpath"), data);
		return this;
	}
	public RegistrationPageAddress enterStreet(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.enterStreet.Xpath"), data);
		return this;
	}
	public RegistrationPageAddress enterArea(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.enterArea.Xpath"), data);
		return this;
	}
	public RegistrationPageAddress enterPin(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.enterPin.Xpath"), data);
		return this;
	}
    public RegistrationPageAddress enterState(String data) {
    	enterByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.enterState.Xpath"), data);
    	return this;
    }
    public RegistrationPageAddress selectCity(String value) {
    	selectValueByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.selectCity.Xpath"), value);
    	return this;
    }
    public RegistrationPageAddress selectPostoff(String value) {
    	selectValueByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.selectPostOffice.Xpath"), value);
    	return this;
    }
    public RegistrationPageAddress enterPhone(String data) {
    	enterByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.enterPhone.Xpath"), data);
    	return this;
    }
    public RegistrationPageAddress clickRadio() {
    	clickByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.clickRadio.Xpath"));
    	return this;
    }
    public RegistrationPageAddress enterOffAddress1(String data) {
    	enterByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.enterOfficeAddress1.Xpath"), data);
    	return this;
    }
    public RegistrationPageAddress enterOffAddress2(String data) {
    	enterByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.enterOfficeAddress2.Xpath"), data);
    	return this;
    }
    public RegistrationPageAddress enterOffArea(String data) {
    	enterByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.enterOffArea.Xpath"), data);
    	return this;
    }
    public RegistrationPageAddress selectCountry() {
    	clickByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.selectCountry.Xpath"));
    	return this;
    }
    public RegistrationPageAddress chooseCountry() {
    	clickByXpath(prop.getProperty("IrctcRegistrationPageAddressDetails.chooseCountry.Xpath"));
    	return this;
    }
    public RegistrationPageAddress enterPincode(String data) {
    	enterByXpath(prop.getProperty("IrctcRegistrationpageAddressDetails.enterPincode.Xpath"), data);
    	return this;
    }
    public RegistrationPageAddress enterOffcity(String value) {
    	 enterByXpath(prop.getProperty("IrctcRegistrationpageAddressDetails.enterOfficeCity.Xpath"), value);
    	 return this;
    	 
    }
    public RegistrationPageAddress enterOffphone(String value) {
    	enterByXpath(prop.getProperty("IrctcRegistrationpageAddressDetails.enterOfficePhone.Xpath"), value);
    	return this;
    }
    public RegistrationPageAddress enterOffPost(String value) {
    	enterByXpath(prop.getProperty("IrctcRegistrationpageAddressDetails.enterOfficePostOffice.Xpath"), value);
    	return this;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
