package LoginProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login  {
	
	 protected WebDriver driver;
	
	@Test(dataProvider="logindata")
	public void Bothandright(String uname,String pword) throws InterruptedException {
		//long starttime = System.currentTimeMillis(); 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ulektz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.get("http://65.1.198.213/ulektzConnectVs2/start/signin");
		   driver.manage().window().maximize();
		   driver.findElement(By.id("uc-signin-email-field")).sendKeys(uname);
		   driver.findElement(By.id("password-input")).sendKeys(pword);
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.findElement(By.name("/html/body/div[2]/div[2]/div/form/div[3]/input")).click();
		  /* long endtime = System.currentTimeMillis(); 
		   long totaltime= endtime-starttime;
		   System.out.println("totaltime"+totaltime);*/
	} 
	
	
    @DataProvider(name="logindata")
	public Object[][] Dataprovider() {
    return new Object[][]{
    			{"ulektztest28@yahoo.com","12345"},
    			{"ulektztest7@gmail.com","12345"},
    		    {"yugendrankumar001@gmail.com","Yugendrankumar@45"},
    			{"neelukh27@gmail.com","12345"},
    		};
	}
	
	
	
	

}
