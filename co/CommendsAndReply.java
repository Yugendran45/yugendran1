package org.co;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//REPORT SUBMIT OPTION ARE USING :
//===============================


public class CommendsAndReply {
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ulektz\\Downloads\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver =new ChromeDriver();
   driver.get("http://65.1.198.213/ulektzConnectVs2/dashboard");
   driver.manage().window().maximize();
   driver.findElement(By.id("username")).sendKeys("ulektztest28@yahoo.com");
   driver.findElement(By.id("password")).sendKeys("12345");
   driver.findElement(By.id("u_login")).click();
//   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//   driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[3]/div[1]/div/div[1]/div[2]/button/img")).click();
//   Thread.sleep(10000);
//   driver.findElement(By.xpath("//a[@onclick='report_post(364,`feed`)']")).click();
//   Thread.sleep(10000);
//   driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[11]/div[2]/div[2]/div/div/div[1]/div/form/div/p[5]/label/span")).click();
//   driver.findElement(By.id("complain")).sendKeys("testing");
//   driver.findElement(By.xpath("//a[@onclick='reportsubmit()']")).click();
	
	//comment options like and comment REPLY OPTION are checking
   //=====================================================
//   Thread.sleep(10000);
//   JavascriptExecutor js = (JavascriptExecutor) driver;
//   js.executeScript("window.scrollBy(0,15000)");
//   Thread.sleep(15000);
//   driver.findElement(By.xpath("//a[@onclick='comments(356,this)']")).click();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 2));
//  WebElement comment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@onclick='commentlike(118,356)']")));
//	comment.click();
//  // driver.findElement(By.xpath("//a[@onclick='commentlike(118,356)']")).click();
//   Thread.sleep(10000);
//   driver.findElement(By.xpath("//a[@onclick='replies(118,356)']")).click();
//   Thread.sleep(12000);
//   driver.findElement(By.id("118 356 reply_last")).sendKeys("gm",Keys.ENTER);
   Thread.sleep(10000);
   driver.findElement(By.xpath("//a[@onclick='comments(415,this)']")).click();
   Thread.sleep(10000);
   driver.findElement(By.id("comment_last 415")).sendKeys("!@#$%^&*()_+|{}[]':?><",Keys.ENTER);
   Thread.sleep(10000);
   driver.findElement(By.xpath("//a[@onclick='nomedia()']")).getText();
   
	}

}
