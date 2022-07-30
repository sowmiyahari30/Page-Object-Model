package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PhpPage extends GenericWrappers{
	
	public PhpPage enterFname(String data) {
		enterByXpath(prop.getProperty("PhPTravelsPage.enterFirstName.Xpath"), data);
		return this;
	}
	public PhpPage enterLname(String data) {
		enterByXpath(prop.getProperty("PhPTravelsPage.enterLastName.Xpath"), data);
		return this;
	}
	public PhpPage enterEmail(String data) {
		enterByXpath(prop.getProperty("PhPTravelsPage.enterEmail.Xpath"), data);
		return this;
	}
	public PhpPage enterPhone(String data) {
		enterByXpath(prop.getProperty("PhPTravelsPage.enterPhone.Xpath"), data);
		return this;
	}
	public PhpPage enterCompany(String data) {
		enterByXpath(prop.getProperty("PhPTravelsPage.enterCompany.Xpath"), data);
		return this;
	}
	public PhpPage enterAddress(String data) {
		enterByXpath(prop.getProperty("PhPTravelsPage.enterAddress1.Xpath"), data);
		return this;
	}
	public PhpPage enterAddress1(String data) {
		enterByXpath(prop.getProperty("PhPTravelsPage.enterAddress2.Xpath"), data);
		return this;
		}
	public PhpPage enterCity(String data) {
		enterByXpath(prop.getProperty("PhPTravelsPage.enterCity.Xpath"), data);
		return this;
	}
	public PhpPage enterState(String data) {
		enterByXpath(prop.getProperty("PhPTravelsPage.enterState.Xpath"), data);
		return this;
	}
	public PhpPage enterPin(String data) {
		enterByXpath(prop.getProperty("PhPTravelsPage.enterPin.Xpath"), data);
		return this;
	}
	public PhpPage selectCountry(String value) {
		selectValueByXpath(prop.getProperty("PhPTravelsPage.selectCountry.Xpath"), value);
		return this;
	}
    public PhpPage enterAdditionalDetails(String data) {
    	enterByXpath(prop.getProperty("PhPTravelsPage.enterAdditionalDetails.Xpath"), data);
    	return this;
    }
    public PhpPage enterPassword(String data) {
    	enterByXpath(prop.getProperty("PhPTravelsPage.enterPassword.Xpath"), data);
    	return this;
    }
    public PhpPage enterConfirm(String data) {
    	enterByXpath(prop.getProperty("PhpTravelspage.enterConfirmPassword.Xpath"), data);
    	return this;
    }
}
