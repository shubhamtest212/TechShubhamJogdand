package Selenium_FrameWork;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logger {

	public static void main(String[] args) {

		Logger lg = Logger.getLogger("logger");
		PropertyConfigurator.configure(
				"/home/shubham.jogdand@firstcry.io/eclipse-workspace/BDD_FrameWork/Repository2/LOG4J.properties");
		System.setProperty("webdriver.chrome.driver", "/home/shubham.jogdand@firstcry.io/Downloads/chromedriver");
		lg.info("System set property done");


	}

}
