package mavenja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By login = By.cssSelector("a[href*='sign_in']");
	
	By check = By.cssSelector("div[class='text-center'] h2");
	By con = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
          this.driver = driver;
	}

	public WebElement Loginmethod()
	{
	 return driver.findElement(login);
	}
	
	
	public WebElement checkvalue()
	{
		return driver.findElement(check);
	}
	
	public WebElement contactcheck()
	{
		return driver.findElement(con);
	}
}
