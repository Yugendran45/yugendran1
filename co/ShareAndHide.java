package org.co;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//THE POST OPTION -LOGIN POST SHARE BY  HIDE THE OPTION ARE USING :  ***
//============================================================================

public class ShareAndHide {
   
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ulektz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://65.1.198.213/ulektzConnectVs2/dashboard");
		driver.manage().window().maximize();
		WebElement btn1 = driver.findElement(By.id("username"));
		btn1.sendKeys("ulektztest28@yahoo.com");
		WebElement btn2 = driver.findElement(By.id("password"));
		btn2.sendKeys("12345");
		WebElement login = driver.findElement(By.id("u_login"));
		login.click();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement btnlike = driver.findElement(By.xpath("//a[@onclick='like(438)']"));
		btnlike.click();
		Thread.sleep(10000);
		WebElement comment = driver.findElement(By.xpath("//a[@onclick='comments(438,this)']"));
		comment.click();
		Thread.sleep(10000);
    	WebElement btncomment = driver.findElement(By.id("comment_last 438"));
    	btncomment.sendKeys("<!@!>",Keys.ENTER);
	
    	Thread.sleep(10000);
		WebElement sharebtn = driver.findElement(By.xpath("//*[@id=\"feedhide_438\"]/div/div[3]/div[2]/div/div[2]/a/img"));
		Thread.sleep(10000);
		sharebtn.click();
		WebElement share2 = driver.findElement(By.xpath("//a[@onclick='share(438,0)']"));
		share2.click();
		WebElement share3 = driver.findElement(By.xpath("//a[@onclick='formsubmit2()']"));
		share3.click();

		WebElement dont = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[3]/div[3]/div/div[1]/div[2]/button/img"));
		dont.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
		WebElement hide = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[3]/div[3]/div/div[1]/div[2]/div/ul/li[1]/a")));
		hide.click();
		WebElement yesbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submithide")));
		yesbtn.click();
		
    }
}