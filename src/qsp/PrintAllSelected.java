package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelected {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mr.%20Santosh/Desktop/Hotel.html");
		WebElement cpListbox=driver.findElement(By.id("cp"));
		Select s=new Select(cpListbox);
		List<WebElement> allSOption = s.getAllSelectedOptions();
		int count=allSOption.size();
		for (WebElement e: allSOption)
		{
			System.out.println(e.getText());
		}
		driver.close();
	}

}
