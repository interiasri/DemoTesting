package FunctionLibrary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
		File fi = new File("FileOutput/GoogleSearch.txt");
		fi.createNewFile();
		FileWriter fw = new FileWriter(fi);
		fw.write("Google Search Results: \n");
		for(int i=0; i<listOfItems.size(); i++) {
			System.out.println(listOfItems.get(i).getText());
			fw.write(listOfItems.get(i).getText()+"\n");
		}
		fw.close();
	}
	
	@Test
	public void googleSearchAndSelectItem() throws Throwable {
		driver.findElement(By.className("gLFyf")).sendKeys("Java Basics");
		Thread.sleep(1000);
		WebElement listContains=driver.findElement(By.xpath("//ul[@class='G43f7e']"));
		List<WebElement> listOfItems=listContains.findElements(By.tagName("li"));
		System.out.println("Total Number of Items: "+listOfItems.size());
		for(int i=0; i<listOfItems.size(); i++) {
			String itemName=listOfItems.get(i).getText();
			if(itemName.equalsIgnoreCase("itemName")) {
				listOfItems.get(i).click();
				break;
			}
		}
	}
	
	@Test
	public void googleMission() throws IOException {
		driver.findElement(By.linkText("About")).click();
		String gmission=driver.findElement(By.xpath("//h1[contains(@class,'glue-headline--fluid-2')]")).getText();
		System.out.println(gmission);
		File fi = new File("FileOutput/googleMission.txt");
		fi.createNewFile();
		FileWriter  fw = new FileWriter(fi);
		fw.write(gmission+"\n");
	}

}
