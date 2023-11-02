package auto.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fs=new FileInputStream(new File("D:\\inputs.xlsx"));
	    
	    XSSFWorkbook wb=new XSSFWorkbook(fs);
	    
	    XSSFSheet sheet=wb.getSheetAt(0);
	    
	    int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	    
	    for(int i=0;i<=rowCount;i++)
	    {
	    	int cellCount=sheet.getRow(i).getLastCellNum();
	    	
	    	for(int j=0;j<cellCount;j++)
	    	{
	    		System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
	    	}
	    	System.out.println();
	    }
	    
		    
	    
	    

	}

}
