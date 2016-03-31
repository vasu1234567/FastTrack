package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	
	public static void main(String[] args) throws Exception {
		File scr=new File("C:\\Users\\loadrunner\\Desktop\\New folder\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(scr);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		/*String cellValue1=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellValue1);
		String CellValue2=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(CellValue2);*/
       /* int rowCount=sheet1.getLastRowNum();
        System.out.println(rowCount+1);
        for (int i = 0; i < rowCount+1; i++) 
        {
        	String cellValue1=sheet1.getRow(i).getCell(0).getStringCellValue();
        	String CellValue2=sheet1.getRow(i).getCell(1).getStringCellValue();
        	System.out.println(cellValue1+"---"+CellValue2);
        	
		}*/
		// Writing Data into Excel file
		sheet1.getRow(0).createCell(2).setCellValue("Qedge");
		sheet1.getRow(1).createCell(2).setCellValue("Tech");
		FileOutputStream fou=new FileOutputStream(scr);
		wb.write(fou);
		wb.close();
		
		
		
		
	}

}
