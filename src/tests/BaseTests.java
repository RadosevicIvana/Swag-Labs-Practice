package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.CartPage;
import pages.CheckOutPage;
import pages.HomePage;
import pages.InventoryPage;

public class BaseTests {

	WebDriver driver;
	HomePage homePage;
	InventoryPage inventoryPage;
	CheckOutPage checkOutPage;
	CartPage cartPage;

	@BeforeClass
	public void preKlase() throws IOException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.homePage = new HomePage(driver);
		this.inventoryPage = new InventoryPage(driver);
		this.checkOutPage = new CheckOutPage(driver);
		this.cartPage = new CartPage(driver);

		driver.manage().window().maximize();
	}

	@AfterClass
	public void posleKlase() throws IOException {
		driver.close();
		driver.quit();
	}
}
