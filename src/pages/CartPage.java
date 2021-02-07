package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	WebDriver driver;
	WebElement checkOutButton;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckOutButton() {
		return driver.findElement(By.className("checkout_button"));
	}

	public void checkOutButtonClick() throws InterruptedException {
		this.getCheckOutButton().click();
		Thread.sleep(2000);
	}
}
