package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readingPropertiesFile_1 {

	public static void main(String[] args) throws Exception {

		// config properties file
		File src1 = new File(
				"/home/shubham.jogdand@firstcry.io/git/TechShubhamJogdand/BDD_FrameWork/src/com/projectName/repository/config.properties");
		FileInputStream fis1 = new FileInputStream(src1);
		Properties pro1 = new Properties();
		pro1.load(fis1);

		// test data properties file
		File src2 = new File(
				"/home/shubham.jogdand@firstcry.io/git/TechShubhamJogdand/BDD_FrameWork/src/com/projectName/repository/testdata.properties");
		FileInputStream fis2 = new FileInputStream(src2);
		Properties pro2 = new Properties();
		pro2.load(fis2);

		// locator properties file
		File src3 = new File(
				"/home/shubham.jogdand@firstcry.io/git/TechShubhamJogdand/BDD_FrameWork/src/com/projectName/repository/locator.properties");
		FileInputStream fis3 = new FileInputStream(src3);
		Properties pro3 = new Properties();
		pro3.load(fis3);

	}

}
