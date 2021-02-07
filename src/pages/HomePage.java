package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;
	WebElement userNameField;
	WebElement passwordField;
	WebElement loginButton;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUserNameField() {
		return driver.findElement(By.id("user-name"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getLoginButton() {
		return driver.findElement(By.id("login-button"));
	}

	public void inputUsername() {
		this.getUserNameField().clear();
		this.getUserNameField().sendKeys("problem_user");
	}

	public void inputPassword() throws InterruptedException {
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys("secret_sauce");
		Thread.sleep(2000);
	}

	public void loginButtonClick() {
		this.getLoginButton().click();
	}

	public void assertLogin() throws InterruptedException {
		Thread.sleep(2000);
		String text = driver.findElement(By.className("product_label")).getText();
		Assert.assertEquals(text, "Products");
		System.out.println("Assert is successful " + text);
	}
}
