package testyantra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
       WebDriver driver=new ChromeDriver(option);
       driver.get("https://www.spicejet.com/");
       String from="Kolkata";
       driver.findElement(By.xpath("//div[text()='From']")).click();
       driver.findElement(By.xpath("//div[text()='From']/../div[2]/input")).sendKeys(from);
       String to="Delhi";
       driver.findElement(By.xpath("//div[text()='To']")).click();
       driver.findElement(By.xpath("//div[text()='To']/../div[2]/input")).sendKeys(to);
       driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
       String day="Thu,";
       String cdate="22";
       String month="Dec";
       String year="2022";
       String depDate=day+" "+cdate+" "+month+" "+year;
       Thread.sleep(9000);
       driver.findElement(By.xpath("//div[text()='"+depDate+"']")).click();
	}

}
