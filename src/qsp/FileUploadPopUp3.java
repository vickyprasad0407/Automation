package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp3 {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mr.%20Santosh/Desktop/resumefile.html");
		Thread.sleep(3000);
        File f=new File("./data/fake_resume.docx");	
        String absolutePath = f.getAbsolutePath();
        driver.findElement(By.id("cv")).sendKeys(absolutePath);
       // driver.close();
	}

}
