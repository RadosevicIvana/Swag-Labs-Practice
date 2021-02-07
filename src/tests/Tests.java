package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTests {

	@BeforeMethod
	public void setup() throws InterruptedException {

		driver.navigate().to("https://www.saucedemo.com/index.html");
		driver.navigate().refresh();

	}

	@Test(priority = 0)
	public void login() throws InterruptedException {

		homePage.inputUsername();
		homePage.inputPassword();
		homePage.loginButtonClick();
		homePage.assertLogin();

	}

	@Test(priority = 2)
	public void order() throws InterruptedException {
		login();
		inventoryPage.addProductToCart();
		inventoryPage.goToCartClick();
		cartPage.checkOutButtonClick();
		checkOutPage.inputFirstName();
		checkOutPage.inputLastName();
		checkOutPage.inputZipCodeField();
		checkOutPage.continueButtonClick();
		checkOutPage.finishButtonClick();
		checkOutPage.assertTheOrder();

	}

	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
