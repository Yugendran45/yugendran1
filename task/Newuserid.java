package task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import LoginProject.Basicclass;

public class Newuserid extends Basicclass {

	@FindBy(id = "uc-join-link")
	public static WebElement join;
	@FindBy(id = "uc-signin-email-field")
	public static WebElement email;
	@FindBy(id = "password-input")
	public static WebElement password;
	@FindBy(id = "uc-signin-submit")
	public static WebElement login;
	@FindBy(id = "fname")
	public static WebElement fname;
	@FindBy(id = "lname")
	public static WebElement lname;
	@FindBy(id = "locality")
	public static WebElement city;
	@FindBy(xpath = "//input[@value='Continue']")
	public static WebElement contine;
    @FindBy(id="selectbox1")	
	public static WebElement dropdown;
    @FindBy(id="prohead")
    public static WebElement profile; 
    @FindBy(xpath="//input[@placeholder='Type or click here']")
    public static WebElement specification;
    @FindBy(id="submitUserData")
    public static WebElement submit;
    
  
	@Test
	public void newlogin() {
		PageFactory.initElements(driver, Newuserid.class);
		Newuserid.join.click();
		Newuserid.email.sendKeys("newuserdrop@gmail.com");
		Newuserid.password.sendKeys("12345");
		Newuserid.login.click();
		Newuserid.fname.sendKeys("testing");
		Newuserid.lname.sendKeys("field");
		Newuserid.city.sendKeys("sendkeys");
		Newuserid.contine.click();
		Select drop = new Select(Newuserid.dropdown);
		drop.selectByIndex(3);
		Newuserid.dropdown.click();
		Newuserid.profile.sendKeys("tester");
		Newuserid.submit.click();
		
		

	}
    
    
    
    
    
  
}
