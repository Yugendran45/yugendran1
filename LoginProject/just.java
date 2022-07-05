package LoginProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class just extends  like_comment_share  {
	
	WebDriver driver;

	 @Test
		public void login() throws InterruptedException {
			PageFactory.initElements(driver, like_comment_share.class);
			Thread.sleep(5000);
			//like_comment_share.username.sendKeys("ulektztest28@yahoo.com");
			//like_comment_share.password.sendKeys("12345");
			//like_comment_share.login.click();
			Thread.sleep(5000);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//		    js.executeScript("window.scrollBy(0,500)");
			like_comment_share.like.click();
			Thread.sleep(5000);
			like_comment_share.commend.click();
			Thread.sleep(10000);
			like_comment_share.commend.click();
			Thread.sleep(10000);
			like_comment_share.comandtext.sendKeys("test",Keys.ENTER);
			Thread.sleep(5000);
			like_comment_share.share.click();
			Thread.sleep(5000);
			like_comment_share.shareclick.click();
			Thread.sleep(5000);
			like_comment_share.sharepost.click();
			
		

	 }
		
}
