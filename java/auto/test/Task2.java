package auto.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Sheet name:");
		
		String sn=s.nextLine();
		
FileInputStream fs=new FileInputStream(new File("D:\\inputs.xlsx"));
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet s1=wb.getSheetAt(0);
		
		XSSFSheet s2=wb.getSheetAt(1);
		
		if(sn==Sheet1)
		{
			
		}
		
		
		

	}

}
