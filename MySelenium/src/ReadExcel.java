import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//Step 1 - : Establish the bridge
		FileInputStream fip = new FileInputStream("E:\\Sonam\\SeleniumBySonam\\Demo.xlsx");
		
		//step 2 - create object of workbook
		XSSFWorkbook wb = new XSSFWorkbook(fip);  //  XSSF is used for xlsx files -- HSSF is used for xls
		
		//step 3 - calling the chapter / sheet from workbook/book
		XSSFSheet sheet = wb.getSheet("TestData");
		
		//all the occupied rows 
		System.out.println("Number of rows are " + sheet.getPhysicalNumberOfRows()); //6
		
		//all the occupied columns 
		System.out.println("Number of columns are " + sheet.getRow(1).getPhysicalNumberOfCells()); //3
		
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		
		System.out.println(sheet.getRow(3).getCell(1).getStringCellValue());
		
		for(int i=0; i<sheet.getPhysicalNumberOfRows();i++)
		{
			for(int j=0; j<sheet.getRow(1).getPhysicalNumberOfCells();j++)
			{
				System.out.println(sheet.getRow(1).getCell(j).getStringCellValue());
				
			}
		}
				

	}

}
