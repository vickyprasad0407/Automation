//wajs to print the status of checkbox status is present or not
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxStatus {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean b=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if (b) {
			System.out.println("check box selected");
		}
		else 
			System.out.println("checkbox is not selected");
	}

}
