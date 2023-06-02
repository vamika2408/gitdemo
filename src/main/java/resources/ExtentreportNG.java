package resources;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreportNG  {
	public static ExtentReports extent;
	@Test 
	public static  ExtentReports config()
	{
		String path	= System.getProperty("user.dir")+"\\reports\\index.html";
		 
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Auto report");
		reporter.config().setDocumentTitle("abc");
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "new124");
		return extent;
	}

}
