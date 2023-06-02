package mavenja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass {

	public WebDriver driver;
	
	By login = By.cssSelector("a[href*='sign_in']");
	By email = By.id("user_email");
	By password = By.id("user_password");
	By submit = By.cssSelector("input[type='submit']");
	
	
	public LoginClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
          this.driver = driver;
	}

	public WebElement Loginmethod()
	{
	 return driver.findElement(login);
	}
	
	
	public WebElement emailid()
	{
		return driver.findElement(email);
		
	}

	public WebElement passwordid()
	{
		return driver.findElement(password);
	}
	
	public WebElement log()
	{
		return driver.findElement(submit);
	}
	
	
}
