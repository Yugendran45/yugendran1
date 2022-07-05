package org.co;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// ONE POSTED AND DELETE ON THE POST:  ***
//===========================================

public class PostedAndDeletedOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ulektz\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://65.1.198.213/ulektzConnectVs2/dashboard");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ulektztest28@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("12345");	
		driver.findElement(By.id("u_login")).click();
        Thread.sleep(10000);
        
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[1]/div/div[2]/div[1]/a")).click();
		driver.findElement(By.id("uc-addPhoto")).sendKeys("E:\\Aaaa\\src\\test\\java\\com\\co\\Penguins.jpg");
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/div/form/div[3]/div/a[2]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[3]/div[1]/div/div[1]/div[2]/button/img")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text()=' Delete Post '][1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("submitdelete")).click();
		
		
		
	}

}
