package org.co;

import java.util.concurrent.Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PostAndUrl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ulektz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://65.1.198.213/ulektzConnectVs2/dashboard");
		driver.manage().window().maximize();
		WebElement btn1 = driver.findElement(By.id("uc-signin-email-field"));
		btn1.sendKeys("yugendrankumar001@gmail.com");
		WebElement btn2 = driver.findElement(By.id("password-input"));
		btn2.sendKeys("Yugendrankumar@45");
		WebElement login = driver.findElement(By.id("uc-signin-submit"));
		login.click();
		Thread.sleep(10000);

		WebElement cli = driver.findElement(By.xpath("//a[@class='cmn-btn uc-success-btn ripple-button']"));
		cli.click();
		WebElement post1 = driver.findElement(By.id("ogtest"));
		Thread.sleep(12000);
		post1.sendKeys("https://youtu.be/1PtEYqjj-xM");
		WebElement post2 = driver.findElement(
				By.xpath("/html/body/div[4]/div/div[2]/div[2]/div/div[5]/div[2]/div[2]/div/div/form/div[3]/div/a[2]"));
		post2.click();

	}
}
