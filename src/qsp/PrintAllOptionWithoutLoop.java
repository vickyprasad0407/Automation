package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionWithoutLoop {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Mr.%20Santosh/Desktop/Hotel.html");
		WebElement mtrList=driver.findElement(By.id("mtr"));
	    Select s=new Select(mtrList);
	    WebElement allOption=s.getWrappedElement();
	    String text = allOption.getText();
	    System.out.println(text);
	    driver.close();
	}

}
