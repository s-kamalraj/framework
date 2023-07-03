package framework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TS_01 extends Base{
	/**
	 *Description - reg is used to access the members in Signup class 
	 */
//	Signup reg=null;
//	public TestCase() {
//	this.reg=super.reg;
//	}
	
	@Test (priority = 1, groups = "smoke")
	public void TC_01() {
		reg.enterFirstname("TC_01");
		assertEquals( reg.firstname.getAttribute("value")
				,readExcel("TC_01"));
	}
	@Test (priority = 2 ,groups ="smoke")
	public void TC_02() {
		reg.enterFirstname("TC_02");
		reg.firstname.clear();
		assertEquals(reg.firstname.getAttribute("value"),"");
	}
	@Test (priority = 3)
	public void TC_03() {
		reg.enterFirstname("TC_03");
		pressTab();
		String actual = reg.firstname.getAttribute("value");
		assertTrue(reg.firstnameError.isDisplayed());
	}
	@Test (priority = 4)
	public void TC_04() {
		reg.enterFirstname("TC_04");
		assertEquals(reg.firstname.getAttribute("value"), "");
	}
	@Test (priority = 5)
	public void TC_05() {
		reg.enterFirstname("TC_05");
		assertEquals(reg.firstname.getAttribute("value"),"kamal");
	}
	@Test (priority = 6,groups = "smoke")
	public void TC_06() {
		reg.enterLastname("TC_06");
		assertEquals(reg.lastname.getAttribute("value"),readExcel("TC_06") );
		
	}
	@Test (priority = 7)
	public void TC_07() {
		reg.enterLastname("TC_07");
		pressTab();
		String actual = reg.lastname.getAttribute("value");
		assertTrue(reg.lastnameError.isDisplayed());
	}
	@Test (priority = 8)
	public void TC_08() {
		reg.enterLastname("TC_08");
		assertEquals(reg.lastname.getAttribute("value"),"");
	}
	@Test (priority = 9)
	public void TC_09() {
		reg.enterLastname("TC_09");
		assertEquals(reg.lastname.getAttribute("value"),"kamal");
	}
	@Test(priority = 10,groups = "smoke")
	public void TC_10() {
		reg.enterLastname("TC_10");
		reg.lastname.clear();
		assertEquals(reg.lastname.getAttribute("value"),"");
	}
	@Test (priority = 11,groups = "smoke" )
	public void TC_11() {
		reg.enterUsername("TC_11");
		assertEquals(reg.username.getAttribute("value"), readExcel("TC_11"));
	}
	@Test (priority = 12,groups = "smoke")
	public void TC_12() {
		reg.enterUsername("TC_12");
		assertEquals(reg.username.getAttribute("value"), readExcel("TC_12"));	
	}
	@Test(priority = 13)
	public void TC_13() {
		reg.enterUsername("TC_13");
		pressTab();
		assertEquals(reg.usernameError.isDisplayed(), true);
	}
	@Test(priority = 14)
	public void TC_14() {
		assertEquals(reg.genderSymbol.isDisplayed(), true);
	}
	@Test (priority = 15)
	public void TC_15() {
		String actual = reg.genderSelected.getText();
		assertEquals(actual, "");
	}
	@Test (priority = 16, groups = "smoke")
	public void TC_16() {
		waitAndClick(reg.gender);
		boolean actual = reg.genderOpt.isEmpty();
		assertFalse(actual);
	}
	@Test (priority = 17, groups = "smoke")
	public void TC_17() {
		reg.selectAllGenderOpt();
		assertEquals(reg.genderSelected.getText(), "Others");
	}
	@Test (priority = 18,groups = "smoke")
	public void TC_18() {
		reg.enterEmail("TC_18");
		assertEquals(reg.email.getAttribute("value"),readExcel("TC_18"));
	}
	@Test (priority = 19)
	public void TC_19() {
		reg.enterEmail("TC_19");
		pressTab();
		assertEquals(reg.emailError.isDisplayed(), true);
	}
	@Test (priority = 20,groups = "smoke")
	public void TC_20() {
		reg.enterOrg("TC_20");
		String actual = reg.org.getAttribute("value");
		assertEquals(actual, readExcel("TC_20"));
	}
	@Test (priority = 21,groups = "smoke")
	public void TC_21() {
		reg.enterOrg("TC_21");
		reg.selectOrgResult();
		String actual = reg.org.getAttribute("value").toLowerCase();
		Reporter.log(actual,true);
		assertTrue(actual.contains(readExcel("TC_21")));
	}
	@Test (priority = 22,groups = "smoke")
	public void TC_22() {
		reg.enterPhoneNumber("TC_22");
		assertEquals(reg.phone.getAttribute("value"), readExcel("TC_22"));
	}
	@Test (priority = 23)
	public void TC_23() {
		reg.enterPhoneNumber("TC_23");
		assertEquals(reg.phoneError.isDisplayed(), true);
	}
	@Test (priority = 24)
	public void TC_24() {
		reg.enterPhoneNumber("TC_24");
		assertEquals(reg.phoneError.isDisplayed(), true);
	}
	@Test (priority = 25)
	public void TC_25() {
		reg.enterPhoneNumber("TC_25");
		assertEquals(reg.phoneError.isDisplayed(), true);
	}
	@Test (priority = 26)
	public void TC_26() {
		reg.enterPhoneNumber("TC_26");
		assertEquals(reg.phoneError.isDisplayed(), true);
	}
	@Test (priority = 27)
	public void TC_27() {
		boolean actual = reg.checkBox.isSelected();
		assertEquals(actual, false);
	}
	@Test (priority = 28, groups = "smoke")
	public void TC_28() {
		waitAndClick(reg.checkBox);
		assertEquals(reg.checkBox.isSelected(), false);
	}
	@Test (priority = 29)
	public void TC_29() {
		waitAndClick(reg.privacyLink);
		assertTrue(reg.getPrivacyTitle().contains("Privacy Policy"));
	}
	@Test (priority = 30)
	public void TC_30() {
		waitAndClick(reg.termsLink);
		assertTrue(reg.getTermsTitle().contains("Terms & Conditions"));
	}
	@Test (priority = 31,groups = "smoke")
	public void TC_31() {
		reg.enterPassword("TC_31");
		assertEquals(reg.password.getAttribute("value"),readExcel("TC_31"));
	}
	@Test (priority = 32)
	public void TC_32() {
		reg.enterPassword("TC_32");
	}
	@Test (priority = 33)
	public void TC_33() {
		reg.enterPassword("TC_33");
	}
	@Test (priority = 34)
	public void TC_34() {
		reg.enterPassword("TC_34");
	}
	@Test (priority = 35)
	public void TC_35() {
		reg.enterPassword("TC_31");
		reg.enterConfirmPassword("TC_35");
		assertEquals(reg.confirmPasswod.getAttribute("value"),readExcel("TC_35"));
	}
	@Test (priority = 36)
	public void TC_36() {
		reg.enterPassword("TC_31");
		reg.enterConfirmPassword("TC_35");
		assertEquals(reg.confirmPasswordError.isDisplayed(), true);
	}
	
	@Test (priority = 37)
	public void TC_37() {
		assertEquals(reg.register.isEnabled(), false);
	}
	
	
	
}
