package utilities;

import java.io.File;
import java.io.FileInputStream;
//import java.util.Properties;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

public class Helper {
	
	Workbook workbook;
	Sheet iSheet;
	Row oRow;
	
	
//	public String readFromPropFile(String filePath, String key) {
//		
//		Properties prop = new Properties();
//		try {
//			FileInputStream file= new FileInputStream(filePath);
//			prop.load(file);
//			
//		}catch(Exception ex) {
//			Assert.fail("FAIL | IO EXCEPTION THROWN . please chech the file path");
//		}
//		
//		return prop.getProperty(key);
//	}
//	
	
	public String readFromExcel(String fpath,String sheetName, int rowNum, int colNum) {
		String cellValue=null;
		try {
			FileInputStream iFile= new FileInputStream(new File(fpath));
			DataFormatter df = new DataFormatter();
			String fileExtension = FilenameUtils.getExtension(fpath);
			System.out.println(fileExtension);
			if(fileExtension.equalsIgnoreCase("xls"))
				workbook= new HSSFWorkbook(iFile);
			else if(fileExtension.equalsIgnoreCase("xlsx"))
				workbook= new XSSFWorkbook(iFile);
			else
				Assert.fail("FAIL | valid extensions are xls and xlsx");
			
			iSheet= workbook.getSheet(sheetName);
			oRow= iSheet.getRow(rowNum-1);
			cellValue =df.formatCellValue( oRow.getCell(colNum-1));
			workbook.close();
		}catch(Exception ioex) {
			ioex.printStackTrace();
			Assert.fail("FAIL |  Unable to read from file ");
		}
		return cellValue;
	}
}
