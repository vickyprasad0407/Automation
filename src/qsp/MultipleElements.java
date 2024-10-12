package qsp;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
static
{
  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
int count=allLinks.size();
System.out.println(count);
for (WebElement e:allLinks)
{
 System.out.println(e.getText());	
}
driver.close();
	}

}
