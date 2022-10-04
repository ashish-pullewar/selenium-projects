import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLpractic {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\pc\\\\Documents\\\\seleniumJars\\\\chromedriver.exe");
		
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		
		
		//Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement Email = Driver.findElement(By.cssSelector("input#email"));
		Email.sendKeys("7743888980");
		
		WebElement pass = Driver.findElement(By.id("pass"));
		pass.sendKeys("123456789");
		
		WebElement login = Driver.findElement(By.name("login"));
		login.click();
		
		
		

	}

}
