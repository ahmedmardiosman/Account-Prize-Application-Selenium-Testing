package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WonPage {
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/center/div/div/div/h1[1]")
	private WebElement wonText;

	public String getWonText() {

		return wonText.getText();

	}

}
