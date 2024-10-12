package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(10000);
		WebElement monthListBox=driver.findElement(By.id("month"));
		Select s=new Select(monthListBox);
		s.selectByIndex(1);
		Thread.sleep(10000);
		s.selectByValue("1");
		Thread.sleep(10000);
		s.selectByVisibleText("Dec");
	}

}
