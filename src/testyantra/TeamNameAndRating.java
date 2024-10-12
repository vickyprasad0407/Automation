// xpath to find all team points and team name
package testyantra;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeamNameAndRating {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> list = driver.findElements(By.xpath("//tbody/tr/td[2]|//tbody/tr/td[4]"));
		for (WebElement webElement : list) {
			System.out.println(webElement);
			
		}
		//Thread.sleep(20000);
		/*List<WebElement> teams = driver.findElements(By.xpath("//tbody/tr/td[2]/span[2]"));
		List<WebElement> points = driver.findElements(By.xpath("//tbody/tr//td[4]"));
		for(int i=0;i<teams.size();i++)
		{
			System.out.println(teams.get(i).getText()+"=="+points.get(i).getText());
		}*/
		driver.close();
	}

}
