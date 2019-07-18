package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import pageObjects.DealsPage;

public class DealsStepsDef extends TestBase{
	
	DealsPage dealspage;
	
	@Then("^go to Deals page$")
	public void go_to_Deals_page()  {
		DealsPage dealsPage=new DealsPage(driver);
		logger.info("*************On Deals linkPage, Swictching from FRAME to NEW DEALS Link*****************");
		driver.switchTo().frame("mainpanel");
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Deals')]"))).build().perform();
		WebElement clickNewDealink = driver.findElement(By.linkText("New Deal"));
		clickNewDealink.click();
		logger.info("*************Clicked on NEW DEALS Page Link*********************");
	}

	@Then("^fill the Deals form with deals details and save it$")
	public void fill_the_Deals_form_with_deals_details_and_save_it(DataTable dealsData)  {
		logger.info("*************Filling the Deals Form with Details*********************");
		for (Map<String, String> dataMap : dealsData.asMaps(String.class, String.class)) {
		    driver.findElement(By.id("title")).sendKeys(dataMap.get("Title"));
		    driver.findElement(By.name("client_lookup")).sendKeys(dataMap.get("Company"));
		    driver.findElement(By.name("contact_lookup")).sendKeys(dataMap.get("PrimaryContact"));
		    driver.findElement(By.id("amount")).sendKeys(dataMap.get("Amount"));
		    driver.findElement(By.id("probability")).sendKeys(dataMap.get("Probability"));
		    driver.findElement(By.id("commission")).sendKeys(dataMap.get("Commission"));
		    driver.findElement(By.id("quantity")).sendKeys(dataMap.get("Identifier"));
		    driver.findElement(By.name("identifier")).sendKeys(dataMap.get("Quantity"));
		    logger.info("*************Clicking the SAVE button *********************");
		    //dealspage.ClickSaveButton();
		    WebElement ClickONSaveButton = driver.findElement(By.xpath("//input[@value='Save']"));
			ClickONSaveButton.click();
			logger.info("*************Clicked on The SAVED Button*********************");
			logger.info("*************Repeating The Test for the Stated Scenarios*********************");
			Actions actions=new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Deals')]"))).build().perform();
			WebElement clickNewDealink = driver.findElement(By.linkText("New Deal"));
			clickNewDealink.click();
	    	
		}
		
	}
	
	
	@After
	public void close_the_web_browser() {
		logger.info("*************Closing The Web Browser*********************");
		driver.quit();
	}

}
