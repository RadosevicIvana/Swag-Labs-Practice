package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

	WebDriver driver;
	WebElement addToCart;
	WebElement goToCart;

	public InventoryPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddToCart() {
		return driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
	}

	public WebElement getGoToCart() {
		return driver.findElement(By.id("shopping_cart_container"));
	}

	public void addProductToCart() throws InterruptedException {
		this.getAddToCart().click();
		Thread.sleep(2000);
	}

	public void goToCartClick() throws InterruptedException {
		this.getGoToCart().click();
		Thread.sleep(2000);
	}

}
