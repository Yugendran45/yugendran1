package LoginProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Basicclass {
	protected static WebDriver driver;
	@Test
	public void LOGIN() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Day1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ulektz.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='btn-c btn-clr1']")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("uc-signin-email-field")).sendKeys("18uca1329.yugendran.k@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("12345");
		driver.findElement(By.id("uc-signin-submit")).click();
		
	}
}
     