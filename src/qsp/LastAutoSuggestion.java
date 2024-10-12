/*
 goto google.com
 type qspider in search box
 capture all the suggestion and print the text
 select the last auto suggestion
 */
package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastAutoSuggestion {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("qspider");
Thread.sleep(3000);
List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'qspider')]"));

for(WebElement e: allSugg)
{
System.out.println(e.getText());	
}
allSugg.get(allSugg.size()-1).click();
driver.close();
	}

}
