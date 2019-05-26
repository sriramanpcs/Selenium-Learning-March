package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] readExcel(String filename) throws IOException {
		//open Workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+filename+".xlsx");
		
		//open sheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//last row count
		int rowCount = sh.getLastRowNum();
		
		//get colcount
		int colcount = sh.getRow(0).getLastCellNum();
		
		String[][] data =new String[rowCount][colcount];
		//for rows
		
		
		for(int i = 1;i<=rowCount;i++) {
			XSSFRow row=sh.getRow(i);
			
			//cols
			for(int j=0;j<colcount;j++) {
				XSSFCell cell=row.getCell(j);
				
				//read the cell in a string
				
			data[i-1][j] =cell.getStringCellValue();
				/*String name = cell.getStringCellValue();
				System.out.println(name)*/;
			}
			
		}
		return data;
		

	}

}
