package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp4 {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(3000);
		File f=new File("./data/xyz.docx");
		String absolutePath=f.getAbsolutePath();
		WebElement res = driver.findElement(By.xpath("//button[.='Upload Resume']"));
		//res.click();
		res.sendKeys(absolutePath);
		//driver.close();
	}

}
