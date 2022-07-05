package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import LoginProject.Basicclass; 

public class Photoesupload extends Basicclass {
	@Test(dataProvider = "photo")
	public void upload(String photo) throws InterruptedException {
		
		WebElement cli = driver.findElement(By.xpath("//a[@onclick='nomedia()']"));
		cli.click();
		Thread.sleep(2000);
		WebElement media = driver.findElement(By.id("t2"));
		media.click();
		WebElement photobtn = driver.findElement(By.id("uc-addPhoto"));
		photobtn.sendKeys(photo);
		Thread.sleep(7000);
		WebElement postbtn2 = driver.findElement(By.xpath("//a[@onclick='formsubmit()']"));
		postbtn2.click();
		Thread.sleep(20000);
	}

	@DataProvider(name = "photo")
	public String[] dataprovider() {
		return new String[] { "E:\\Aaaa\\src\\test\\java\\com\\co\\fc057c36e3a7f67c.mp4","E:\\Aaaa\\src\\test\\java\\com\\co\\6d6628f2009ef22f.mp4",
				              "E:\\Aaaa\\src\\test\\java\\com\\co\\72c2034efea098da.mp4","E:\\Aaaa\\src\\test\\java\\com\\co\\fc057c36e3a7f67c.mp4"};

	}
}