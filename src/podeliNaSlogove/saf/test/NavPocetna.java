package podeliNaSlogove.saf.test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import podeliNaSlogove.saf.action.GoToPrijaviPogresnuPodelu;
import podeliNaSlogove.saf.action.ReturnToPocetna;

public class NavPocetna extends TestCase {
	
@BeforeSuite
	
public void setUp() {
	init("http://www.podelinaslogove.com/index.html");
}


@Test
public void Pocetna() {
	ReturnToPocetna returnToPocetna = new ReturnToPocetna();
	returnToPocetna.pocetna(driver);
	GoToPrijaviPogresnuPodelu prijavi = new GoToPrijaviPogresnuPodelu();
	prijavi.prijavi(driver);
}

}
