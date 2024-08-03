package sample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplementClass implements ITestListener {

	ExtentReports report;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		
		String Mname = result.getMethod().getMethodName();
		test = report.createTest(Mname);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		String Mname = result.getMethod().getMethodName();
		test.log(Status.PASS, Mname+" pass");
		Reporter.log("test case passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
//		EventFiringWebDriver edriver = new EventFiringWebDriver();
//		File src = edriver.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./Screenshot/shot.png");
//		FileUtils.copyFile(src, dest);
//		
//		String path = dest.getAbsolutePath();
//		test.addScreenCaptureFromPath(path);
//		test.log(Status.FAIL, result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		String Mname = result.getMethod().getMethodName();
		test.log(Status.SKIP, Mname+" skip");
		test.log(Status.SKIP, result.getThrowable());
	}

	@Override
	public void onStart(ITestContext context) {
		
		
		ExtentSparkReporter html = new ExtentSparkReporter("./ExtentReport/report.html");
		html.config().setDocumentTitle("test Yantra");
		html.config().setTheme(Theme.DARK);
		html.config().setReportName("deepak sir");
		
		report = new ExtentReports();
		report.attachReporter(html);
		report.setSystemInfo("os", "window");
		report.setSystemInfo("base browser", "chrome");
		report.setSystemInfo("base", "https://www.google.com");
		report.setSystemInfo("reporter", "waris");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

	
	

}
