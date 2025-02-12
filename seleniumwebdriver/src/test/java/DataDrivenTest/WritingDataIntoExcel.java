package DataDrivenTest;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException  {
		
	//Excel File ---> workbook ---> Sheets ---> Rows ---> Cells (Hierarchy of the excel sheet)
		
		//We use FileOutputStream to write data into the excel file
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx"); //created a new excel file
		
		XSSFWorkbook workbook = new XSSFWorkbook(); //create a new workbook
		
		XSSFSheet sheet = workbook.createSheet("Data"); //create new sheet
		
		XSSFRow row1 = sheet.createRow(0); //create new row
		
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2 = sheet.createRow(1); //create new row
		
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(3);
		row2.createCell(2).setCellValue("Automation");
//		
		XSSFRow row3 = sheet.createRow(2); //create new row
		
		row3.createCell(0).setCellValue("C#");
		row3.createCell(1).setCellValue(5);
		row3.createCell(2).setCellValue("Automation");
		
		workbook.write(file); //writing workbook to the file
		workbook.close();
		file.close();
		
		System.out.println("File is created...");
		
	}
	
}
