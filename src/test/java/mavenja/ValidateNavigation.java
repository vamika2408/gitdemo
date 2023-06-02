package mavenja;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.base;

public class ValidateNavigation extends base{             // inheritance used extends for access another class

	@Test
	public void baseclassnavigate() throws IOException
	{
		driver=intializebrowser();
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		
		LandingPage lp = new LandingPage(driver);
		
      
    
        Assert.assertTrue(lp.contactcheck().isDisplayed());
        Assert.assertFalse(false);
        
        
	}

	@AfterTest
	public void exit()
	{
		driver.close();
	}
	
	
	
}
