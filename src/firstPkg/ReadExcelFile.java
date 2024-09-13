package firstPkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelFile
{
	
	public static void writeexcel() throws Exception
	{
		File f = new File("./Data/abc.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet cs = wb.createSheet("sheet");
		XSSFRow row1 = cs.createRow(0);
		XSSFCell col1 = row1.createCell(0);
		col1.setCellValue("Java");
		wb.write(fos);
		wb.close();
	}
	

	public static String readexcel() throws Exception
	{
		File f = new File("C:\\Users\\Santosh\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		//XLSX - XSSF
		//XLS - HSSF
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("Data");
		
		/*
		int No_of_Row = sh1.getPhysicalNumberOfRows();
		//System.out.println(No_of_Row);  //3
		
		for(int i=0;i<No_of_Row;i++)
		{
			XSSFRow  row = sh1.getRow(i);  //i=0, i=1, i=2
			
			int No_of_Column = row.getPhysicalNumberOfCells();
			//System.out.println(No_of_Column);  //3 //5
			
			for(int j=0;j<No_of_Column;j++)
			{
				XSSFCell column = row.getCell(j); //j=0, j=1, j=2
				System.out.print(column.getStringCellValue() + "  ");
			}
			
			System.out.println();
			
			
		}
		*/
		
		
		//row 1
		XSSFRow  r1 = sh1.getRow(0);
		XSSFCell c1 = r1.getCell(0);
		XSSFCell c2 = r1.getCell(1);
		
		System.out.print(c1.getStringCellValue() + "  ");
		System.out.println(c2.getStringCellValue());
		
		//Row2
		XSSFRow  r2 = sh1.getRow(1);
		XSSFCell c21 = r2.getCell(0);
		XSSFCell c22 = r2.getCell(1);
		
		System.out.print(c21.getStringCellValue() + "  ");
		System.out.println(c22.getStringCellValue());
		return c21.getStringCellValue();
		
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		writeexcel();
	}
	
}
