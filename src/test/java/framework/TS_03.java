package framework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

public class TS_03 extends Base {
	@Test (priority = 1)
	public void TC_01() {
		boolean actual = reg.logo.isDisplayed();
		assertEquals(actual, true);
	}
	@Test (priority = 2)
	public void TC_02() {
		String actual = reg.getHeading();
		assertEquals(actual, readExcel("heading"));
	}
	@Test (priority = 3)
	public void TC_03() {
		String actual = reg.getFirstnamePlaceholder();
		assertEquals(actual, "FirstName");
	}
	@Test (priority = 4)
	public void TC_04() {
		assertEquals(reg.firstnameLabel.isDisplayed(), true);
		assertEquals(reg.firstnameLabel.getText(), "First Name");
	}
	
	@Test (priority = 5)
	public void TC_05() {
		String actual = reg.getLastnamePlaceholder();
		assertEquals(actual, "LastName");
	}
	@Test (priority = 6)
	public void TC_06() {
		assertEquals(reg.lastnameLabel.isDisplayed(), true);
		assertEquals(reg.lastnameLabel.getText(), "Last Name");
	}
	@Test (priority = 7)
	public void TC_07() {
		String actual = reg.getUsernamePlaceholder();
		assertEquals(actual, "User Name");
	}
	@Test (priority = 8)
	public void TC_08() {
		assertEquals(reg.usernameLabel.isDisplayed(), true);
		assertEquals(reg.usernameLabel.getText(), "User Name");
	}
	@Test (priority = 9)
	public void TC_09() {
		assertEquals(reg.genderLabel.isDisplayed(), true);
		assertEquals(reg.genderLabel.getText(), "User Name");
	}
	@Test (priority =11)
	public void TC_11() {
		String actual = reg.getEmailPlaceholder();
		assertEquals(actual, "Email");
	}
	@Test (priority = 12)
	public void TC_12() {
		assertEquals(reg.emailLabel.isDisplayed(), true);
		assertEquals(reg.emailLabel.getText(), "Email");
	}
	
	@Test (priority =14)
	public void TC_14() {
		String actual = reg.getOrgPlaceholder();
		assertEquals(actual, "Organisation/Institute");
	}
	@Test (priority = 15)
	public void TC_15() {
		assertEquals(reg.orgLabel.isDisplayed(), true);
		assertEquals(reg.orgLabel.getText(), "Organisation");
	}
	@Test (priority = 16)
	public void TC_16() {
		assertNull(reg.getPhonePlaceholder());
	}
	@Test (priority = 17)
	public void TC_17() {
		assertEquals(reg.phoneLabel.isDisplayed(), true);
		assertEquals(reg.phoneLabel.getText(), "Phone");
	}
	@Test (priority = 18)
	public void TC_18() {
		waitAndClick(reg.login);
		
	}
	
	@Test (priority =19)
	public void TC_19() {
		String actual = reg.getPasswodPlaceholder();
		assertEquals(actual, "Choose Password");
	}
	@Test (priority = 20)
	public void TC_20() {
		assertEquals(reg.passwordLabel.isDisplayed(), true);
		assertEquals(reg.passwordLabel.getText(), "Password");
	}
	@Test (priority =21)
	public void TC_21() {
		String actual = reg.getConfirmPassPlaceholder();
		assertEquals(actual, "Confirm Password");
	}
	@Test (priority = 22)
	public void TC_22() {
		assertEquals(reg.confirmPasswodLabel.isDisplayed(), true);
		assertEquals(reg.confirmPasswodLabel, "Confirm Password");
	}
}
