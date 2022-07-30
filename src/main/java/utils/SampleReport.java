package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	
	@Test
	public void generateReport() {
		
		// Start Report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// start Test
		ExtentTest test = report.startTest("TC006", "To verify IRCTC Registration for a new user sign up");
		
		test.assignAuthor("Sowmiya");
		test.assignCategory("Functional");
		
		// log test steps
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd witht he given url successfully");
		
		// end test
		report.endTest(test);
		
		
		// end report
		report.flush();
		
		
		
	}

}
