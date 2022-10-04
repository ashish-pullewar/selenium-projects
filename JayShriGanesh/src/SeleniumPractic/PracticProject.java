package SeleniumPractic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Desktop\\selenium\\seleniumJars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.programiz.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='card platform d-flex'])[3]")).click();
	}

}
