package POMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage {

	// This is the login page
	// Added another comment here
	// Third comment here
	// Fourth Change added form eclipse
	// last commit
	
	@FindBy(id="username")
	private WebElement UnTb;
	
	@FindBy(name="pwd")
	private WebElement PwTb;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[text()='Username or Password is invalid. Please try again.']")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String un) {
		UnTb.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		PwTb.sendKeys(pw);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void verifyErrmsg() {
		Assert.assertTrue(errMsg.isDisplayed());
	}
}
