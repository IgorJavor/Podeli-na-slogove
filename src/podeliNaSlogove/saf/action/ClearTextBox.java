package podeliNaSlogove.saf.action;

import org.openqa.selenium.WebDriver;

import podeliNaSlogove.saf.page.Pocetna;

public class ClearTextBox {
	public void clear(WebDriver driver) {
		Pocetna.getUnesiteTekstBox(driver).clear();
	}

}
