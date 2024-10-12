package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithGeneric {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws IOException, InterruptedException {
FileLib f=new FileLib();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get(f.getPropertyData("url"));
driver.findElement(By.name("username")).sendKeys(f.getPropertyData("username"));
driver.findElement(By.name("pwd")).sendKeys(f.getPropertyData("pwd"));
driver.findElement(By.id("loginButton")).click();
Thread.sleep(3000);
driver.findElement(By.id("logoutLink")).click();
Thread.sleep(2000);
driver.close();
	}

}
 