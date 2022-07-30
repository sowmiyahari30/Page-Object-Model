package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AlertsAndFrames extends GenericWrappers {
	
	public AlertsAndFrames SwitchFrame() {
		switchToframeByXpath("//iframe[@id='iframeResult']");
		return  this;
	}
	public AlertHomePage tryHome() {
		clickByXpath(prop.getProperty("AlertsAndFramesPage.tryHome.Xpath"));
		return new AlertHomePage();
	}
	public AlertsAndFrames enterText(String data) {
		enterTextIntoAlert(data);
		return this;
	}
	public AlertsAndFrames acceptalert() {
		acceptAlert();
		return this;
	}
	public AlertsAndFrames dismissalert() {
		dismissAlert();
		return this;
	}
	public AlertsAndFrames waitPageload(long time) {
		waitProperty(time);
		return this;
	}
	public AlertsAndFrames clickTryIt() {
		clickByXpathNoSnap(prop.getProperty("AlertsAndFramesPage.clickTryIt.Xpath"));
		return this;
		}
	public AlertsAndFrames verifyText(String text) {
		verifyTextContainsByXpath(prop.getProperty("AlertsAndFramesPage.verifyText.Xpath"), text);
		return this;
	}
	public AlertsAndFrames clickRefresh() {
		navigateRefresh();
		return this;
	}
	public AlertsAndFrames verifyNotContainstext(String text) {
		verifyTextNotContainsByXpath(prop.getProperty("AlertsAndFramesPage.verifyNotContainsText.Xpath"), text);
		return this;
	}
	public AlertsAndFrames switchDefaultContent() {
		switchToDefaultContent();
		return new AlertsAndFrames();
	}
	public AlertsAndFrames clickTryit2() {
		clickByXpath(prop.getProperty("AlertsAndFramesPage.clickTryIt2.Xpath"));
		return this;
	}
	


}
