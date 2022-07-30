package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SignUpUndianFrro extends GenericWrappers {
	
	public UserRegistrationPage signup() {
		clickByXpath(prop.getProperty("IndianFrroPage.clicksignUp.Xpath"));
		return new UserRegistrationPage();
	}
	

}
