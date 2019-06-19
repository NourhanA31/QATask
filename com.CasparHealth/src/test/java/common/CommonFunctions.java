package common;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonFunctions {
	
	public static String getTestData(int rowNum, int colNum, String sheetName) throws IOException {	
		String filePath = System.getProperty("user.dir") + "/Assets/TestData.xlsx" ;
	 FileInputStream ExcelFile = new FileInputStream(filePath);
	 XSSFWorkbook testDataFile = new XSSFWorkbook(ExcelFile);
	 XSSFSheet testDataSheet = testDataFile.getSheet(sheetName);
	 XSSFCell dataCell =testDataSheet.getRow(rowNum).getCell(colNum);
	 String data = dataCell.getStringCellValue();
	 return data;
}

}
