package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.AddCategory;
import util.BrowserFactory;

public class AddCategoryTest {
	
	 WebDriver driver;

		@BeforeClass
		public void browserTest() {
			
			driver= BrowserFactory.init();
		}

		@Test
		public void addCategoryTest() {
			
			AddCategory addCategorylPage = PageFactory.initElements(driver, AddCategory.class);
			addCategorylPage.fillInCategory();
			addCategorylPage.clickOnAddCategory();

			
//			BrowserFactory.tearDown();
		}

}
