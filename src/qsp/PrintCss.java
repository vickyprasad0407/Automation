package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCss {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.linkText("Forgotten password?"));
		System.out.println(e.getCssValue("color"));
		System.out.println(e.getCssValue("font-size"));
		System.out.println(e.getCssValue("font-family"));
		driver.close();
	}

}
