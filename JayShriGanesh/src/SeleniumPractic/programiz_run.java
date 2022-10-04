package SeleniumPractic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class programiz_run {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\pc\\\\Desktop\\\\selenium\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.programiz.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class='highlight-course__col'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='icon-wrap']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	      
		
	
	}

}
