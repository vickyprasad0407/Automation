package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTab {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allTab = driver.getWindowHandles();
		int count=0;
		for (String tab:allTab)
		{
			Thread.sleep(3000);
			driver.switchTo().window(tab);
			String title = driver.getTitle();
			count++;
			System.out.println(title+"........"+tab);
			driver.close();
		}
		System.out.println("no. of tab present : "+count);
	}

}
