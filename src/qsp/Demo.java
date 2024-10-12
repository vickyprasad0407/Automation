package qsp;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class Demo 
{
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Mr.%20Santosh/Desktop/pwd_disabled.html");
        boolean rs=driver.findElement(By.id("d3")).isDisplayed();
       // boolean ps=driver.findElement(By.xpath("//img")).isDisplayed();
		if (rs)
			System.out.println("true");
		else
			System.out.println("false");
		driver.close();
	}
}
