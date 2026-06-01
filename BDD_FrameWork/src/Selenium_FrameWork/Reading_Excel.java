package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Excel {

	public static void main(String[] args) throws Exception {

		// Specify the location of excel file
		File src = new File("/home/shubham.jogdand@firstcry.io/Downloads/FCQwik-Monthly-Incentive-Report-30462.xls");

		// Load the file
		FileInputStream fis = new FileInputStream(src);

		// Load WorkBook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// Load Work Sheet
		XSSFSheet sh = wb.getSheet("Rider Report");

		// Printed the loaded sheet name
		System.out.println(sh.getSheetName());

	}

}
