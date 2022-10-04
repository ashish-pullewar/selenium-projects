package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,LoginPage.class );
	}
	
	@FindBy(name = "username")
	private WebElement txtUsername;
	
	@FindBy(name = "password")
	private WebElement txtPassword;
	
	@FindBy(className = "orangehrm-login-button")
	private WebElement btnLogin;
	
	public void doLogin(String username, String password) {
		this.txtUsername.sendKeys(username);
		this.txtPassword.sendKeys(password);
		this.btnLogin.click();
		
	}

}
