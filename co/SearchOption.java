package org.co;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ulektz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://65.1.198.213/ulektzConnectVs2/dashboard");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ulektztest28@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("u_login")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("searchbar")).sendKeys("anusuya narayanan",Keys.ENTER);
		driver.findElement(By.id("booksli")).click();
				
		
	}

}
