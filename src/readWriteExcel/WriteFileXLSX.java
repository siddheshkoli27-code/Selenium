package readWriteExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFileXLSX {

	public static void main(String[] args) throws IOException {

		// Create an object of File class to open xlsx file
		File file = new File("C:\\Users\\Admin\\ReadFile.xlsx");
		
		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		
		// Creating workbook instance that refers to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		
		// Creating a Sheet object using the sheet Name
		XSSFSheet sheet= workbook.getSheet("Data");
		
		// Create a row object to retrieve row at index 6
		XSSFRow row = sheet.getRow(5);
		
		//create a cell object to enter value in it using cell index
		row.createCell(0).setCellValue(106);
		row.createCell(1).setCellValue("Jenifer");
		row.createCell(2).setCellValue(940345335);
		row.createCell(3).setCellValue("Morning");
		row.createCell(4).setCellValue("Ghansoli");
				
		FileOutputStream outputStream= new FileOutputStream("C:\\Users\\Admin\\Write2.xlsx");
		workbook.write(outputStream);
		workbook.close();

		

	}

}
