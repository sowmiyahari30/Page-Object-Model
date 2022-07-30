package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookYourCoachPage extends GenericWrappers {
	
	public BookYourCoachPage enterId(String data) {
		enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterUserId.Xpath"), data);
		return this;
	}
	public BookYourCoachPage enterPassword(String data) {
	  enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterPassword.Xpath"), data);
	  return this;
	}
	public BookYourCoachPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterConfirmPassword.Xpath"), data);
		return this;
	}
	public BookYourCoachPage selectSecQues(String value) {
		selectValueByXpath(prop.getProperty("IrctcBookYourCoachPage.selectSecqurityQuestion.Xpath"), value);
		return this;
	}
	public BookYourCoachPage enterSecAnswer(String data) {
		enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterSecurityAnswer.Xpath"), data);
		return this;
	}
	public BookYourCoachPage clickDOB() {
		clickByXpath(prop.getProperty("IrctcBookYourCoachPage.clickDOB.Xpath"));
		return this;
	}
	public BookYourCoachPage selectDate() {
		clickByXpath(prop.getProperty("IrctcBookYourCoachPage.selectDate.Xpath"));
		return this;
	}
	public BookYourCoachPage clickGender() {
		clickByXpath(prop.getProperty("IrctcBookYourCoachPage.clickGender.Xpath"));
		return this;
	}
	public BookYourCoachPage clickMarrital() {
		clickByXpath(prop.getProperty("IrctcBookYourCoachPage.clickMarrital.Xpath"));
		return this;
	}
	public BookYourCoachPage enterEmail(String data) {
		enterByXpath(prop.getProperty("IrctcBookYourCoachpage.enterEmail.Xpath"), data);
		return this;
	}
		public BookYourCoachPage selectOccupation(String value) {
			selectValueByXpath(prop.getProperty("IrctcBookYourCoachPage.selectOccupation.Xpath"), value);
			return this;
			
		}
		public BookYourCoachPage enterFirstName(String data)  {
			enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterFirstName.Xpath"), data);
			return this;
		}
		public BookYourCoachPage enterMiddleName(String data) {
			enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterMiddleName.Xpath"), data);
			return this;
		}
		public BookYourCoachPage enterlastname(String data) {
			enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterLastName.Xpath"), data);
			return this;
		}
		public BookYourCoachPage selectNationality(String value) {
			selectValueByXpath(prop.getProperty("IrctcBookYourCoachPage.selectNationality.Xpath"), value);
			return this;
		}
		public BookYourCoachPage enterFlatNo(String data) {
			enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterFlatNo.Xpath"), data);
			return this;
		}
		public BookYourCoachPage enterStreet(String data) {
			enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterStreet.Xpath"), data);
			return this;
		}
		public BookYourCoachPage enterArea(String data) {
			enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterArea.Xpath"), data);
			return this;
		}
		public BookYourCoachPage selectCountry(String value) {
			selectValueByXpath(prop.getProperty("IrctcBookYourCoachPage.selectCountry.Xpath"), value);
			return this;
		}
		public BookYourCoachPage enterMobile(String data) {
			enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterMobile.Xpath"), data);
			return this;
		}
		public BookYourCoachPage enterPincode(String data) {
			enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterPincode.Xpath"), data);
			return this;
		}
		public BookYourCoachPage selectcity(String value) {
			selectValueByXpath(prop.getProperty("IrctcBookYourCoachPage.selectCity.Xpath"), value);
			return this;
		}
		public BookYourCoachPage selectstate(String value) {
			selectValueByXpath(prop.getProperty("IrctcBookYourCoachpage.selectState.Xpath"), value);
			return this;
		}
		public BookYourCoachPage selectPostOff(String value) {
			selectValueByXpath(prop.getProperty("IrctcBookYourCoachPage.selectPostOffice.Xpath"), value);
			return this;
		}
		public BookYourCoachPage clickNo() {
			clickByXpath(prop.getProperty("IrctcBookYourCoachPage.clickNo.Xpath"));
			return this;
		}
		public BookYourCoachPage enterOffNo(String data) {
			enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterFlatOfficeNumber.Xpath"), data);
			return this;
		}
		public BookYourCoachPage enterOffStreet(String data) {
			enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterOfficeStreet.Xpath"), data);
			return this;
		}
		public BookYourCoachPage enterOffArea(String data) {
			enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterOfficeArea.Xpath"), data);
			return this;
		}
		public BookYourCoachPage selectOffCountry(String value) {
			selectValueByXpath(prop.getProperty("IrctcBookYourCoachpage.selectOfficeCountry.Xpath"), value);
			return this;
			
		}
		public BookYourCoachPage enterMobile1(String value) {
			enterByXpath(prop.getProperty("IrctcBookYourCoachPage.enterMobileOffice.Xpath"), value);
			return this;
		}
		public BookYourCoachPage enterOffPin(String data) {
			enterByXpath(prop.getProperty("IrctcBookYourCoachpage.enterOfficePin.Xpath"), data);
			return this;
		}
		public BookYourCoachPage switchToWindow3() {
			switchToLastWindow();
			return this;
		}
		public BookYourCoachPage waitforPageUpload(long time) {
			waitProperty(time);
			return this;
		}
		
	}
	


