package FunctionLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AppUtils {
	
	public static WebDriver driver;
	@BeforeSuite
	public void launchApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:google.com");
	}
	
	@AfterSuite
	public void closeApp() {
		driver.quit();
	}

}
