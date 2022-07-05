package LoginProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Resourcespage extends Basicclass{
	@FindBy(xpath="//img[@alt='Resources']")
	public static WebElement resource;
	@FindBy(xpath="//a[@onclick='connection(161843,1,this)']")
	public static WebElement  connection1;
	@FindBy(xpath="//a[@onclick='groupjoin(3303)']")
	public static WebElement join;
	@FindBy(xpath="//button[@onclick='gocommunity()']")
	public static WebElement seeall;
	@FindBy(xpath="//button[text()='Next'][1]")
	public static WebElement next1; 
	@FindBy(xpath="/html/body/div[3]/div/div/div/div[5]/div/button[2]")
	public static WebElement next2;
	@FindBy(xpath="/html/body/div[4]/div/div/div/div[5]/div/button[2]")
	public static WebElement next3; 
	@FindBy(xpath="/html/body/div[3]/div/div/div/div[9]/div/div/div/div[2]/div/div[2]/a[1]")
	public static WebElement moredetails;
	
	
	@Test
	public void resource() {
    PageFactory.initElements(driver,Resourcespage.class );
    Resourcespage.resource.click();
    JavascriptExecutor jse = (JavascriptExecutor)driver;
	
		/*Resourcespage.connection1.click();
		Resourcespage.join.click();
		Resourcespage.seeall.click();*/
		Resourcespage.next1.click();
		Resourcespage.next2.click();
		Resourcespage.next3.click();
		jse.executeScript("window.scrollBy(0,1000)");
		Resourcespage.moredetails.click();

		
	}
}
