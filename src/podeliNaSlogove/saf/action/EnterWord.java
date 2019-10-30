package podeliNaSlogove.saf.action;

import org.openqa.selenium.WebDriver;

import podeliNaSlogove.saf.page.Pocetna;

public class EnterWord {
	
	public void enter(WebDriver driver, String word) {
		Pocetna.getUnesiteTekstBox(driver).sendKeys(word);
	}

}
