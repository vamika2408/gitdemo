package mavenja;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.base;

public class HomePage extends base {             // inheritance used extends for access another class

	@Test (dataProvider="getdata")
	public void baseclassnavigate(String username, String password) throws IOException
	{
		driver=intializebrowser();
		driver.get("http://www.qaclickacademy.com/");
		System.out.println(driver.getTitle());
		
		LoginClass l = new LoginClass(driver);
		
		l.Loginmethod().click();
		l.emailid().sendKeys(username);
		l.passwordid().sendKeys(password);
		l.log().click();   
		
				
	}

	@DataProvider 
	public Object[][] getdata()
	{
		Object[][] data = new Object[2][2];
		
		data [0][0] = "abc@com";
		data [0][1] = "new";
		
		data [1][0]="pqr@com";
		data[1][1]="1234";
		return data;
	}
	

	
}
