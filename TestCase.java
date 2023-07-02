package framework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase extends Base{
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
		String actual = reg.firstnameError.getText();
		assertEquals(actual,"Please enter a valid name");
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
		String actual = reg.lastnameError.getText();
		assertEquals(actual,"Please enter a valid name");
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
		assertFalse(reg.usernameError.isDisplayed());
	}
	@Test (priority = 12,groups = "smoke")
	public void TC_12() {
		reg.enterUsername("TC_12");
		assertEquals(reg.username.getAttribute("value"), readExcel("TC_12"));
		assertFalse(reg.usernameError.isDisplayed());		
	}
	@Test(priority = 13)
	public void TC_13() {
		reg.enterUsername("TC_13");
		assertTrue(reg.usernameError.isDisplayed());
	}
	@Test(priority = 14)
	public void TC_14() {
		waitAndClick(reg.gender);
		waitAndClick(reg.username);
		assertTrue(reg.genderError.isDisplayed());
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
		assertEquals(reg.genderSelected, "Others");
	}
	@Test (priority = 18,groups = "smoke")
	public void TC_18() {
		reg.enterEmail("TC_18");
		assertEquals(reg.emailError.isDisplayed(), false);
	}
	@Test (priority = 19)
	public void TC_19() {
		reg.enterEmail("TC_19");
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
		assertEquals(reg.checkBox.isSelected(), true);
	}
	@Test (priority = 29)
	public void TC_29() {
		waitAndClick(reg.privacyLink);
		assertTrue(reg.getPrivacyTitle().contains("privacy policy"));
	}
	@Test (priority = 30)
	public void TC_30() {
		waitAndClick(reg.termsLink);
		assertTrue(reg.getTermsTitle().contains("Terms & Conditions"));
	}
	@Test (priority = 31)
	public void TC_31() {
		reg.enterPassword("TC_31");
		assertEquals(reg.password.getAttribute("value"),readExcel("TC_31"));
	}
	@Test (priority = 37)
	public void TC_37() {
		assertEquals(reg.register.isEnabled(), false);
	}
	@Test (priority = 38)
	public void TC_35() {
		reg.enterConfirmPassword("TC_35");
		assertEquals(reg.confirmPasswod.getAttribute("value"),readExcel("TC_35"));
	}
	
	/*
	@Test (priority = 1)
	public void TC_01() {
		assertEquals(reg.title(driver), reg.readExcel("title"));
	}

	@Test (priority = 2)
	public void TC_02() {
		assertEquals(reg.title(driver), reg.readExcel("title"));
	}

	@Test (priority = 3)
	public void TC_03() {
		assertTrue(reg.logo.isDisplayed());
	}

	@Test (priority = 4)
	public void TC_04() {
		assertEquals(reg.getTextValidate(reg.heading)
				, reg.readExcel("HEADING"));
	}

	@Test (priority = 5)
	public void TC_05() {
		reg.enterFirstname("TC_05");
		assertEquals(reg.firstname), reg.readExcel("TC_05"));
	}

	@Test (priority = 6)
	public void TC_06() {
		reg.enterFirstname("TC_06");
		reg.clear(reg.firstname);
		Assert.assertNull(reg.firstname));
	}

	@Test (priority = 7)
	public void TC_07() {
		reg.enterFirstname("TC_07");
		assertTrue(reg.firstnameError.isDisplayed());
	}

	@Test (priority = 8)
	public void TC_08() {
		assertEquals(reg.getPlaceholder(reg.firstname), reg.readExcel("Fnholder"));
	}

	@Test (priority = 9)
	public void TC_09() {
		assertEquals(reg.getTextValidate(reg.firstnameLabel)
				, reg.readExcel("FnLabel"));
	}

	@Test (priority = 10)
	public void TC_10() {
		reg.enterLastname("TC_10");
		assertEquals(reg.lastname), reg.readExcel("TC_10"));
	} 
	@Test (priority = 11)
	public void TC_11() {
		reg.enterLastname("TC_11");
		reg.clear(reg.lastname);
		assertEquals(reg.lastname), readExcel("TC_11"));
	}
	*/

}
