package pom.irctc.pages;
import pom.irctc.pages.EnquiryFormSaloonPage;
import wrappers.GenericWrappers;

public class EnquiryForm extends GenericWrappers {
	
	public EnquiryFormSaloonPage clickEnquiry() {
		clickByXpath(prop.getProperty("IrctcEnquiryFormPage.clickEnquiry.Xpath"));
		return new EnquiryFormSaloonPage();
	}
   public EnquiryForm switchToWindow2() {
	   switchToLastWindow();
	   return this;
   }
}
