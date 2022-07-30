package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FbCreateNewAcc extends GenericWrappers{
	
	public FbCreateNewAcc enterFname(String data) {
		enterByXpath(prop.getProperty("FacebookCreateAccountPage.FirstName.XPath"), data);
		return this;
	}
	public FbCreateNewAcc enterLastName(String data) {
		enterByXpath(prop.getProperty("FacebookCreateAccountPage.LastName.XPath"), data);
		return this;
	}
	public FbCreateNewAcc enterEmail(String data) {
		enterByXpath(prop.getProperty("FacebookCreateAccountPage.enterEmail.Xpath"), data);
		return this;
	}
	public FbCreateNewAcc enterPassword(String data) {
		enterByXpath(prop.getProperty("FaceBookCreateAccountPage.enterPassword.Xpath"), data);
		return this;
	}
	public FbCreateNewAcc reEnterEmail(String data) {
		enterByXpath(prop.getProperty("FaceBookCreateAccountPage.reEnterEmail.Xpath"), data);
		return this;
		
	}
	public FbCreateNewAcc selectMonth(String value) {
		selectValueByXpath(prop.getProperty("FaceBookCreateAcccountPage.selectMonth.Xpath"), value);
		return this;
	}
	public FbCreateNewAcc selectDay(String value) {
		selectValueByXpath(prop.getProperty("FaceBookCreateAccountPage.selectDate.Xpath"), value);
		return this;
		
	}
	public FbCreateNewAcc selectYear(String value) {
		selectValueByXpath(prop.getProperty("FaceBookCreateAccountPage.selectYear.Xpath"), value);
		return this;
		}
	public FbCreateNewAcc clickGender() {
		clickByXpath(prop.getProperty("FaceBookCreateAccountPage.selectGender.Xpath"));
		return this;
	}
	

}
