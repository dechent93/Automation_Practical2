package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.DuplicateCategory;
import page.ValidateMonthDropDown;
import util.BrowserFactory;

public class ValidateMonthDropDownTest {
	 WebDriver driver;

		@BeforeClass
		public void browserTest() {
			
			driver= BrowserFactory.init();
		}

		@Test
		public void verifyMonthTest() {
			
			ValidateMonthDropDown validateMonthDropDownPage = PageFactory.initElements(driver, ValidateMonthDropDown.class);
			
			validateMonthDropDownPage.selectMonthCategory();
			validateMonthDropDownPage.selectAndVerifyAllMonths();
			
			
			
			BrowserFactory.tearDown();
		}


}
