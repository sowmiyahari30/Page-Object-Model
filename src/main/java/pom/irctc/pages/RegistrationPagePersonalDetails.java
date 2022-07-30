package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPagePersonalDetails extends GenericWrappers{
	
	public RegistrationPagePersonalDetails enterFname(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPagePersonalDetails.enterfirstName.Xpath"), data);
		return this;
	}
	public RegistrationPagePersonalDetails enterMname(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPagePersonalDetails.enterMiddleName.Xpath"), data);
		return this;
	}
	public RegistrationPagePersonalDetails enterLname(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPagePersonalDetails.enterLastName.Xpath"), data);
		return this;
	}
	public RegistrationPagePersonalDetails clickOccu() {
		clickByXpath(prop.getProperty("IrctcRegistrationPagePersonalDetails.clickOccupation.Xpath"));
		return this;
	}
	public RegistrationPagePersonalDetails selectOccu() {
		clickByXpath(prop.getProperty("IrctcRegistrationPagePersonalDetails.selectOccupation.Xpath"));
		return this;
	}
	public RegistrationPagePersonalDetails DateofBirth() {
		clickByXpath(prop.getProperty("IrctcRegistrationPagePersonalDetails.clickDateOfBirth.Xpath"));
		return this;
	}
	public RegistrationPagePersonalDetails selectmarrital() {
		clickByXpath(prop.getProperty("IrctcRegistrationPagePersonalDetails.clickMarritalStatus.Xpath"));
		return this;
	}
	public RegistrationPagePersonalDetails clickGender() {
		clickByXpath(prop.getProperty("IrctcRegistrationPagePersonalDetails.clickGender.Xpath"));
		return this;
	}
	public RegistrationPagePersonalDetails selectCountry(String value) {
		selectValueByXpath(prop.getProperty("IrctcRegistrationPagePersonalDetails.selectCountry.Xpath"), value);
		return this;
	}
	public RegistrationPagePersonalDetails enterEmail(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPagePersonalDetails.enterEmail.Xpath"), data);
		return this;
	}
	public RegistrationPagePersonalDetails enterMobile(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPagePersonalDetails.enterMobile.Xpath"),data);
		return this;
	}
	public RegistrationPagePersonalDetails selectNationality(String value) {
		selectValueByXpath(prop.getProperty("IrctcRegistrationPagePersonalDetails.selectNationality.Xpath"), value);
		return this;
	}
	public RegistrationPageAddress clickCont() {
		clickByXpath(prop.getProperty("IrctcRegistrationPageBasicDetails.clickContinue.Xpath"));
		return new RegistrationPageAddress();
	}
	public RegistrationPagePersonalDetails waitPageLoad(long time) {
		waitProperty(time);
		return this;
	}

}
