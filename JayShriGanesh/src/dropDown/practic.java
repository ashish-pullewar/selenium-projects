package dropDown;

import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class practic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\pc\\\\Desktop\\\\selenium\\\\New folder\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
	
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("lagan lagi");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		
		
		
		
	}

}
