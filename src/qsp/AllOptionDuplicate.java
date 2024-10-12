package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionDuplicate {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<String>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mr.%20Santosh/Desktop/Hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> allOptions = s.getOptions();
		for (int i=0 ;i<allOptions.size();i++)
		{
			String text = allOptions.get(i).getText();
			if (hs.add(text)==false)
				System.out.println(text);
		}
		driver.close();
	}

}
