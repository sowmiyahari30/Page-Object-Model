package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PanIndiaPage extends GenericWrappers {
	
	public PanIndiaPage selectTitle(String value) {
		selectValueByXpath(prop.getProperty("PanIndiapage.selectTile.Xpath"), value);
		return this;
	}
	public PanIndiaPage enterFname(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterFirstName.Xpath"), data);
		return this;
	}
	public PanIndiaPage enterMname(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterMiddleName.Xpath"), data);
		return this;
	}
	public PanIndiaPage enterlname(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterLastName.Xpath"), data);
		return this;
	}
	public PanIndiaPage enterFather(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterFatherFirstName.Xpath"), data);
		return this;
	}
	public PanIndiaPage enterFatherM(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterfatherMiddleName.Xpath"), data);
		return this;
	}
	public PanIndiaPage enterFatherL(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterFatherLastName.Xpath"), data);
		return this;
	}
	public PanIndiaPage enterMobile(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterMobile.Xpath"), data);
		return this;
	}
	public PanIndiaPage enterEmail(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterEmail.Xpath"), data);
		return this;
	}
	
	public PanIndiaPage selectIncome(String value) {
		selectValueByXpath(prop.getProperty("PanIndiapage.selectIncome.Xpath"), value);
		return this;
	}
	
	public PanIndiaPage clickCommunication() {
		clickByXpath(prop.getProperty("PanIndiapage.clickCommunication.Xpath"));
		return this;
	}
	public PanIndiaPage enterDOB(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterDOB.Xpath"), data);
		return this;
	}
	public PanIndiaPage enterAdd1(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterAddressLine1.Xpath"), data);
		return this;
	}
	public PanIndiaPage enterAdd2(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterAddressLine2.Xpath"), data);
		return this;
	}
	public PanIndiaPage enterCity(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterCity.Xpath"), data);
		return this;
	}
	public PanIndiaPage selectState(String value) {
		selectValueByXpath(prop.getProperty("PanIndiapage.selectState.Xpath"), value);
		return this;
	}
	public PanIndiaPage enterPin(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterPincode.Xpath"), data);
		return this;
	}
	public PanIndiaPage selectCountry(String value) {
		selectValueByXpath(prop.getProperty("PanIndiapage.selectCountry.Xpath"), value);
		return this;
	}
	public PanIndiaPage enterOffName(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterOfficename.Xpath"), data);
		return this;
	}
	public PanIndiaPage enterOffAdd1(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterOfficeAddress1"), data);
		return this;
	}
	public PanIndiaPage enterArea(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterOfficeArea.Xpath"), data);
		return this;
	}
	public PanIndiaPage enterCity1(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterOfficeCity.Xpath"), data);
		return this;
	}
	public PanIndiaPage selectState1(String value) {
		selectValueByXpath(prop.getProperty("PanIndiapage.enterOfficeState.Xpath"), value);
		return this;
	}
	public PanIndiaPage enterPin1(String data) {
		enterByXpath(prop.getProperty("PanIndiapage.enterOfficePin.Xpath"), data);
		return this;
	}
	public PanIndiaPage selectCountry1(String value) {
		selectValueByXpath(prop.getProperty("PanIndiapage.selectOfficeCountry.Xpath"), value);
		return this;
		}
	public PanIndiaPage selectId(String value) {
		selectValueByXpath(prop.getProperty("PanIndiapage.selectIDproof.Xpath"), value);
		return this;
	}
	public PanIndiaPage selectAddProof(String value) {
		selectValueByXpath(prop.getProperty("PanIndiapage.selectAddressProof.Xpath"), value);
		return this;
	}
	public PanIndiaPage selectDOBProof(String value) {
		selectValueByXpath(prop.getProperty("PanIndiapage.selectDOBProof.Xpath"), value);
		return this;
	}
	public PanIndiaPage selectAadhar(String value) {
		selectValueByXpath(prop.getProperty("PanIndiapage.selectAadhaarProof.Xpath"), value);
		return this;
	}
	public PanIndiaPage selectOffAddProof(String value) {
		selectValueByXpath(prop.getProperty("PanIndiapage.selectOfficeAddressProof.Xpath"), value);
		return this;
	}
	public PanIndiaPage clickCheckbox() {
		clickByXpath(prop.getProperty("PanIndiaPege.clickCheckBox.Xpath"));
		return this;
	}
	public PanIndiaPage waitPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	public PanIndiaPage pageDown() {
		scrollDownByXPath();
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
