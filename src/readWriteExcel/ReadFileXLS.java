package readWriteExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadFileXLS {

	public static void main(String[] args) throws IOException {

		// Open .xls file
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\ReadFilenew.xls");

		// Create Workbook (.xls → HSSFWorkbook)
		HSSFWorkbook workbook = new HSSFWorkbook(file);

		// Get first sheet
		HSSFSheet sheet = workbook.getSheetAt(0);

		// Get total number of rows
		int totalRows = sheet.getLastRowNum();

		System.out.println("Total Rows:" + totalRows);

		// Loop through Rows
		for (int i = 0; i <=totalRows; i++) {
			HSSFRow row = sheet.getRow(i);
			if (row != null) {
				int totalcells = row.getLastCellNum();

				// Loop through cells
				for (int j = 0; j < totalcells; j++) {
					HSSFCell cell = row.getCell(j);
					if (row != null) {
						System.out.print(cell.toString() + " ");
					}

				}
				System.out.println();
			}
		}
		workbook.close();
		file.close();
	}

}
