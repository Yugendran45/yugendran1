package LoginProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class Networkpage extends Basicclass{
    
	
	@FindBy(xpath="//img[@alt='Network']")
	public static WebElement network;
	@FindBy(id="connections_tab")
	public static WebElement myconnections ;
	@FindBy(xpath="//a[@onclick='connection(161843,1,this)']")
	public static WebElement connect1;
	@FindBy(xpath="//a[@class='uc-see-all-btn ripple-button']")
    public static WebElement showmore;
	@FindBy(xpath="//li[@class='uc-tab-link uc-active']")
	public static WebElement invitations;
	@FindBy(xpath="//a[@onclick='CancelRequest(267442,this)']")
	public static WebElement  cancel1;
    @FindBy(id="sentsearch")
	public static WebElement search1;
    @FindBy(xpath="//h5[text()='No results found'][1]")
    public static WebElement text;


   @Test
    private void Example() {
   PageFactory.initElements(driver,Networkpage.class );
   Networkpage.network.click();
   Networkpage.myconnections.click();
   Networkpage.connect1.click();
   Networkpage.showmore.click();
   driver.navigate().back();
   Networkpage.invitations.click();
   Networkpage.cancel1.click();
   Networkpage.search1.sendKeys("hai",Keys.ENTER);
   Networkpage.text.getText();
		   
   
    
    
    }


}



