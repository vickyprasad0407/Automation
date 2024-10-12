package qsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandilingTab {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[@class='menu_icon']/../../../../../div[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> moveCursor = driver.getWindowHandles();
		for (String i :moveCursor)
		{
			driver.switchTo().window(i);
			List<WebElement> allHeading = driver.findElements(By.xpath("//h2[@id]"));
			Thread.sleep(3000);
			for (WebElement x:allHeading)
			{
			System.out.println(x.getText());
			}
		}
		driver.quit();
	}

}
