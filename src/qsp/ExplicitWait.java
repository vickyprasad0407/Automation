package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.get("https://demo.actitime.com/login.do");
   driver.findElement(By.id("username")).sendKeys("admin");
   driver.findElement(By.name("pwd")).sendKeys("manager");
   driver.findElement(By.xpath("//div[text()='Login ']")).click();
   WebDriverWait wait=new WebDriverWait(driver, 10);
   wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
   System.out.println(driver.getTitle());
   driver.findElement(By.id("logoutLink")).click();
   System.out.println("--------------------------------");
   driver.findElement(By.id("username")).sendKeys("admin");
   driver.findElement(By.name("pwd")).sendKeys("manager");
   driver.findElement(By.xpath("//div[text()='Login ']")).click();
   wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));
   System.out.println(driver.getTitle());
   driver.findElement(By.id("logoutLink")).click();
   System.out.println("=================================");
   driver.findElement(By.id("username")).sendKeys("admin");
   driver.findElement(By.name("pwd")).sendKeys("manager");
   driver.findElement(By.xpath("//div[text()='Login ']")).click();
   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
   System.out.println(driver.getTitle());
   driver.findElement(By.id("logoutLink")).click();
   
   driver.close();
	}

}
