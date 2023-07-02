package framework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver = null;
	Signup reg = null;
	static WebDriverWait wait = null;
	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		reg = new Signup(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(readExcel("URL"));
		reg.cookiesConfirm.click();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	
	public String readExcel(String value) {

		File f = new File("./data/TestScenario.xlsx");
		Sheet sheet = null;
		try {
			Workbook work = WorkbookFactory.create(f);
			sheet = work.getSheet("Data");
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DataFormatter d = new DataFormatter();
 		int row_count = sheet.getLastRowNum();
		for (int i = 0; i < row_count; i++) {
			Row row = sheet.getRow(i);
			String key = d.formatCellValue(row.getCell(0));
			if (key.equalsIgnoreCase(value)) {
				return d.formatCellValue(row.getCell(1));
			}
		}
		return null;
	}

	public void waitAndClick(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void enter(WebElement element, String value) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(readExcel(value));
	}
//
//	public String getPlaceholder(WebElement ele) {
//		return ele.getAttribute("placeholder");
//	}
//
//	public String getValue(WebElement element) {
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		return element.getAttribute("value");
//	}

	public String getTextValidate(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}

	public String title(WebDriver driver) {
		return driver.getTitle();
	}
	public void changeWindow(int index) {
		ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(win.get(index));
	}


}
