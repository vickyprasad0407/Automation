package qsp;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopupByIterator {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
		public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.linkText("actiTIME Inc.")).click();
			Set<String> alltab = driver.getWindowHandles();
		    Iterator<String > i=alltab.iterator();
		    String ptab = driver.getWindowHandle();
		    
		 while(i.hasNext())
		 {
			 Thread.sleep(10000);
		    String id=i.next();
		   driver.switchTo().window(id);
		   if (!(id.equals(ptab)))
			   driver.close();
		 }
		 driver.switchTo().window(ptab);
		 Thread.sleep(3000);
		 driver.close(); 
			
		}
		
}
