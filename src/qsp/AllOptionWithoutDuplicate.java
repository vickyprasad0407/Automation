package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionWithoutDuplicate {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mr.%20Santosh/Desktop/Hotel.html");
		WebElement mtrListbox=driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		
		List<WebElement> allOption = s.getOptions();
		int count=allOption.size();
		HashSet<String> h=new HashSet<String>();
		
		for (WebElement e: allOption)
		{
			h.add(e.getText());
		}
		for (String c: h)
		{
			System.out.println(c);
		}
		
		driver.close();
	}

}
