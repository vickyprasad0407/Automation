package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement resource=driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(resource).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement target = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(target).perform();
		/*boolean title = driver.findElement(By.xpath("//title[text()='HackerEarth Case Study | Vtiger CRM']")).isDisplayed();
		//boolean title = titleText.isDisplayed();
		if(title)
			System.out.println("hackerEarth page is displayed");
		else
			System.out.println("hacker earth is not displayed");*/
		String etitle=driver.getTitle();
		String atitle="HackerEarth Case Study | Vtiger CRM";
		if (etitle.equals(atitle))
			System.out.println("we are on correct page");
		else
			System.out.println("we are not in correct page");
		driver.close();
	}

}
