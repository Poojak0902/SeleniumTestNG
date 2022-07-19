package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Base {
	
public  WebDriver driver;


public void setUp(String browser, String url) {
	String path = System.getProperty("user.dir");
	System.out.println("This is local path"+ path);
	
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();	
	}else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", path+"\\drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
	}else if (browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", path+"\\drivers\\msedgedriver.exe");
		driver= new EdgeDriver();
	}else {
		System.out.println("this is not relevant browser");
		System.exit(0);
	}
if (url!="") {
	driver.get(url);
	
}else {
	driver.get("about:blank");
}
	
	
}

	
	public void teardown() {
		driver.quit();
	}
	

}
