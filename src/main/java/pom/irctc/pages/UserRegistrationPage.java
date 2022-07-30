package pom.irctc.pages;

import wrappers.GenericWrappers;

public class UserRegistrationPage extends GenericWrappers {
	
	public UserRegistrationPage enteruserId(String data) {
		enterByXpath(prop.getProperty("IndianFrroPage.enterUserId.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterPwd(String data) {
		enterByXpath(prop.getProperty("IndianFrroPage.enterpassword.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterRePwd(String data) {
		enterByXpath(prop.getProperty("IndianFrroPage.ReEnterPassword.Xpath"), data);
		return this;
	}
     public UserRegistrationPage selectSecQues(String value) {
    	 selectValueByXpath(prop.getProperty("IndianFrroPage.selectSecQuestion.Xpath"), value);
    	 return this;
     }
     public UserRegistrationPage entersecAns(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.selectSecurityAnswer.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enterName(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterName.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage selectGender(String value) {
    	 selectValueByXpath(prop.getProperty("IndianFrroPage.selectGender.Xpath"), value);
    	 return this;
     }
     public UserRegistrationPage enterDob(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterDOB.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enterDesignation(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterDesignation.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enterEmail(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterEmail.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enterMobile(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterMobile.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enterPhone(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterPhone.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage selectnationality(String value) {
    	 selectValueByXpath(prop.getProperty("IndianFrroPage.selectNationality.Xpath"), value);
    	 return this;
     }
     public UserRegistrationPage enterName1(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterName1.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enterCapacity(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterCapacity.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enterAddress(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enteraddress.xpath"), data);
    	 return this;
     }
     public UserRegistrationPage selectState(String value) {
    	 selectValueByXpath(prop.getProperty("IndianFrroPage.selectState.Xpath"), value);
    	 return this;
     }
     public UserRegistrationPage selectCity(String value) {
    	 selectValueByXpath(prop.getProperty("IndianFrroPage.selectCity.Xpath"), value);
    	 return this;
     }
     public UserRegistrationPage selectaccType(String value) {
    	 selectValueByXpath(prop.getProperty("IndianFrroPage.selectAccountType.Xpath"), value);
    	 return this;
     }
     public UserRegistrationPage selectaccGrade(String value) {
    	 selectValueByXpath(prop.getProperty("IndianFrroPage.selectAccountGrade.xpath"), value);
    	 return this;
     }
     public UserRegistrationPage enterEmailId(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterEmail.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enterContact(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterContact.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enterPhone1(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterPhone1.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enterName2(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterName2.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enteraddress(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterAddress.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage selectState1(String value) {
    	 selectValueByXpath(prop.getProperty("IndianFrroPage.selectState1.Xpath"), value);
    	 return this;
     }
     public UserRegistrationPage selectCity1(String value ) {
    	 selectValueByXpath(prop.getProperty("IndianFrroPage.selectCity1.Xpath"), value);
    	 return this;
     }
     public UserRegistrationPage enterEmail1(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterEmail1.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enterPhone2(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterPhone2.Xpath"), data);
    	 return this;
     }
     public UserRegistrationPage enterMobile2(String data) {
    	 enterByXpath(prop.getProperty("IndianFrroPage.enterMobile2.Xpath"), data);
    	 return this;
     }
     
     public UserRegistrationPage waitPageLoad(long time) {
    	 waitProperty(time);
    	 return this;
     }
      
     
     
     
     
     
     
}
