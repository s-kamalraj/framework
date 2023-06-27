package framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	static WebDriver driver;
	static SignupObject obj;

	@BeforeMethod
	public void lunchBrowser() {
		driver = new ChromeDriver();
		obj = new SignupObject(driver);
		driver.manage().window().maximize();
		driver.get("https://unstop.com/auth/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		obj.cookiesConfirm.click();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
}
