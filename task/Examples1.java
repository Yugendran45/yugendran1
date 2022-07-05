package task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import LoginProject.Basicclass;

public class Examples1 extends Basicclass {
	
	@FindBy(xpath="//img[@class='arrow-img']")
	public static WebElement userbutton;
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div[3]/div[2]/div/div/div/div[1]/ul/div/a[2]/li/a")
	public static WebElement ranganathaoption;
	@FindBy(xpath="/html/body/div[4]/div[1]/div/div[7]/div/div[2]/ul/li[1]")
	public static WebElement digitalibrary; 
	@FindBy(xpath="//a[@class='uc-admin-upload uc-hide-toggle']")
	public static WebElement upload;
	@FindBy(id="content_name")
	public static WebElement content;
	@FindBy(xpath="/html/body/div[4]/div/div[4]/div[2]/div[2]/div/div/form/div[1]/div[3]/div/div/divz")
	public static WebElement filetype;
	@FindBy(xpath="//a[@onclick='uploadEbook()']")
	public static WebElement save;
	
	@Test
	public void uploadbok() {
   PageFactory.initElements(driver,Examples1.class );
   Examples1.userbutton.click();
   Examples1.ranganathaoption.click();
   Examples1.digitalibrary.click();
   Examples1.upload.click();
   Examples1.content.sendKeys("new");
   Select select = new Select(Examples1.filetype);
   select.selectByIndex(2);
   Examples1.save.click();
	
	
	
	}


}
