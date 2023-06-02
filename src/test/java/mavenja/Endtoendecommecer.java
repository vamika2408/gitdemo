package mavenja;

import java.util.List;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Endtoendecommecer {
	static String username = "sanjana12@gmail.com";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys(username);
		driver.findElement(By.id("userPassword")).sendKeys("P@ssw0rd");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		List<WebElement> el = driver.findElements(By.xpath("//div[@class='row']"));
	//	WebElement prod = el.stream().filter(a -> a.findElement(By.cssSelector("//b[normalize-space()='zara coat 3']"))
	//			.getText().equals("zara coat 3")).findFirst().orElse(null);
		//prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	}

}
