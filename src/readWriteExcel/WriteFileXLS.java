package readWriteExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteFileXLS {

	public static void main(String[] args) throws IOException {
		
		// Open.xls File
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\ReadFilenew.xls");
		
		// Create Workbook (.xls → HSSFWorkbook)
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		
		// Creating a sheet object using sheet name
		HSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//Create a row object to retrive row at index 6
		HSSFRow row=sheet.createRow(6);
		
		//create a cell object to enter value in it using cell index
		row.createCell(0).setCellValue(106);
		row.createCell(1).setCellValue("Jenifer");
		row.createCell(2).setCellValue(940345335);
		row.createCell(3).setCellValue("Morning");
		row.createCell(4).setCellValue("Ghansoli");
		
		//write the date in excel using output stream
		FileOutputStream outputStream=new FileOutputStream("C:\\\\Users\\\\Admin\\\\Write1.xls");
		workbook.write(outputStream);
		workbook.close();
	}

}
