package Ecommerce.GenericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	public ExtentSparkReporter sparkRepoter;//ui of the report
	public ExtentReports extent;//populate common info on the report
	public ExtentTest test;//
	
	public void onStart(ITestContext context) {
		sparkRepoter =new ExtentSparkReporter(".//ExtentReports/Report.html");
		sparkRepoter.config().setDocumentTitle("Ecommerce Execution Report");//Title of the report
		sparkRepoter.config().setReportName("Function Testing");//Name of the report
		sparkRepoter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkRepoter);
		extent.setSystemInfo("url", "http://www.automationpractice.pl/index.php");
		extent.setSystemInfo("email", "romilraj.anand@gmail.com");
		extent.setSystemInfo("password", "anand@123");
		extent.setSystemInfo("Browser","chrome");
		
		
	}
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Test case Passed is:"+ result.getName());
		
	}
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case Failed is:"+result.getName());
		test.log(Status.FAIL, "Test Case Failed cause is:"+result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case skipped is:"+ result.getName());
	}
	public void onFinish(ITestContext context) {
		extent.flush();
	}

	

}
