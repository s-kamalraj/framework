package framework;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupObject {
	
	 SignupObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//h2[.='Welcome!']")
	WebElement heading;
	
	@FindBy (id = "first_name")
	 WebElement firstname;
	
	@FindBy(xpath = "//div[.='Ok, Continue']/..")
	 WebElement cookiesConfirm;
	
	@FindBy(xpath = "//input[@id='last_name']")
	 WebElement lastname;
	
	@FindBy(css = "input#your_username")
	 WebElement username;
	
	@FindBy(id = "email_address")
	 WebElement email;
	
	@FindBy(id = "organisation-organisation_select_input")
	 WebElement organisation;
	
	@FindBy(css = "#mat-select-0")
	 WebElement gender;
	
	@FindBy(xpath = "//span[@class='mat-option-text']")
	 List<WebElement> genderOpt;
	
	@FindBy(id = "mat-input-0")
	 WebElement phone;
	
	@FindBy(xpath = "//span[.='+91']/span[2]")
	 WebElement phoneDefault;
	
	@FindBy(xpath = "//input[@id='agreed']")
	 WebElement checkBox;
	
	@FindBy(linkText = "Privacy Policy")
	 WebElement privacyLink;
	
	@FindBy(linkText = "Terms of Use")
	 WebElement termsLink;
	
	@FindBy(xpath = "//button[@class='btn login-button full-width']")
	 WebElement register;
}
