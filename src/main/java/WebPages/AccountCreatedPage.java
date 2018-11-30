package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage {

	@FindBy(xpath =  "//*[@id=\\\"root\\\"]/div/center/div/button")
	private WebElement prizeDraw;

	public void enterPrizeDraw() {

		prizeDraw.click();

	}
}
