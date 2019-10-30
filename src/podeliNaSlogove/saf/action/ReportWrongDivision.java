package podeliNaSlogove.saf.action;

import org.openqa.selenium.WebDriver;

import podeliNaSlogove.saf.page.Pocetna;

public class ReportWrongDivision {
	
	public void report(WebDriver driver) {
		Pocetna.getPrijavitePogresnoPodeljenuRecButton(driver).click();
	}

}
