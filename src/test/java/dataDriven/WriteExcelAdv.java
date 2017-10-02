package dataDriven;

import java.io.File;
import java.io.FileInputStream;
//import java.io.IOException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelAdv {
	
	public static void main(String[] args) throws Exception{
		
		File src = new File("C:\\Users\\Rupa\\Desktop\\Selenium\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Results");
		sheet1.getRow(1).createCell(2).setCellValue("True");
		
		FileOutputStream fos = new FileOutputStream(src);
		wb.write(fos);
		wb.close();
	}

}
