package podeliNaSlogove.saf.action;

import org.openqa.selenium.WebDriver;

import podeliNaSlogove.saf.page.Pocetna;

public class SubmitWord {
	
	public void submit(WebDriver driver) {
		Pocetna.getPodeliNaSlogoveButton(driver).click();
	}

}
