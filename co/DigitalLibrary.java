package org.co;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DigitalLibrary {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Day1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://65.1.198.213/ulektzConnectVs2/dashboard");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ulektztest28@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("u_login")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("logo_change")).click();
		Thread.sleep(10000);
		driver.findElement(By
				.xpath("//img[@src='https://s3.ap-south-1.amazonaws.com/ulektzmumbai/ProfileImage/7358465457.png'][1]"))
				.click();
		Thread.sleep(20000);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 2));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src^='http://65.1.198.213/ulektzConnectVs2//assets/img/community/Digital-Library.svg']")));
		// comment.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div[2]/ul/li[1]/h4")).click();
		// driver.findElement(By.xpath("//li[@data-tab='2']")).click();
		Thread.sleep(10000);
		// driver.findElement(By.cssSelector("li[class^='uc-tab-link
		// uc-active']")).click();
		driver.findElement(
				By.xpath("/html/body/div[4]/div/div[3]/div/div[1]/div/div[1]/ul/li[1]/div[5]/div/button/img")).click();
		driver.findElement(By.cssSelector("a[onclick^='editUplodBook(12546)']")).click();
		WebElement ddn1 = driver.findElement(By.id("cat_id"));
		Select select = new Select(ddn1);
		select.selectByIndex(21);
		Thread.sleep(20000);

		WebElement ddn2 = driver.findElement(By.cssSelector("file_type"));
		Select select2 = new Select(ddn2);
		select2.selectByIndex(6);
		driver.findElement(By.name("uploaded_file")).sendKeys("E:\\Aaaa\\src\\test\\java\\com\\co\\Koala.jpg");
		
		
		

	}

}
