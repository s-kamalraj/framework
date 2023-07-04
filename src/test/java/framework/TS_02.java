package framework;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TS_02 extends Base{
	@Test (priority = 1,groups = "smoke")
	public void TC_01() {
		assertEquals(reg.signupTitle()
				, readExcel("title"));
	}
	@Test (priority = 2)
	public void TC_02() {
		reg.navigation().back();
		reg.navigation().forward();
		assertEquals(reg.signupTitle(),readExcel("title"));
	}
	@Test (priority = 3)
	public void TC_03() {
		reg.navigation().refresh();
		String actual = reg.signupTitle();
		assertEquals(actual, readExcel("title"));
	}
	@Test (priority = 4)
	public void TC_04() {
		String actual = reg.signupTitle();
		assertEquals(actual, readExcel("title"));
	}
	
}
