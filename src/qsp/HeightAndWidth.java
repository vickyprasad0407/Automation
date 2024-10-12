package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidth {
static
{
 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
int h1=driver.findElement(By.id("username")).getLocation().getX();
int w1=driver.findElement(By.id("username")).getLocation().getY();
int h2=driver.findElement(By.name("pwd")).getLocation().getX();
int w2=driver.findElement(By.name("pwd")).getLocation().getY();
System.out.println(h1+"....."+h2+"...."+w1+"..."+w2);
if (h1==h2 && w1==w2) {
	System.out.println("Both height and weidth are equal");
}
else
	System.out.println("Both height are not equals");
driver.close();
	}

}
