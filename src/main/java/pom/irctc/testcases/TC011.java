package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.AlertsAndFrames;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers {
	@BeforeClass
	public void beforeclass() {
		
	testCaseName = "TC011";
	testCaseDescription = "ConfirmationAlert";
	category = "smoke";
	author="Sowmiya";
	browserName="chrome";
	url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	}
	@Test
	public void ConfirmationAlert() {
		
		new AlertsAndFrames()
		.SwitchFrame()
		.clickTryIt()
		.acceptalert()
		.verifyText("You pressed OK!")
		.clickRefresh()
		.SwitchFrame()
		.clickTryit2()
		.dismissalert()
		.waitPageload(4000)
		.verifyText("You pressed Cancel!")
		.switchDefaultContent()
		.tryHome()
		.switchToWindow1();
		
	}

}
