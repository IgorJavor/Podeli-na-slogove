package podeliNaSlogove.saf.action;

import org.openqa.selenium.WebDriver;

import podeliNaSlogove.saf.page.Pocetna;

public class GoToPrijaviPogresnuPodelu {
	public void prijavi(WebDriver driver) {
		Pocetna.getNavButtonPrijaviPogresnuPodelu(driver).click();
	}
}
