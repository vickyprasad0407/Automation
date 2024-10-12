package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllChild2 {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
		public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			driver.findElement(By.id("apple-signin-button")).click();
			driver.findElement(By.id("login-facebook-button")).click();
			String mainadd = driver.getWindowHandle();
			 String mainTitle = driver.switchTo().window(mainadd).getTitle();
			Set<String> allwh = driver.getWindowHandles();
			for (String wh:allwh)
			{
				String title = driver.switchTo().window(wh).getTitle();
				if (!(title.equals(mainTitle)))
					driver.close();
			}
			
		}
}
