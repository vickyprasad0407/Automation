package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass
{

	@Test(groups="smokeTest")
	public void createTask()
	{
		Reporter.log("your task is Copying your friends answer", true);
	}
}
