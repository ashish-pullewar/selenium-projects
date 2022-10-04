package com.testing.pullewar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class practic {

	

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("");
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		

	}

}
