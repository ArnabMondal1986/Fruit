package utility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	int rowcount;
	
	public ExcelDataConfig(String excelPath) throws Exception{
		try {
		File src = new File(excelPath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		} 
	
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.getMessage());
		}
	}
	
	public String getData(String sheetname,int row,int col){
		sheet1=wb.getSheet(sheetname);
		String data = sheet1.getRow(row).getCell(col).getStringCellValue();
		// read numeric data 
		//int data= (int)sheet1.getRow(row).getCell(col).getNumericCellValue();
		return data;
		}
	
	public int rowcount(String sheetname){
		int rown=wb.getSheet(sheetname).getLastRowNum();
		int rocnt=rown+1;
		return rocnt;
	}
}