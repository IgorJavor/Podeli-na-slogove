package podeliNaSlogove.saf.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;

public class TestCase {
	
	protected WebDriver driver;
	
	public void init(final String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterSuite
	
	public void tearDown() {
		driver.close();
	}

}
