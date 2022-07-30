package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GstMobileVerifyOtpPage extends GenericWrappers {
	
	public GstMobileVerifyOtpPage clickVerify() {
		clickByXpath(prop.getProperty("IrctcGstMobileVerifyOtpPage.clickVerify.Xpath"));
		return this;
	}
	public SelectedHotelBookingPage verifyOtp(String text) {
		verifyTextByXpath(prop.getProperty("IrctcGstMobileVerifyOtpPage.verifyOtp.Xpath"), text);
		return new SelectedHotelBookingPage();
	}
	public GstMobileVerifyOtpPage verifyMobileText(String text) {
		verifyTextContainsByXpath(prop.getProperty("IrctcGstMobileVerifyOtpPage.verifyMobileText.Xpath"), text);
		return this;
	}
	public GstMobileVerifyOtpPage verifyGst(String text) {
		verifyTextContainsByXpath(prop.getProperty("IrctcGstMobileVerifyOtpPage.verifyGst.Xpath"), text);
		return this;
	}

}
