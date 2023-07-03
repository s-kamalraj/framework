package framework;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup extends Base {
	WebDriver driver=null;
	Signup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[.='Welcome!']")
	WebElement heading;
	@FindBy(css = "img.logo")
	WebElement logo;
	@FindBy(id = "first_name")
	WebElement firstname;
	@FindBy(xpath = "//label[.='First Name']")
	WebElement firstnameLabel;
	@FindBy(xpath = "(//div[.=' Please enter a valid name '])[1]")
	WebElement firstnameError;

	@FindBy(xpath = "//div[.='Ok, Continue']/..")
	WebElement cookiesConfirm;

	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastname;
	@FindBy(xpath = "//label[.='Last Name']")
	WebElement lastnameLabel;
	@FindBy(xpath = "//input[@id='last_name']/../div")
	WebElement lastnameError;

	@FindBy(css = "input#your_username")
	WebElement username;
	@FindBy(xpath = "//label[.='User Name']")
	WebElement usernameLabel;
	@FindBy(xpath = "//input[@id='your_username']/../div[contains(.,'The username must have')]")
	WebElement usernameError;
	
	@FindBy(id = "email_address")
	WebElement email;
	@FindBy(xpath = "//label[.='Email']")
	WebElement emailLabel;
	@FindBy(xpath = "//input[@id='email_address']/../div")
	WebElement emailError;

	@FindBy(id = "organisation-organisation_select_input")
	WebElement org;
	@FindBy(xpath = "//label[.='Organisation']")
	WebElement orgLabel;
	@FindBy(xpath = "//input[@id='organisation-organisation_select_input']/../ul/li")
	List<WebElement> orgList;
		
	@FindBy(css = "#mat-select-0")
	WebElement gender;
	@FindBy(xpath = "//mat-select[@id='mat-select-0']/div/div/div")
	WebElement genderSymbol;
	@FindBy(xpath = "//div[.=' Please select a gender ']")
	WebElement genderError;
	@FindBy(xpath = "//span[@class='mat-option-text']")
	List<WebElement> genderOpt;
	@FindBy(xpath = "//div[@id='mat-select-value-1']/span/span")
	WebElement genderSelected;
	
	@FindBy(id = "mat-input-0")
	WebElement phone;
	@FindBy(xpath = "//label[.='Phone']")
	WebElement phoneLabel;
	@FindBy(xpath = "//span[.='+91']/span[2]")
	WebElement phoneDefaultCode;
	@FindBy(xpath = "//div[.=' Please enter a valid mobile number ']")
	WebElement phoneError;
	
	@FindBy(xpath = "//input[@id='choose_password']")
	WebElement password;
	@FindBy(xpath = "//input[@name='password_confirmation']")
	WebElement confirmPasswod;
	
	@FindBy(xpath = "//input[@id='agreed']/../label")
	WebElement checkBox;
	

	@FindBy(linkText = "Privacy Policy")
	WebElement privacyLink;

	@FindBy(linkText = "Terms of Use")
	WebElement termsLink;

	@FindBy(xpath = "//button[@class='btn login-button full-width']")
	WebElement register;
	
	@FindBy(xpath = "//h2[.=' Verify your account ']")
	WebElement afteRegister;

	public void enterFirstname(String input) {
		enter(firstname, input);
	}

	public void enterLastname(String input) {
		enter(lastname, input);
	}
	public void enterUsername(String input) {
		enter(username, input);
	}
	public void selectAllGenderOpt() {
		waitAndClick(gender);
		List<WebElement> opt = genderOpt;
		int count = opt.size();
		if(!opt.isEmpty()) {
			for (int i=0;i<count;i++) {
				waitAndClick(opt.get(i));
				if(i<count-1)
				waitAndClick(gender);
			}
		}
	}
	public void enterEmail(String input) {
		enter(email, input);
	}
	public void enterOrg(String input) {
		enter(org, input);
	}
	public void selectOrgResult() {
		List<WebElement> result = orgList;
		for(int i=0; i<result.size(); i++) {
			String text = result.get(i).getText();
			if(text.equals("Saveetha Engineering College (SEC), Chennai")) {
				waitAndClick(result.get(i));
			}
		}
	}
	public void enterPhoneNumber(String input) {
		enter(phone, input);
	}
	public String getPrivacyTitle() {
		changeWindow(1,driver);
		return driver.getTitle();
	}

	public String getTermsTitle() {
		changeWindow(1,driver);
		return driver.getTitle();
	}
	public void enterPassword(String input) {
		enter(password, input);
	}
	public void enterConfirmPassword(String input) {
		enter(confirmPasswod,input);
	}
	

}
