package LoginProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CummunityPage extends Basicclass {
	
	@FindBy(xpath="//img[@alt='Communities']")
	public static WebElement commutybutton;
	@FindBy(xpath="//li[@class='uc-tab-link uc-active']")
	public static WebElement communitybutton;
	@FindBy(xpath="//li[@class='uc-tab-link uc-active']")
	public static WebElement invition;
	@FindBy(xpath="//img[@alt='Home']")
	public static WebElement homebutton;
	@FindBy(xpath="/html/body/div[3]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/div/div/div/a[1]/span[2]/p/span[2]")
	public static WebElement join; 
	@FindBy(id="first_name")
	public static WebElement firestname; 
	@FindBy(id="middle_name")
	public static WebElement middlename;
	@FindBy(id="last_name")
	public static WebElement lastname;
	@FindBy(id="email_address")
	public static WebElement email;
	@FindBy(id="mobile_number")
	public static WebElement mobilenumber;
	
	@FindBy(id="profession")
	public static WebElement  profession;
	@FindBy(id="name_of_the_organisation__institution")
	public static WebElement organisation;
	@FindBy(id="id__roll__reg_no")
	public static WebElement regno;
	@FindBy(id="country")
	public static WebElement country;
	@FindBy(id="prfBtn")
	public static WebElement submit;
	@FindBy(xpath="/html/body/div[3]/div/div[6]/div[2]/div/div/a")
	public static WebElement OK;
	@FindBy(id="searchbar_community")
	public static WebElement search;
	@FindBy(id="community_reco_srch")
	public static WebElement serachcommunity; 
	
	
	//digital library 
	@FindBy(id="joinedcommunity")
	public static WebElement joinedcommunity;
	@FindBy(xpath="//img[@src='https://www.ulektz.com//assets/img/community/Digital-Library.svg']")
	public static WebElement digitallibrary;
	@FindBy(xpath="//a[@onclick='ebookaddcart(50247,3,this)']")
	public static WebElement addtobook;
	@FindBy(xpath="/html/body/div[3]/div/div[3]/div/div[1]/div/div[1]/ul/li[1]/div[5]/a/img")
	public static WebElement gotobooks;
    @FindBy(xpath="//li[@class='uc-tab-link uc-active']")	
	public static WebElement vieodes;
    @FindBy(xpath="//a[@onclick='addvideos(20638,3,this)']")
    public static WebElement  addtoviedoes;
	
	
	@Test
	public void community() {
    PageFactory.initElements(driver,CummunityPage.class); 
   /* CummunityPage.commutybutton.click();
    CummunityPage.communitybutton.click();
    CummunityPage.join.click();
    CummunityPage.firestname.sendKeys("test");
    CummunityPage.middlename.sendKeys("1");
    CummunityPage.lastname.sendKeys("123");
    CummunityPage.email.sendKeys("1232@gmail.com");
    CummunityPage.mobilenumber.sendKeys("8461465535");
   Select select = new Select( CummunityPage.profession);
    select.selectByIndex(4);
    CummunityPage.organisation.sendKeys("abcinstite");
    CummunityPage.regno.sendKeys("18UCA1329");
    CummunityPage.country.sendKeys("india");
    CummunityPage.submit.click();
    CummunityPage.OK.click();
   CummunityPage.search.sendKeys("periyar university",Keys.ENTER);
    */
    CummunityPage.joinedcommunity.click();  
    CummunityPage.digitallibrary.click();
    CummunityPage.addtobook.click();
    CummunityPage.vieodes.click();
    CummunityPage.addtoviedoes.click();
    
	}
	

}
