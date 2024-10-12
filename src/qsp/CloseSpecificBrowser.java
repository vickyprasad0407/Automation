package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the title of the browser");
		String eTitle=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh:allwh)
		{
			Thread.sleep(2000);
			String aTitle = driver.switchTo().window(wh).getTitle();
			if (aTitle.equalsIgnoreCase(eTitle))
				driver.close();
		}
		
	}

}
