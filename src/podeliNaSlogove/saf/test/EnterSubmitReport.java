package podeliNaSlogove.saf.test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import podeliNaSlogove.saf.action.EnterWord;
import podeliNaSlogove.saf.action.ReportWrongDivision;
import podeliNaSlogove.saf.action.SubmitWord;

public class EnterSubmitReport extends TestCase {

@BeforeSuite
	
	public void setUp() {
		init("http://www.podelinaslogove.com/index.html");
	}


@Test

	public void enterWord() {
	
	EnterWord enter = new EnterWord();
	String word = "maca";
	enter.enter(driver, word);
	SubmitWord submit = new SubmitWord();
	submit.submit(driver);
	ReportWrongDivision report = new ReportWrongDivision();
	report.report(driver);
}
}
