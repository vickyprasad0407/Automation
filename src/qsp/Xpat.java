package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpat {
static
{
  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.actitime.com/administration/btlist.do");
      driver.findElement(By.xpath("//a[text()='testing']/../../td[4]/span")).click();
     // driver.close();
	}

}
