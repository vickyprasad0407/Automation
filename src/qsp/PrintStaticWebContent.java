package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintStaticWebContent {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Mr.%20Santosh/Desktop/htmlcode2.html");
List<WebElement> allContent = driver.findElements(By.xpath("//td"));
for(WebElement e:allContent)
{
System.out.println(e.getText());	
}
	}

}
