package task;


import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class rough1 {
	
	@Test(dataProvider="data")
	
		public void loginn(String uname,String pword, String post) throws IOException, InterruptedException {

		for (int i = 0; i < 3; i++) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\ulektz\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://development.ulektz.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("uc-signin-email-field")).sendKeys(uname);
			driver.findElement(By.id("password-input")).sendKeys(pword);
			driver.findElement(By.id("uc-signin-submit")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@onclick='addmedia()']")).click();
			WebElement post2 = driver.findElement(By.id("ogtest"));
			post2.sendKeys(post);
			driver.findElement(By.xpath("//a[@onclick='formsubmit()']")).click();
		}

}

	@DataProvider(name="data")
	public String[][] loginnew() {
		return new String[][] {
			{ "ulektztester1@gmail.com", "12345" ,"test1"},
			{ "ulektztest28@yahoo.com", "12345","test2" },
			{ "neelukh27@gmail.com", "12345","test3" }, 
			{ "testuser2287@yahoo.com ", "12345","test4" }
		};
	}
	
}