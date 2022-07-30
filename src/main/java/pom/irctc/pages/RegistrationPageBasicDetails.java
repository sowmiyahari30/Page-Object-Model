package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPageBasicDetails extends GenericWrappers{
	
	public RegistrationPageBasicDetails enterUserName(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPageBasicDetails.enterUserName.Xpath"), data);
		return this;
	}
    public RegistrationPageBasicDetails enterPassword(String data) {
    	enterByXpath(prop.getProperty("IrctcRegistrationPageBasicDetails.enterPassword.Xpath"), data);
    	return this;
    }
    
	public RegistrationPageBasicDetails enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPageBasicDetails.enterConfirmPassword.Xpath"), data);
		return this;
	}
	public RegistrationPageBasicDetails clickLanguage() {
		clickByXpath(prop.getProperty("IrctcRegistrationPageBasicDetails.clickLanguage.Xpath"));
		return this;
	}
	public RegistrationPageBasicDetails SelectLanguage() {
		clickByXpath(prop.getProperty("IrctcRegistrationPageBasicDetails.selectLanguage.Xpath"));
		return this;
	}
	public RegistrationPageBasicDetails dropQues() {
		clickByXpath(prop.getProperty("IrctcRegistrationPageBasicDetails.dropQuestion.XPath"));
		return this;
	}
	public RegistrationPageBasicDetails clickSecQues() {
		clickByXpath(prop.getProperty("IrctcRegistrationPageBasicDetails.selectQuestion.Xpath"));
		return this;
	}
	public RegistrationPageBasicDetails SelectSecQues() {
		clickByXpath(prop.getProperty("IrctcRegistrationPageBasicDetails.selectQuestion.Xpath"));
		return this;
	}
	public RegistrationPageBasicDetails SecAns(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPageBasicDetails.securityAnswer.Xpath"), data); 
		return this;
	}
	public RegistrationPagePersonalDetails clickContinue() {
		clickByXpath(prop.getProperty("IrctcRegistrationPageBasicDetails.clickContinue.Xpath"));
		return new RegistrationPagePersonalDetails();
	}
	
	public RegistrationPageBasicDetails waitPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
}
