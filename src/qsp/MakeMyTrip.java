package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	static
	{
	   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.makemytrip.com/");
    Thread.sleep(10000);
   // driver.switchTo().frame(1);
    Set<String> alltab = driver.getWindowHandles();
    for (String all:alltab)
    {
    driver.switchTo().window(all);
    }
	driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
	driver.close();
	}

}
