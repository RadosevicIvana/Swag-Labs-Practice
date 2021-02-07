package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckOutPage {

	WebDriver driver;
	WebElement firstNameField;
	WebElement lastNameField;
	WebElement zipCodeField;
	WebElement continueButton;
	WebElement finishButton;

	public CheckOutPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstNameField() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getLastNameField() {
		return driver.findElement(By.id("last-name"));
	}

	public WebElement getZipCodeField() {
		return driver.findElement(By.id("postal-code"));
	}

	public WebElement getContinueButton() {
		return driver.findElement(By.className("cart_button"));
	}

	public WebElement getFinishButton() {
		return driver.findElement(By.className("cart_button"));
	}

	public void inputFirstName() {
		this.getFirstNameField().clear();
		this.getFirstNameField().sendKeys("Ivana");
	}

	public void inputLastName() {
		this.getLastNameField().clear();
		this.getLastNameField().sendKeys("Radosevic");
	}

	public void inputZipCodeField() {
		this.getZipCodeField().clear();
		this.getZipCodeField().sendKeys("21000");
	}

	public void continueButtonClick() throws InterruptedException {
		this.getContinueButton().click();
		Thread.sleep(2000);
	}

	public void finishButtonClick() throws InterruptedException {
		this.getFinishButton().click();
		Thread.sleep(2000);
	}

	public void assertTheOrder() throws InterruptedException {
		Thread.sleep(2000);
		String text = driver.findElement(By.className("complete-header")).getText();
		Assert.assertEquals(text, "THANK YOU FOR YOUR ORDER");
		System.out.println("Assert is successful " + text);
	}

}
