package podeliNaSlogove.saf.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pocetna {
	
	public static WebElement getNavButtonPocetna (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#home"));
	}
	public static WebElement getNavButtonPravilaPodele (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#rules"));
	}
	public static WebElement getNavButtonPrijaviPogresnuPodelu (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#report"));
	}
	public static WebElement getNavButtonOProjektu (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#about"));
	}
	public static WebElement getCyrillicButton (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#cyr"));
	}
	public static WebElement getLatinButton (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#lat"));
	}
	public static WebElement getTitleText (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#naslov"));
	}
	public static WebElement getDescriptionText (final WebDriver driver) {
		return driver.findElement(By.cssSelector(".description"));
	}
	public static WebElement getLinkToPravilaPodele (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#rulesA"));
	}
	public static WebElement getUnesiteTekstBox (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#newInput"));
	}
	public static WebElement getPodeliNaSlogoveButton (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#submit"));
	}
	public static WebElement getResultBox (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#result"));
	}
	public static WebElement getPrijavitePogresnoPodeljenuRecButton (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#reportBug"));
	}
	public static WebElement getKontaktirajteSNamaLink (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#contact > a"));
	}
	public static WebElement getPrijaviteBagLink (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#bug > a"));
	}
	public static WebElement getCopyrightInfo (final WebDriver driver) {
		return driver.findElement(By.cssSelector("#copy"));
	}
}
