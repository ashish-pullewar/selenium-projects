package SeleniumPractic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTabSwitch {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\pc\\\\Documents\\\\seleniumJars\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
		
		driver.findElement(By.xpath("(//a[@class='_1fQZEK'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='_1fQZEK'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='_1fQZEK'])[3]")).click();

		Set<String> allWindows = driver.getWindowHandles();

		for (String windowId : allWindows) {
			
			driver.switchTo().window(windowId);
		}

		driver.switchTo().window(parentWindow);

	}

}
