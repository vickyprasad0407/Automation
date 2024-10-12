package qsp;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1 {
static
{
  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) {
		int count=0;
		WebDriver driver=new ChromeDriver();
	     Constructor []c=driver.getClass().getConstructors();
	     for (Constructor constructor : c) {
			System.out.println(constructor );
		}
		System.out.println(driver.getClass().getName());
		Method m[]=driver.getClass().getDeclaredMethods();
		for(Method method:m)
		{
			System.out.println(method);
			count++;
		}
		System.out.println("the no of methods are "+count);
		driver.close();
		
	}

}
