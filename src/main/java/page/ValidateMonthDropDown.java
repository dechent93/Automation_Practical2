package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ValidateMonthDropDown extends BasePage {
	
	
	WebDriver driver;

	public ValidateMonthDropDown(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "due_month")
	WebElement DUE_MONTH_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")
	WebElement SELECT_ALL_MONTHS;
	
	public void selectMonthCategory() {
		DUE_MONTH_ELEMENT.click();	
		
	}
	public void selectAndVerifyAllMonths() {

		Select DUE_MONTH_FIELD = new Select(driver.findElement(By.name("due_month")));
		
		List <WebElement> months =DUE_MONTH_FIELD .getOptions();
	      int size = months.size();
	      for(int i =0; i<size ; i++){
	         String allMonths = months.get(i).getText();
	         System.out.println("Months:"+ allMonths);
	    }	

	}
}



