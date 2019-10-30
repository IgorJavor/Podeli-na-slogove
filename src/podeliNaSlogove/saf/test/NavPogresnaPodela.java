package podeliNaSlogove.saf.test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import podeliNaSlogove.saf.action.GoToPrijaviPogresnuPodelu;


public class NavPogresnaPodela extends TestCase {

	@BeforeSuite
	
	public void setUp() {
		init("http://www.podelinaslogove.com/index.html");
	}


	@Test
	public void PrijaviPogresnuPodelu() {
		GoToPrijaviPogresnuPodelu prijavi = new GoToPrijaviPogresnuPodelu();
		prijavi.prijavi(driver);
	}
}
