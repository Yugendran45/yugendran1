package LoginProject;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FeedSection.Posted;

public class photesupload  extends Posted{
	@Test
	 public void photesupload() throws Throwable {
	    	PageFactory.initElements( driver, Posted.class);
	    	Posted.username.sendKeys("ulektztest28@yahoo.com");
	    	Posted.password.sendKeys("12345");
	    	Posted.login.click();
			//posted
	    	Thread.sleep(5000);
	    	Posted.postoption.click();
	    	Thread.sleep(5000);
	    	Posted.Postedoption.sendKeys("hai");
	    	Thread.sleep(10000);
	    	Posted.posted.click();
	    	Thread.sleep(5000);
	    	Posted.addmedia.click();
	    	Thread.sleep(5000);
	    	Posted.addphoto.sendKeys("E:\\\\Aaaa\\\\src\\\\test\\\\java\\\\com\\\\co\\\\Penguins.jpg");
	    	Thread.sleep(5000);
	      	Posted.addsumbitbutton.click();
	    	
		}

}
