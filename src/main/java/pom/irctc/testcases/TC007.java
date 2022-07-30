package pom.irctc.testcases;

import org.apache.xmlbeans.impl.common.IdentityConstraint.SelectorState;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.PanIndiaPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	@BeforeClass
	public void beforeclass() {
		testCaseName = "TC007";
		testCaseDescription = "PanIndia Registration";
		category = "smoke";
		author="Sowmiya";
		browserName="chrome";
		url="https://panind.com/india/new_pan/";
		sheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void panIndia(String title,String FirstName,String MiddleName,String FatherFName,String FatherMName,String FatherLName,String MobileNo,
			String Email,String DOB,String Address1,String Address2,String City,String Pincode,String OffName,String OffAddress1,String OffAddress2,
			String cityOff,String OffPincode,String IDProof,String AddressProof,String DOBProof,String AadharProof,String OffAddressProof) {
		
		new PanIndiaPage() 
		.selectTitle(title)
		.enterFname(FirstName)
		.enterMname(MiddleName)
		.enterlname("hari")
		.enterFather(FatherFName)
		.enterFatherM(FatherMName)
		.enterFatherL(FatherLName)
		.enterMobile(MobileNo)
		.enterEmail(Email)
		.selectIncome("2")
		.clickCommunication()
		.enterDOB(DOB)
	     .pageDown()
		.waitPageLoad(4000)
		.enterAdd1(Address1)
		.enterAdd2(Address2)
		.enterCity(City)
		.selectState("Tamil Nadu")
		.enterPin(Pincode)
		.waitPageLoad(4000)
		//.selectCountry("INDIA")
		.enterOffName(OffName)
		.enterOffAdd1(OffAddress1)
		.enterArea(OffAddress2)
		.enterCity1(cityOff)
		.selectState1("Tamil Nadu")
		.enterPin1(OffPincode)
		//.selectCountry1("INDIA")
		.selectId(IDProof)
		.selectAddProof(AddressProof)
		.selectDOBProof(DOBProof)
		.selectAadhar(AadharProof)
		.selectOffAddProof(OffAddressProof)
		.waitPageLoad(3000)
		.clickCheckbox();
		
		
	}

}
