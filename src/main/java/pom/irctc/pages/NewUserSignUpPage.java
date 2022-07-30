package pom.irctc.pages;

import wrappers.GenericWrappers;

public class NewUserSignUpPage extends GenericWrappers {
	
	public BookYourCoachPage clickNewUser() {
		clickByXpath(prop.getProperty("IrctcNewUserSignUpPage.clickNewUser.Xpath"));
		return new BookYourCoachPage();
	}
	 public NewUserSignUpPage switchToWindow2() {
    	 switchToLastWindow();
    	 return new NewUserSignUpPage();
     }
	
}
