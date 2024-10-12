package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUploadPopUp2 {
static
{
   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		Thread.sleep(3000);
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement value = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(value);
		s.selectByValue("6");
		WebElement value1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(value1);
		s1.selectByValue("1947");
		driver.findElement(By.linkText("4")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		Thread.sleep(3000);
		WebElement actualText = driver.findElement(By.id("policynumberError"));
		System.out.println(actualText.getText());
		boolean text=actualText.isDisplayed();
		
		if (text)
			System.out.println("error message displayed");
		else
			System.out.println("error message not displayed");
		driver.close();
		
	}

}
