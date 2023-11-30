package untilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	private static WebDriver driver;
	
	public DriverManager() {
		
	}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public void quitDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
