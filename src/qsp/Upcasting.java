package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Upcasting {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
	}
	public static void driveDriver(WebDriver driver)
	{
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driveDriver(driver);
     WebDriver driver1=new FirefoxDriver();
     driveDriver(driver1);
	}

}
