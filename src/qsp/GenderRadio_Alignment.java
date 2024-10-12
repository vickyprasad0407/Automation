package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderRadio_Alignment {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(20000);	
		int male=driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
		int female=driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
		int custom=driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
		if (male==female && female==custom) {
			System.out.println("properly aligned");
		}
		else
			System.out.println("not properly aligned");
		driver.close();
	}

}
