import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\pc\\\\Documents\\\\seleniumJars\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ashish");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("pullewar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9834143913");
		WebElement dayElement = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select day = new Select(dayElement);
		day.selectByValue("21");

		WebElement monthelement = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select month = new Select(monthelement);
		month.selectByVisibleText("Jun");
		
		WebElement yearElement = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select year = new Select(yearElement);
		year.selectByValue("1998");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();

	}

}
