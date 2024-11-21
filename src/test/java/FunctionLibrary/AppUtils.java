package FunctionLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppUtils {
	
	public static WebDriver driver;
	@BeforeMethod
	public void launchApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:google.com");
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

}
