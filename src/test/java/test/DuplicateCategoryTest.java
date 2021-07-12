package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.AddCategory;
import page.DuplicateCategory;
import util.BrowserFactory;

public class DuplicateCategoryTest {
	
	 WebDriver driver;

		@BeforeClass
		public void browserTest() {
			
			driver= BrowserFactory.init();
		}

		@Test
		public void addDuplicateCategoryTest() {
			
			DuplicateCategory duplicateCategoryPage = PageFactory.initElements(driver, DuplicateCategory.class);
			
			duplicateCategoryPage.fillInCategory();
			duplicateCategoryPage.clickOnAddCategory();
			duplicateCategoryPage.validateDuplicateCategoryPage();
			
			
			
//			BrowserFactory.tearDown();
		}

}
