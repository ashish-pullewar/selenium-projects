package SeleniumPractic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Documents\\seleniumJars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.findElement(By.id("email")).sendKeys("ashish@gmail");
		driver.findElement(By.name("pass")).sendKeys("32113");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		
	}

}
