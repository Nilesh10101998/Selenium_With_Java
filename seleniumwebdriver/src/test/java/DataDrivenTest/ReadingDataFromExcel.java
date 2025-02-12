package DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {
	
	public static void main(String[] args) throws IOException {
		
     //Excel File ---> workbook ---> Sheets ---> Rows ---> Cells (Hierarchy of the excel sheet)
		
	  //Reading the data from the excel file	
		
	  FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\Data.xlsx"); //Set the dynamic path by using the System.getproperty method

	  XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	  XSSFSheet sheet = workbook.getSheet("Sheet1");  //Getting the sheet by using the name
//	  XSSFSheet sheet1 = workbook.getSheetAt(1);  //Getting sheet by using the index
	  
	  int totalrows = sheet.getLastRowNum();
	  
	  int totalcells = sheet.getRow(0).getLastCellNum();
	  
	  System.out.println("number of rows: " + totalrows);  //5 => rows are counting from the 0th index (according to excel)
	  System.out.println("number of cells: "+ totalcells); //4 => cells are counting from the 1st index (according to excel)
	  
	  
	  for(int r = 0; r <= totalrows; r++)  //to loop inside the row
	  {
		XSSFRow currentrow =  sheet.getRow(r);
		  
		  for(int c = 0; c < totalcells; c++)  //to loop inside the cells (columns)
		  {
			  XSSFCell currentcell = currentrow.getCell(c);
			  System.out.print(currentcell.toString() + "\t");
			  
		  }
		    System.out.println();
		    
	  }
	  
	  workbook.close();
	  file.close();
	  
	}

}
