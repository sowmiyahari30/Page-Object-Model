package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.SignUpUndianFrro;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	@BeforeClass 
	       public void beforeclass() {
			testCaseName ="TC006";
			testCaseDescription = "IndianFRRO";
			category = "smoke";
			author ="sowmiya";
			browserName = "chrome";
			url = "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
			sheetName="TC006";
			
	}
	
		@Test(dataProvider="fetchData")
		public void IndianFrro(String userName, String password, 
				String confirmPassword, String secQue,String secAns,String UName,
				String Gender,String DOB,String Designa,String UEmailId,String UmobileNo,String UPhone,
				String nationality,String Name,String Capacity,String Address,String state,String city,
				String accomType,String StarRating,String Email,String Mcontact,String contact,String nameO,
				String AddressO,String stateO,String cityO,String emailId,String PhoneNo,String mobileNo ) {
			
		new SignUpUndianFrro() 
		.signup()
		.enteruserId(userName)
		.enterPwd(password)
		.enterRePwd(confirmPassword)
		.selectSecQues(secQue)
		.entersecAns(secAns)
		.enterName(UName)
		.selectGender(Gender)
		.enterDob(DOB)
		.enterDesignation(Designa)
		.enterEmail(UEmailId)
		.enterMobile(UmobileNo)
		.enterPhone(UPhone)
		.waitPageLoad(5000)
		.selectnationality(nationality)
		.enterName1(Name)
		.enterCapacity(Capacity)
		.enterAddress(Address)
		.selectState(state)
		.waitPageLoad(4000)
		.selectCity(city)
		.selectaccType(accomType)
		.selectaccGrade(StarRating)
		.enterEmailId(Email)
		.waitPageLoad(5000)
		.enterContact(Mcontact)
		.enterPhone1(contact)
		.enterName2(nameO)
		.enteraddress(AddressO)
		.selectState1(stateO)
		.waitPageLoad(4000)
		.selectCity1(cityO)
		.enterEmail1(emailId)
		.enterPhone2(PhoneNo)
		.enterMobile2(mobileNo);
	}

}
