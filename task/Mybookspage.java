package task;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import LoginProject.Basicclass;

public class Mybookspage extends Basicclass {
    
	@FindBy(id="mybooks")
	public static WebElement mybooks; 
	@FindBy(xpath="/html/body/div[3]/div/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")
	public static WebElement dotbutton; 
	@FindBy(xpath="/html/body/div[3]/div/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div/div/ul/li[2]/a")
    public static WebElement delete;
	@FindBy(xpath="//a[@class='cmn-btn uc-success-btn uc-delete-btn']")
	public static WebElement deleteoption;
	@FindBy(id="recAddedId0")
	public static WebElement addtobooks;
	@FindBy(xpath="//a[text()='Continue Now']")
	public static WebElement continuenow; 
	@FindBy(xpath="//a[@onclick='showMoreMyBooks(this)']")
	public static WebElement showmoreresult;
	@FindBy(xpath="//a[@class='uc-cmn-btn uc-view-btn'][1]")
	public static WebElement readbook;
	@FindBy(xpath="//input[@onkeyup='searchMyBooks(this.value,1)']")
	public static WebElement searchbook;
	
	@Test
	public void book() {
     PageFactory.initElements(driver, Mybookspage.class);
     Mybookspage.mybooks.click();
    /* Mybookspage.dotbutton.click();
     Mybookspage.delete.click();
     Mybookspage.deleteoption.click();*/
     
     
     Mybookspage.showmoreresult.click();
     Mybookspage.addtobooks.click();
     Mybookspage.continuenow.click();
     Mybookspage.readbook.click();
     driver.navigate().back();
     Mybookspage.searchbook.sendKeys("pdf",Keys.ENTER);	
     
     
	}
	
}
