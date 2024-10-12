//wap for complete round trip on the given date
package testyantra;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RoundTripOnMakeMy {
static
{
   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		Actions action=new Actions(driver);
		action.moveByOffset(10, 10).click().perform();
		driver.findElement(By.xpath("//li[text()='Round Trip']")).click();
		
		String fromCity="Bengaluru";
		WebElement from = driver.findElement(By.id("fromCity"));
		from.sendKeys(fromCity);
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		
		String toCity="Bankok";
		WebElement to = driver.findElement(By.id("toCity"));
		to.sendKeys(toCity);
		driver.findElement(By.xpath("(//p[text()='Bangkok, Thailand'])[1]")).click();
		Date date=new Date();
		String [] d=date.toString().split(" ");
		String day=d[0];
		String month=d[1];
		String cdate=d[2];
		String year=d[5];
        String travelDate=day+" "+month+" "+cdate+" "+year;
        driver.findElement(By.xpath("//div[@aria-label='"+travelDate+"']")).click();
        String rday="Tue";
        String rmonth="Feb";
        String rdate="14";
        String ryear="2023";
        String returnDate=rday+" "+rmonth+" "+rdate+" "+ryear;
        while(true)
        {
        	try {
        		driver.findElement(By.xpath("//div[@aria-label='"+returnDate+"']")).click();
        		break;
        	}
        	catch(NoSuchElementException e)
        	{
        		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        	}
        }
        driver.findElement(By.xpath("//a[text()='Search']")).click();
        Thread.sleep(20000);
        driver.close();
        
	}

}
