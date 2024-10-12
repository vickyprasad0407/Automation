package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test(priority=1,invocationCount = 0)
	public void createAccount()
	{
		Reporter.log("create account",true);
		Assert.fail();
	}
	@Test(priority=2)
	public void updateAccount()
	{
		Reporter.log("update account", true);
	}
	@Test(priority=3)
	public void deleteAccount()
	{
		Reporter.log("delete account", true);
	}
}
