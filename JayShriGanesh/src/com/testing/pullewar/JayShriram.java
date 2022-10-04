package com.testing.pullewar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JayShriram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Documents\\seleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		/*
		 * driver.manage().window().maximize(); driver.manage().window().setSize(new
		 * Dimension(600, 800)); driver.manage().window().setPosition(new Point(500,  100));
		 *  driver.manage().window().fullscreen();
		 */
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iPhone",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> phones=  driver.findElements(By.className("_2kHMtA"));
		System.out.println(phones.size());
		
		for(WebElement phone : phones) {
			
			System.out.println(phone.findElement(By.className("_4rR01T")).getText());
			System.out.println(phone.findElement(By.className("_3LWZlK")).getText());
			System.out.println(phone.findElement(By.className("_30jeq3")).getText());
			driver.quit();
		}
		
		
		
		
	}

}
