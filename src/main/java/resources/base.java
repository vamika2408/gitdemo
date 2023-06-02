package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver intializebrowser() throws IOException {
	     prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\pallavi.surve\\eclipse-workspace\\mavenja\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		//String browsername = prop.getProperty("browser");
		String browsername=System.getProperty("browser"); // use for maven headless browser mean unable to open browser
		System.out.println(browsername);

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\pallavi.surve\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
            ChromeOptions option = new ChromeOptions(); 
            option.addArguments("headless");           //use for maven headless browser mean unable to open browser
            
            driver = new ChromeDriver();
           

		} else if (browsername.equals("firefox")) {
			// firefox
		} else if (browsername.equals("IE")) {
			// Internt Expoler
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;               // for test case return used
         
		
		 
		
	}
	
	/*public void getscreenshort(String testname) throws IOException
	{
	TakesScreenshot ts =  (TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
String destinationfile =	"C:\\Users\\pallavi.surve\\Downloads\\testname.png";
	FileUtils.copyFile(source,new File(destinationfile));
	
	}*/
	  

	
	
}
