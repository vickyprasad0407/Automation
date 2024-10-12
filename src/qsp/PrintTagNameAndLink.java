//wajs to print tagname and href attribute for the forgot your passward link is present or not
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTagNameAndLink {
static
{
  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
WebElement ele=driver.findElement(By.id("toPasswordRecoveryPageLink"));
String tag=ele.getTagName();
System.out.println(tag);
String href=ele.getAttribute("href");
System.out.println(href);
	}

}
