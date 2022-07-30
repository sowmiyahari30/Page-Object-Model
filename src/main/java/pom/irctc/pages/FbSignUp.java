package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FbSignUp extends GenericWrappers {
	
	public FbCreateNewAcc createNewAcc() {
		
		clickByXpath(prop.getProperty("FacebookHomePage.CreateNewAccount.XPath"));
		
		return new  FbCreateNewAcc();
		
	}
	
	
	//public FbCreateNewAcc waitForPageLoad(long time) {
	//	waitProperty(time);
	//	return this;
	//}

}
