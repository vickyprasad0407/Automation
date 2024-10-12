package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ht_wt_Fb {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		int x=driver.findElement(By.id("loginbutton")).getLocation().getX();
		int y=driver.findElement(By.id("loginbutton")).getLocation().getY();
		System.out.println("x axis : "+x);
		System.out.println("y axis : "+y);
		driver.close();
	}

}
