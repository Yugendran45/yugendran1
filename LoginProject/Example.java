package LoginProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Example {
	WebDriver driver;
		@Test
	public void LOGIN() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ulektz\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://65.1.198.213/ulektzConnectVs2/start/signin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("uc-signin-email-field")).sendKeys("ulektztest28@yahoo.com");
		driver.findElement(By.id("password-input")).sendKeys("12345");
		driver.findElement(By.id("uc-signin-submit")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,10000)");
	}
	    @Test(enabled=false)
	public void like() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0,10000)");
		driver.findElement(By.xpath("//a[@onclick='like(405)']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[@onclick='comments(405,this)']")).click();
		Thread.sleep(15000);
		driver.findElement(By.id("comment_last 405")).sendKeys("test", Keys.ENTER);
		Thread.sleep(25000);
		driver.findElement(By
				.xpath("/html/body/div[4]/div/div[1]/div/div[2]/div/div[3]/div[1]/div/div[4]/div[2]/div/div[2]/a"))
				.click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[@onclick='share(405,0)']")).click();
	}
}
