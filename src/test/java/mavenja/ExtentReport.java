package mavenja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReport{
	ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		// create object ExtentReport and ExtensparkReporters
		
	
		
	String path	= System.getProperty("user.dir")+"\\reports\\index.html";
		 
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Extent Report");
		reporter.config().setDocumentTitle("Test Result page");
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "pallavi");
	}
	
	
	@Test
	
	public void extent()
	{
	ExtentTest test	= extent.createTest("extent");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pallavi.surve\\Downloads\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     System.out.println(driver.getTitle());
	     extent.flush();
	}

}
