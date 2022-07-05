package task;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import LoginProject.Basicclass;

public class Sample {
	WebDriver driver;

	@BeforeClass
	public void firestone() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\Day1\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://ulektz.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='btn-c btn-clr1']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("uc-signin-email-field")).sendKeys("ulektztester1@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("12345");
					driver.findElement(By.id("uc-signin-submit")).click();
	}

	@FindBy(id = "myprofile")
	public static WebElement profile;
	@FindBy(xpath = "//a[@class='uc-signout']")
	public static WebElement signout;
	@FindBy(id = "myprofile")
	public static WebElement profile1;
	@FindBy(id = "headtab3130")
	public static WebElement clg;
	@FindBy(id = "first_name")
	public static WebElement firestname;
	@FindBy(id = "last_name")
	public static WebElement lastname;
	@FindBy(id = "profile_headline")
	public static WebElement profilehead;
	@FindBy(id = "email_address")
	public static WebElement email;
	@FindBy(id = "mobile_number")
	public static WebElement mobile;
	@FindBy(name="formFieldName[profession]")
	public static WebElement dpprofession;
	@FindBy(id = "name_of_the_organisation__institution")
	public static WebElement instite;
	@FindBy(id = "nationality")
	public static WebElement nationality;
	@FindBy(name="formFieldName[highest_qualification]")
	public static WebElement dpqualificartion;
	@FindBy(id = "specialization")
	public static WebElement spacification;
	@FindBy(id = "marital_status_radio1")
	public static WebElement maritalstatus;
	@FindBy(id = "address_line_1")
	public static WebElement address;
	@FindBy(name = "formFieldName[date_of_birth]")
	public static WebElement dob;
	@FindBy(id = "selectbox3")
	public static WebElement dpcommunity;
	
	@Test
	public void upload() throws InterruptedException {
		PageFactory.initElements(driver, Sample.class);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Sample.profile.click();
		Sample.profile1.click();
		Sample.clg.click();
		Sample.firestname.sendKeys("test");
		Sample.lastname.sendKeys("test");
		Sample.profilehead.sendKeys("test");
		Sample.email.sendKeys("test@");
		Sample.mobile.sendKeys("test");
		Select select = new Select(Sample.dpprofession);
		select.selectByIndex(5);
		Sample.instite.sendKeys("abc clg");
		Thread.sleep(2000);
		Select select1 = new Select(Sample.dpqualificartion);
		select1.selectByIndex(2);
		Sample.dob.sendKeys("17/05/2004");

	}
}