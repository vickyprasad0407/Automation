package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(id="loginButton")
	private WebElement lgbtn;
	
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setLogin (String un,String pwd)
	{
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		lgbtn.click();
	}
}
