package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream("./data/sheet1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int rowCount=wb.getSheet("sheet1").getLastRowNum();
		System.out.println(rowCount);
		for (int i=1;i<=rowCount;i++)
		{
			 String id = wb.getSheet("sheet1").getRow(i).getCell(0).toString();
			String name=wb.getSheet("sheet1").getRow(i).getCell(1).getStringCellValue();
			System.out.println(id+"\t"+name);
		
		}
	}
}

