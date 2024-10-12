package com.actitime.generic;

import java.io.IOException;

public class DemoLibrary {

	public static void main(String[] args) throws IOException {
FileLib f=new FileLib();
String url = f.getPropertyData("url");
System.out.println("url is.."+url);
f.setExcelData("CreateCustomer", 3, 3, "fail");
String status = f.getExcelData("CreateCustomer", 3, 3);
System.out.println("status of cusomer is...."+status);
	}

}
