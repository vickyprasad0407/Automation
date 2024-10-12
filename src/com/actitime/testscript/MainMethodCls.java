package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.pom.LoginPage1;

public class MainMethodCls {
static
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
}
   @Test
	public void validTestLogin() throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage1 l=new LoginPage1(driver);
		//l.setLogin("admin1","manager1");
		//Thread.sleep(3000);
		l.setLogin("admin","manager");
	}

}
