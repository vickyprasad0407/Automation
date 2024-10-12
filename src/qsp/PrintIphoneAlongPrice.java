package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintIphoneAlongPrice {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		List<WebElement> allIphone = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 1')] |(//div[contains(text(),'APPLE iPhone 1')])/../../div[2]/div[1]/div[1]"));
		Thread.sleep(10000);
		for (WebElement e:allIphone)
		{
			System.out.println(e.getText());
		}
		driver.close();
	}

}
