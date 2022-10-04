package SeleniumPractic;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ashish {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.findElement(By.id("email")).sendKeys("ashish@gmail");
		driver.findElement(By.name("pass")).sendKeys("32113");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		driver.findElement(By.name("q")).sendKeys("lenovo laptops"+ Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();

		for (String windowId : allWindows) {
			
			driver.switchTo().window(windowId);
		}
		

	}

}
