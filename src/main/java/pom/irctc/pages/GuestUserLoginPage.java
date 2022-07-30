package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestUserLoginPage extends GenericWrappers {
	
	public GuestUserLoginPage clickGuestUserLogin() {
		clickByXpath(prop.getProperty("IrctcGuestUserLoginPage.clickGuestUserLogin.Xpath"));
		return this;
	}
	public GuestUserLoginPage enterEmail(String data) {
		enterByXpath(prop.getProperty("IrctcGuestUserLoginPage.enterEmail.Xpath"), data);
		return this;
	}
	public GuestUserLoginPage enterMobile(String data) {
		enterByXpath(prop.getProperty("IrctcGuestUserLoginPage.enterMobile.Xpath"), data);
		return this;
	}
	public SelectedHotelPage1 clickLogin() {
		clickByXpath(prop.getProperty("IrctcGuestUserLoginPage.clickLogin.Xpath"));
		return new SelectedHotelPage1();
	}

}
