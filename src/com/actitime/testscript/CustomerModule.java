package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListnerImplementation.class)
public class CustomerModule extends BaseClass{

	@Test
	public void createCustomer()
	{
		Reporter.log("vicky ", true);
	//	Assert.fail();
	}
}
