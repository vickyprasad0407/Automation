package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass
{

	@Test(groups="regressionTest")
	public void createProject()
	{
		Reporter.log("create a project", true);
		Assert.fail();
	}
     
}
