package stepDefinitions;

import java.awt.Frame;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import TestUtils.Utils;
import baseClass.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CompanyPage;
import pageObjects.LoginPage;

public class AddCompanyStepsDef extends TestBase{
	CompanyPage companypage;
	LoginPage login;

	
	@When("^user enters username and password and clicks on the login button$")
	public void user_enters_username_and_password_and_clicks_on_the_login_button(DataTable credentials)   {	
		logger.info("************* Entering userName and Password in table format*********************");
		
		
	for (Map<String, String> dataMap : credentials.asMaps(String.class, String.class)) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(dataMap.get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataMap.get("password"));
		Utils.WebDriverWaitForAlert();
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		loginBtn.click();
		logger.info("************* Clicked login button*********************");
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].click();", loginBtn);
	} 
			
	}
	
	@Then("^go to Company page$")
	public void go_to_Company_page()  {
		logger.info("************* On Company page*********************");
		CompanyPage companypage=new CompanyPage(driver);
		companypage.clickCompanyPageLink();
		logger.info("************* Switched main Frame and clicked on Then New CompanyPage Link*************");
		
	}
	@Then("^fill the company  form with user details and save it$")
	public void fill_the_company_form_with_user_details_and_save_it(DataTable companyData)  {
		logger.info("************* Filling out company form details*********************");
		
		for (Map<String, String> dataMap : companyData.asMaps(String.class, String.class)) {
			driver.findElement(By.id("company_name")).sendKeys(dataMap.get("CompanyName"));
	    	driver.findElement(By.name("industry")).sendKeys(dataMap.get("IndustryName"));
	    	Utils.WebDriverWaitForElement();
	    	driver.findElement(By.id("annual_revenue")).sendKeys(dataMap.get("AnnualRevenue"));
	    	Utils.WebDriverWaitForElement();
	    	WebElement selectStatus = driver.findElement(By.name("status"));
			Select Status = new Select(selectStatus);
			Status.selectByVisibleText("Active");
			Utils.WebDriverWaitForElement();
	    	WebElement selectCat = driver.findElement(By.name("category"));
			Select category = new Select(selectCat);
			category.selectByIndex(1);
			WebElement selPriority = driver.findElement(By.name("priority"));
			Select Priority = new Select(selPriority);
			Priority.selectByVisibleText("High");
			Utils.WebDriverWaitForElement();
	    	driver.findElement(By.id("phone")).sendKeys(dataMap.get("PhoneNumber"));
	    	Utils.WebDriverWaitForElement();
	    	driver.findElement(By.id("email")).sendKeys(dataMap.get("Email"));
	    	Utils.WebDriverWaitForElement();
	    	
	    	WebElement clicksaveBtn = driver.findElement(By.xpath("(//input[contains(@value,'Save')])[1]"));
			clicksaveBtn.click();
			logger.info("************* Clicked on SAVE button*********************");	
			logger.info("************* Action repeated*********************");
			Actions actions=new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Companies')]"))).build().perform();
			WebElement clickCompanyPage= driver.findElement(By.linkText("New Company"));
			clickCompanyPage.click();
			logger.info("************* Add New Company Action Ended*********************");
		}
	   
	    }
	@After
	public void close_the_web_browser() {
		driver.quit();
	}
}