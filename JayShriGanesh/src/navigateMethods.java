import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\pc\\\\Documents\\\\seleniumJars\\\\chromedriver.exe");
        WebDriver Driver=new ChromeDriver();
        
        Driver.get("https://www.google.com/");
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		
		Driver.navigate().back();
		Thread.sleep(3000);
		
		Driver.navigate().forward();
		Thread.sleep(3000);
		
		Driver.quit();
		
		
		
}
}