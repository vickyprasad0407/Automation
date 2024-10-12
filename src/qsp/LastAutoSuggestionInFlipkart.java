package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastAutoSuggestionInFlipkart {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
//driver.findElement(By.xpath("//button[.='✕']")).click();
driver.findElement(By.name("q")).sendKeys("iphone");
Thread.sleep(2000);

List<WebElement> allLinks = driver.findElements(By.xpath("//span[contains(text(),'iphone')]/.."));
Thread.sleep(2000);
System.out.println("length of web element is "+allLinks.size());
for (WebElement e:allLinks)
{
System.out.println(e.getText());	
}
driver.close();
	}

}
