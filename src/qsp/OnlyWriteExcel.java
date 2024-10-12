package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OnlyWriteExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("testscript").getRow(0).getCell(3).setCellValue("new cell");
		FileOutputStream fout=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fout);
		wb.close();
	}

}
