package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.PhpPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	@BeforeClass
	public void beforeclass() {
		testCaseName = "TC008";
		testCaseDescription = "PHP Registration";
		category = "smoke";
		author="Sowmiya";
		browserName="chrome";
		url="https://www.phptravels.org/register.php";
		sheetName="TC008";
	}
	@Test(dataProvider="fetchData")
	
	public void PhpTravels(String FirstName,String LastName,String Email,String Phone,String Company,String Address1,String Address2,String City,
			String State,String Postcode,String Country,String Customfield,String InputPassword,String ConfirmPassword) {
		
		new PhpPage()
		.enterFname(FirstName)
		.enterLname(LastName)
		.enterEmail(Email)
		.enterPhone(Phone)
		.enterCompany(Company)
		.enterAddress(Address1)
		.enterAddress1(Address2)
		.enterCity(City)
		.enterState(State)
		.enterPin(Postcode)
		.selectCountry(Country)
		.enterAdditionalDetails(Customfield)
		.enterPassword(InputPassword)
		.enterConfirm(ConfirmPassword);
		
	}

}
