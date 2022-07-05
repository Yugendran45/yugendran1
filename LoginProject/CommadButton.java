package LoginProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CommadButton extends  Basicclass{

	
//command inside options
	@FindBy(xpath = "//a[@onclick='comments(382,this)']")
	public static WebElement commend;
	@FindBy(xpath="//a[@onclick='commentlike(270,382)']")
	 public static WebElement clike;
	@FindBy(xpath="//a[@onclick='replies(270,382)']")
	public static WebElement reply;
	@FindBy(id="270 382 reply_last")
	public static WebElement replytext;
	@FindBy(xpath="/html/body/div[3]/div/div[1]/div/div[2]/div/div[3]/div[1]/div/div[3]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[2]/div/div")
	public static WebElement delete;
	@FindBy(xpath="//a[@onclick='deletereplies(46,382,270)']")
	public static WebElement deleteoption;
	@Test
	public void deleteoption() {
    PageFactory.initElements(driver,CommadButton.class);
    CommadButton.commend.click();
    CommadButton.clike.click();
    CommadButton.reply.click();
    CommadButton.replytext.sendKeys("test",Keys.ENTER);
    CommadButton.delete.click();
    CommadButton.deleteoption.click();
}	
}
