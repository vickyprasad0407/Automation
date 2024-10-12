package testyantra;

import java.util.Date;

import org.openqa.selenium.WebDriver;

public class Demo {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d=new Date();
		System.out.println(d);
		 driver.switchTo().alert();
	}

}
