package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategory {
	
	WebDriver driver;

	public AddCategory(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "categorydata")
	WebElement FILL_CATEGORY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")
	WebElement ADD_CATEGORY_BUTTON_ELEMENT;

	public void fillInCategory() {
		FILL_CATEGORY_ELEMENT.sendKeys("DechenTestCategory");
	}
	public void clickOnAddCategory() {
		ADD_CATEGORY_BUTTON_ELEMENT.click();
	}

}
