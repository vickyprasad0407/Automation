package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestion {
static
{
 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("java");
Thread.sleep(3000);//must be other wise we will not get all the elements
List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
int count = allSugg.size();
for(WebElement e:allSugg)
{
String text = e.getText();	
System.out.println(text);
}
allSugg.get(0).click();
driver.close();
	}

}
