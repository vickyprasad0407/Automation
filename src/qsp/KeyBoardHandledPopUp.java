package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoardHandledPopUp {
static
{
  System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
}
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Robot r=new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_2);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.close();
	}

}
