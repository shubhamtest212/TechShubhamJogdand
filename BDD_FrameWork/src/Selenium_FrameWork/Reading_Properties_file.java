package Selenium_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Reading_Properties_file {

	public static void main(String[] args) throws Exception {

		// Reading properties from file
		File scr1 = new File(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository/config.properties");
		FileInputStream fis1 = new FileInputStream(scr1);
		Properties pro1 = new Properties();
		pro1.load(fis1);




	}

}
