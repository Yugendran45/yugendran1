package task;

import java.util.Scanner;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import LoginProject.Basicclass;

public class Forgotpassword extends Basicclass {
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	public static WebElement forget;
	@FindBy(id="forgotPass")
	public static WebElement email;
	@FindBy(id="for_next")
	public static WebElement request;
	@FindBy(xpath="//div[@class='verify-code-field']0")
	public static WebElement otp;
	@FindBy(xpath="//a[text()='Verify Code']")
	public static WebElement verify;
	@FindBy(id="new_pass")
	public static WebElement newpword; 
	@FindBy(id="con_Password")
	public static WebElement confirm;
	@FindBy(xpath="//a[text()='Update Password']")
	public static WebElement updateword;
	@FindBy(xpath="//a[text()='Here']")
	public static WebElement login;
	@FindBy(id="uc-signin-email-field")
	public static WebElement emailid;
	@FindBy(id="password-input")
	public static WebElement  password;
	@FindBy(id="uc-signin-submit")
	public static WebElement  submit;
	
	@Test
	public void forgrt() throws InterruptedException {
		PageFactory.initElements(driver, Forgotpassword.class);
		Forgotpassword.forget.click();
		Forgotpassword.email.sendKeys("18uca1329.yugendran.k@gmail.com");
		Forgotpassword.request.click();
		Scanner s = new Scanner(System.in);
		String name = s.next();
		Forgotpassword.otp.sendKeys(name);
		Thread.sleep(2000);
		//Forgotpassword.verify.click();
		Forgotpassword.newpword.sendKeys("12345");
		Forgotpassword.confirm.sendKeys("12345");
		Forgotpassword.updateword.click();
		Forgotpassword.login.click();
		Forgotpassword.emailid.sendKeys("18uca1329.yugendran.k@gmail.com");
		Forgotpassword.password.sendKeys("12345");
		Forgotpassword.submit.click();
   
	}
}
