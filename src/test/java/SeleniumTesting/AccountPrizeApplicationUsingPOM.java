package SeleniumTesting;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import WebPages.AccountCreatedPage;
import WebPages.CreateAccountPage;
import WebPages.HomePage;
import WebPages.WonPage;

public class AccountPrizeApplicationUsingPOM {

	private String url = "http://35.234.128.118/";
	private WebDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Ahmed Applications\\Chrome Driver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void testBrowseFlightsPage() {

		driver.manage().window().maximize();
		driver.get(url);

		// This test will ensure we are generated an account number
		

		HomePage homePage = PageFactory.initElements(driver, HomePage.class);

		homePage.selectRegister();

		CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
		
		createAccountPage.enterFirstName("Ahmed");
		
		createAccountPage.enterSecondName("Osman");
		
		createAccountPage.submitButton();
		
		AccountCreatedPage accountCreatedPage = PageFactory.initElements(driver, AccountCreatedPage.class);
		
		accountCreatedPage.enterPrizeDraw();
		
		
		WonPage wonPage = PageFactory.initElements(driver, WonPage.class);
		
		
		assertEquals("Congratulations you have won:", wonPage.getWonText());

	}
}