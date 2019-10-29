package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pocetna {
	private static WebElement element = null;
	
	public static WebElement UnesiteTekstBox(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#newInput"));
		return element;
	}
	public static WebElement PodeliNaSlogoveButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#submit"));
		return element;
	}
	
}
