package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataWithoutHardCording {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream("./data/sheet1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int row=wb.getSheet("sheet1").getLastRowNum();
		
		 short col = wb.getSheet("sheet1").getRow(1).getLastCellNum();
		System.out.println(row+"...."+col);
		for (int i=0;i<=row;i++)
		{
			for (int j=0;j<col;j++)
			{
				String value = wb.getSheet("sheet1").getRow(i).getCell(j).toString();
				System.out.println(value);
			}
		}
	}

}
