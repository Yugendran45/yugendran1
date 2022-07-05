package org.co;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MorePhotoUploadandPublicPrivateConnection {
	
	//MORE PHOTO AND VIEDO UPLOAD
	
	
	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ulektz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://65.1.198.213/ulektzConnectVs2/dashboard");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ulektztest28@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("u_login")).click();
		Thread.sleep(10000);		
//		driver.findElement(By.xpath("//a[@onclick='addmedia()']")).click();
//		Thread.sleep(10000);		
//		driver.findElement(By.id("uc-addPhoto")).sendKeys("E:\\Aaaa\\src\\test\\java\\com\\co\\4e8025b6eac0de65.mp4");
//		Thread.sleep(10000);		
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div/div[5]/div[2]/div[2]/div/div/form/div[2]/div[1]/div/div[2]/div/label/input")).sendKeys("E:\\Aaaa\\src\\test\\java\\com\\co\\Penguins.jpg");
//		Thread.sleep(10000);		
//		driver.findElement(By.id("uc-addPhoto")).sendKeys("E:\\Aaaa\\src\\test\\java\\com\\co\\Koala.jpg");
//		Thread.sleep(20000);		
//		driver.findElement(By.xpath("//a[@onclick='formsubmit()']")).click();
//		
	
		//PUBLIC PRIVATE CONNECTION
		driver.findElement(By.xpath("//a[@onclick='addmedia()']")).click();
		Thread.sleep(10000);	
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div/div[5]/div[2]/div[2]/div/div/div/div[2]/div/a/span")).click();
		Thread.sleep(10000);	
		//driver.findElement(By.id("Public")).click();
		Thread.sleep(10000);	
		driver.findElement(By.xpath("//span[text()=' Connections Only']")).click();
		Thread.sleep(10000);	
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div/div[8]/div[2]/div[2]/div/div/div[1]/div/div/p[3]/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div/div[9]/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/p[1]/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()=' Announcement ']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@onclick='communityclose()']")).click();
		driver.findElement(By.xpath("//a[@class='cmn-btn uc-ignore uc-modal-closed ripple-button']")).click();
		driver.findElement(By.xpath("//a[@onclick='modal1()']")).click();
		
		
		
		
		
	}
}

