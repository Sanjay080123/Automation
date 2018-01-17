package com.koovs.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelLib {
	String str = "D:\\koovs-automation\\web\\TestData\\SignUpTestData.xlsx";
  @Test
  /**
   * 
   * @param sheetName
   * @param rowNum
   * @param colNum
   * @return
   * @throws EncryptedDocumentException
   * @throws InvalidFormatException
   * @throws IOException
   */
  public String GetExcelData(String sheetName, int rowNum , int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException {
	  
	  FileInputStream fis = new FileInputStream(str);
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet st = wb.getSheet(sheetName);
	  Row row =st.getRow(rowNum);
	  String data= row.getCell(colNum).getStringCellValue();
	  return data;
	  
  }
  @SuppressWarnings("static-access")
  @Test
  /**
   * 
   * @param sheetName
   * @param rowNum
   * @param colNum
   * @param value
   * @throws EncryptedDocumentException
   * @throws InvalidFormatException
   * @throws IOException
   */
  public void SetExcelData(String sheetName, int rowNum, int colNum, String value) throws EncryptedDocumentException, InvalidFormatException, IOException{
	  FileInputStream fis = new FileInputStream(str);
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet st = wb.getSheet(sheetName);
	  Row row =st.getRow(rowNum);
	  Cell cel = row.createCell(colNum);
	  cel.setCellType(cel.CELL_TYPE_STRING);
	  FileOutputStream fos = new FileOutputStream(str);
	  cel.setCellValue(value);
	  wb.write(fos);
  }
}
