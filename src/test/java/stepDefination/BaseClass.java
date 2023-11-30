package stepDefination;

import org.openqa.selenium.WebDriver;
import untilities.DriverManager;

public class BaseClass {
	protected WebDriver driver;
	
	public BaseClass() {
		// TODO Auto-generated constructor stub
		this.driver = DriverManager.getDriver();
	}
	
}
