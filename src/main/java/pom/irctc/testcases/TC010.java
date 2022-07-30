package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.AlertsAndFrames;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {
	@BeforeClass
	public void beforeclass() {
		
	testCaseName = "TC010";
	testCaseDescription = "PromptAlert";
	category = "smoke";
	author="Sowmiya";
	browserName="chrome";
	url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	sheetName="TC010";
}
	@Test(dataProvider="fetchData")
	public void PromptAlert(String Text,String VerifyText,String ReEnterText,String VerifyReEnterText) {
		
		new AlertsAndFrames()
		.SwitchFrame()
		.clickTryIt()
		//.waitPageload(3000)
		.enterText(Text)
		.acceptalert()
		.verifyText(VerifyText)
		.clickRefresh()
		.waitPageload(3000)
		.SwitchFrame()
		.clickTryit2()
		.waitPageload(4000)
		.enterText(ReEnterText)
		.dismissalert()
		.verifyNotContainstext(VerifyReEnterText)
		.switchDefaultContent()
		.tryHome()
		.switchToWindow1();
		
		
		
		
		
		
		
		
		
		
		
	}

}
