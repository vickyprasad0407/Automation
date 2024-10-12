package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		   driver.get("https://demo.actitime.com/login.do");
		   driver.findElement(By.id("username")).sendKeys("admin");
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   driver.findElement(By.xpath("//div[text()='Login ']")).click();
		   int i=0;
		   while (i<100) {
			try
			{
				driver.findElement(By.id("logoutLink")).click();
				 
				break;
			}
			catch(NoSuchElementException e)
			{
				i++;
			}
		}
		   WebDriverWait wait=new WebDriverWait(driver, 10);
		   wait.until(ExpectedConditions.titleContains("Login"));
		   System.out.println(driver.getTitle());
		   driver.close();
	}

}
