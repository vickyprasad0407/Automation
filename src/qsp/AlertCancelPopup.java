package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCancelPopup {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(10000);
		Alert a=driver.switchTo().alert();
		Thread.sleep(10000);
		String text=a.getText();
		Thread.sleep(10000);
		a.dismiss();
		System.out.println(text);
		Thread.sleep(10000);
		driver.close();
		
	}

}
