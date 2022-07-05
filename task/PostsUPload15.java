package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import LoginProject.Basicclass;

public class PostsUPload15 extends Basicclass {
	@Test(dataProvider = "post")
	public void postupload(String post) throws InterruptedException {
		driver.findElement(By.xpath("//a[@onclick='addmedia()']")).click();
		WebElement post2 = driver.findElement(By.id("ogtest"));
		post2.sendKeys(post);
		driver.findElement(By.xpath("//a[@onclick='formsubmit()']")).click();
	}

	@DataProvider(name = "post")
	public String[] dataprovider() {
		return new String[] { "test16", "test17", "test18", "test19", "test20", "test21", "test22", "test23", "test24",
				"test25", "test26", "test27", "test28", "test29", "test30" };
	}
}