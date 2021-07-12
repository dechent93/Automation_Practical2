package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DuplicateCategory extends BasePage {

	WebDriver driver;

	public DuplicateCategory(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "categorydata")
	WebElement FILL_CATEGORY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")
	WebElement ADD_CATEGORY_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/span[1]")
	WebElement CATEGORY_ALREADY_EXIST_ELEMENT;

	public void fillInCategory() {
		FILL_CATEGORY_ELEMENT.sendKeys("DechenTestCategory");
	}

	public void clickOnAddCategory() {
		ADD_CATEGORY_BUTTON_ELEMENT.click();
	}
	public void validateDuplicateCategoryPage() {
		
		waitForElement(driver, 3, CATEGORY_ALREADY_EXIST_ELEMENT);
		Assert.assertEquals(CATEGORY_ALREADY_EXIST_ELEMENT.getText(), "DechenTestCategory", "page not found");
	}
}
