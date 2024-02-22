package com.demowebshop.genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleReadGeneric 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	multipleRead(" ");
}
public static String[][] multipleRead(String sheetName) throws EncryptedDocumentException, IOException 
{
	File file=new File("./TestData/fetchdata.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet("Register");
	int row_size=sheet.getPhysicalNumberOfRows();
	int col_size=sheet.getRow(0).getPhysicalNumberOfCells();
	 String[][] data = new String[row_size-1][col_size];
	 for(int i=0;i<row_size-1;i++)
	 {
		 for(int j=0;j<col_size;j++)
		 {
			 data[i][j]=sheet.getRow(i+1).getCell(j).toString();
		 }
	 }
	 return  data;
}
}
