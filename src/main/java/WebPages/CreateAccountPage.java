package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {
	
	
	@FindBy(id = "firstName")
	private WebElement firstName;

	public void enterFirstName(String text) {

		firstName.sendKeys(text);

	}

	@FindBy(id = "lastName")
	private WebElement secondName;

	public void enterSecondName(String text) {

		secondName.sendKeys(text);

	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/center/div/button")
	private WebElement submit;

	public void submitButton() {

		submit.click();

	}

}
