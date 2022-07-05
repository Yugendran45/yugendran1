package LoginProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class like_comment_share  extends Basicclass {
 

	/*@FindBy(id = "uc-signin-email-field")
	public static WebElement username;
	@FindBy(id = "password-input")
	public static WebElement password;
	@FindBy(id = "uc-signin-submit")
	public static WebElement login;*/
	
	@FindBy(xpath = "//a[@onclick='like(1096,3)']")
	public static WebElement like;
	@FindBy(xpath = "//a[@onclick='comments(1096,this)']")
	public static WebElement commend;
	@FindBy(id="comment_last 109")
   public static WebElement comandtext;
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[3]/div[1]/div/div[3]/div[2]/div/div[2]/a/span")
	public static WebElement share;
	@FindBy(xpath = "//a[@onclick='share(1096,0)']")
	public static WebElement shareclick;
	@FindBy(xpath="//a[@onclick='formsubmit2()']")
	public static WebElement sharepost;
	@Test 
	public void share() {
     PageFactory.initElements(driver, like_comment_share.class);
     like_comment_share.like.click();
     like_comment_share.commend.click();
     like_comment_share.comandtext.sendKeys("<>",Keys.ENTER);
     like_comment_share.share.click();
     like_comment_share.shareclick.click();
     like_comment_share.sharepost.click();
     }
}

