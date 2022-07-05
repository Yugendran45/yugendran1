package LoginProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OnePostedandDelected extends Basicclass {
	
	  
	@FindBy(xpath="//a[@onclick='nomedia()']")
	 public static WebElement post1;
	@FindBy(id="ogtest")
	public static WebElement post2;
	@FindBy(xpath="/html/body/div[3]/div/div[1]/div/div[2]/div/div[5]/div[2]/div[2]/div/div/form/div[3]/div")
	public static WebElement post3;
	@FindBy(xpath="/html/body/div[3]/div/div[1]/div/div[2]/div/div[3]/div[1]/div/div[1]/div[2]")
	 public static WebElement button;
	
	@Test
	public void postanddelete() {
    PageFactory.initElements(driver, OnePostedandDelected.class);
    OnePostedandDelected.post1.click();
    OnePostedandDelected.post2.sendKeys("test");
    OnePostedandDelected.post3.click();
    OnePostedandDelected.button.click();
	}
	 

}
