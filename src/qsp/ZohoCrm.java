package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZohoCrm {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.137.128:8080/crm/HomePage.do");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@alt='Sign In']")).click();
		driver.findElement(By.linkText("Logout [rashmi@dell.com]")).click();
		driver.close();
	}

}
