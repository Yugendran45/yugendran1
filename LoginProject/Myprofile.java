package LoginProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Myprofile extends Basicclass {
	@FindBy(id = "myprofile")
	public static WebElement profile;
	@FindBy(xpath = "//div[@class='progress-bar']")
	public static WebElement myprofile;
	@FindBy(xpath="//a[@class='cmn-btn ripple-button uc-prof-edit-btn']")
	public static WebElement profilesummary;
	@FindBy(id="profilesummaryedit")
	public static WebElement profilesummaryedit;
	@FindBy(id="saveedit")
	public static WebElement save1;
	@FindBy(xpath="//a[@onclick=\"openedit('specializationbox')\"]")
	public static WebElement specification;
	@FindBy(id="specializationedit")
	public static WebElement specificationedit;
	@FindBy(id="saveedit")
	public static WebElement save2; 
	 
	
	@FindBy(xpath="//a[@onclick='openworkexperience()']")
	public static WebElement exprience ;
	@FindBy(id="title")
	public static WebElement jobtitle;
	@FindBy(id="selectbox1")
	public static WebElement employement;
	@FindBy(id="company")
	public static WebElement company;
	@FindBy(name="location")
	public static WebElement location;
    @FindBy(id="description")
	public static WebElement description;
    @FindBy(xpath="//div[@class='checkboxes reverse-check']")
    public static WebElement currentlywork;
    @FindBy(xpath="//a[@onclick='saveexperience()']")
    public static WebElement save3;
    
    
    @FindBy(xpath="/html/body/div[3]/div/div[3]/div/div/div[2]/div/div[1]/div[6]/div/a")
    public static WebElement education;
    @FindBy(id="instituion_name")
    public static WebElement institename;
	@FindBy(id="type")
    public static WebElement degree;
	@FindBy(id="field_of_study")
	public static WebElement fieldstudy;
	@FindBy(id="edu_from_year")
	public static WebElement from;
	@FindBy(id="edu_to_year")
	public static WebElement  to;
	@FindBy(id="precentage")
	public static WebElement percentage;
	@FindBy(id="currently_working")
	public static WebElement edulocation;
	@FindBy(xpath="//a[@onclick=\"saveeducation()\"]")
	public static WebElement save4;
	
	@Test
	public void profile() throws InterruptedException {
		PageFactory.initElements(driver, Myprofile.class);
		Myprofile.profile.click();
		Myprofile.myprofile.click();
		Myprofile.profilesummary.click();
		Myprofile.profilesummaryedit.sendKeys("testing");
		Myprofile.save1.click();
		Myprofile.specification.click();
		Myprofile.specificationedit.sendKeys("tseting");
		Myprofile.save2.click();
		Myprofile.exprience.click();
		Myprofile.jobtitle.sendKeys("testing");
		Select select = new Select(driver.findElement(By.id("//option[text()='Management Member']")));
		select.selectByIndex(1);
		Myprofile.company.sendKeys("abc comany");
		Myprofile.description.sendKeys("test");
		Myprofile.currentlywork.click();
		Myprofile.location.sendKeys("testtest");
		Myprofile.save3.click();
       // JavascriptExecutor js = (JavascriptExecutor) driver;
	   // js.executeScript("window.scrollBy(0,2000)");
		Myprofile.education.click();
		// Experience
		Myprofile.institename.sendKeys("send");
		Myprofile.degree.sendKeys("test");
		Myprofile.fieldstudy.sendKeys("test");
		Select select1 = new Select(Myprofile.from);
		select1.selectByIndex(1);
		Select select2 = new Select(Myprofile.to);
		select2.selectByIndex(5);
		Myprofile.percentage.sendKeys("70.12");
		Myprofile.location.sendKeys("chennnai");
		Myprofile.save4.click();

	}
}
