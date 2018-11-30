package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	
	@FindBy(xpath = "//*[@id=\"root\"]/div/center/div/button")
	private WebElement register;

	public void selectRegister() {

		register.click();

	}
	
}
