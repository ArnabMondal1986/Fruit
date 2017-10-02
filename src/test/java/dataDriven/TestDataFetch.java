package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataFetch {
	
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public TestDataFetch(String FilePath){
		
		try{
		File fil = new File(FilePath);
		FileInputStream fis=new FileInputStream(fil);
		wb= new XSSFWorkbook(fis);
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(String sheetname, int col, int row){
		
		sh=wb.getSheet(sheetname);
		
		String data=sh.getRow(row).getCell(col).getStringCellValue();
		
		//int data1=(int)sh.getRow(row).getCell(col).getNumericCellValue();
		
		return data;
	}
	
	public int rowNum(String sheetname){
		
		sh=wb.getSheet(sheetname);
		int rowC=sh.getLastRowNum();
		int rowcount=rowC+1;
		
		return rowcount;
	
	}

}
