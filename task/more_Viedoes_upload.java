package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import LoginProject.Basicclass;

public class more_Viedoes_upload  extends Basicclass{
 
   @FindBy(xpath="//a[@onclick='addmedia()']")
   public static WebElement addmedia;	
	@FindBy(id="uc-addPhoto")
	public static WebElement addviedo;
	@FindBy(id="add-div")
	public static WebElement otheraddviedo;
	
	 @Test
	public void viedo() throws InterruptedException {
	PageFactory.initElements(driver,more_Viedoes_upload.class);	
	more_Viedoes_upload.addmedia.click();
	more_Viedoes_upload.addviedo.sendKeys("E:\\Aaaa\\src\\test\\java\\com\\co\\fc057c36e3a7f67c.mp4");
	//Thread.sleep(20000);
	/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-div")));*/
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("aruguments[0].setAttribute'value','E:\\Aaaa\\src\\test\\java\\com\\co\\6d6628f2009ef22f.mp4'",otheraddviedo);
	//more_Viedoes_upload.otheraddviedo.sendKeys("E:\\Aaaa\\src\\test\\java\\com\\co\\one.mp4");
	
	WebElement ele = driver.findElement(By.id("add-div"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	}
	
}
