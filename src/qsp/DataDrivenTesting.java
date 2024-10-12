package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String userName = p.getProperty("username");
		String pwd = p.getProperty("pwd");
		System.out.println("url is : "+url);
		System.out.println("username is : "+pwd);
		System.out.println("pwd is : "+pwd);
	}

}
