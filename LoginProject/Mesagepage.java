package LoginProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mesagepage  {
	WebDriver driver;
	
	@BeforeClass
	public void firestone() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\Day1\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://ulektz.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='btn-c btn-clr1']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("uc-signin-email-field")).sendKeys("ulektztester1@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("12345");
		driver.findElement(By.id("uc-signin-submit")).click();
	}
	
	@FindBy(xpath="//img[@alt='Messages']")
	public static WebElement msgbutton;
	@FindBy(xpath="//h3[text()='Ananth']")
    public static WebElement msgoption;
	@FindBy(id="writeMessage")
	public static WebElement sendmsg;
	@FindBy(id="sendMyMessage")
	public static WebElement sendmymsg;
	@FindBy(xpath="//h3[text()='Chandramohan S']")
	public static WebElement sendtoother;
	@FindBy(id="writeMessage")
	public static WebElement sendmsg2;
	@FindBy(id="sendMyMessage")
	public static WebElement sendmymsg2;
	@FindBy(xpath="//h3[text()='a.anusuya']")
	public static WebElement sentoother2;
	@FindBy(id="writeMessage")
	public static WebElement sendmsg3;
	@FindBy(id="sendMyMessage")
	public static WebElement sendmymsg3;
	
	@Test
	public void msg() { 
    PageFactory.initElements(driver,Mesagepage.class );  
    Mesagepage.msgbutton.click();
    Mesagepage.msgoption.click();
    Mesagepage.sendmsg.sendKeys("goodmorning",Keys.ENTER);
    Mesagepage.sendtoother.click();
    Mesagepage.sendmsg2.sendKeys("goodmorning",Keys.ENTER);
    Mesagepage.sentoother2.click();
    Mesagepage.sendmsg3.sendKeys("goodmorning",Keys.ENTER);
    Mesagepage.sendmymsg3.click();
	}

    @AfterClass
	public void msg1() {
    driver.quit();	
		
}
}



