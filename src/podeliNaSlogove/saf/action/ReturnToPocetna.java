package podeliNaSlogove.saf.action;

import org.openqa.selenium.WebDriver;

import podeliNaSlogove.saf.page.Pocetna;

public class ReturnToPocetna {
	public void pocetna(WebDriver driver) {
		Pocetna.getNavButtonPocetna(driver).click();
	}
}
