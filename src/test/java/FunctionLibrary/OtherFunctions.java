package FunctionLibrary;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OtherFunctions extends AppUtils{
	

	@Test
	public void googleSearchTest() throws Throwable {
		driver.findElement(By.className("gLFyf")).sendKeys("Java Basics");
		Thread.sleep(1000);
		WebElement listContains=driver.findElement(By.xpath("//ul[@class='G43f7e']"));
		List<WebElement> listOfItems=listContains.findElements(By.tagName("li"));
		System.out.println("Total Number of Items: "+listOfItems.size());
		for(int i=0; i<listOfItems.size(); i++) {
			System.out.println(listOfItems.get(i).getText());
		}
	}

}
