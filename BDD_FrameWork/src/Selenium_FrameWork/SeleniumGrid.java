package Selenium_FrameWork;

import org.testng.annotations.DataProvider;

public class SeleniumGrid {

	@DataProvider(parallel = true)
	public Object[][] sendData() {

		Object arr[][] = new Object[2][2];

		arr[0][0] = "Email_1";
		arr[0][1] = "chrome";

		arr[1][0] = "Email_2";
		arr[1][1] = "chrome";

		return arr;

	}
}

/*
 * @Test(dataProvider = "sendData") public void login(String userName, String
 * browserName) throws Exception {
 *
 * DesiredCapabilities cap = null; if (browserName.equalsIgnoreCase("chrome")) {
 * cap = DesiredCapabilities.chrome(); cap.setBrowserName("chrome");
 * cap.setPlatform(Platform.ANY); RemoteWebDriver driver = new
 * RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
 *
 * driver.get("https://www.facebook.com/"); } } }
 */
