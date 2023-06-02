package mavenja;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.base;

public class ValidateHomeText extends base{             // inheritance used extends for access another class

	public static Logger log = LogManager.getLogger(base.class.getName());
	@Test
	public void baseclassnavigate() throws IOException
	{
		driver=intializebrowser();
		driver.get("http://www.qaclickacademy.com/");
		System.out.println(driver.getTitle());
		
		LandingPage lp = new LandingPage(driver);
		
      
	    Assert.assertEquals(lp.checkvalue().getText(), "FEATURED COURSES1");
	   
        
        
	}

	@AfterTest
	public void exit()
	{
		driver.close();
		log.info("window sucessfully closed");
	}
	
	
	
}
