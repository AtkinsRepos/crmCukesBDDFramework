package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.TestBase;

public class DealsPage extends TestBase {
	public DealsPage(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void clickOnDealink() {
		driver.switchTo().frame("mainpanel");
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Deals')]"))).build().perform();
		WebElement clickNewDealink = driver.findElement(By.linkText("New Deal"));
		clickNewDealink.click();
		
	}

	public void clickOnNewDealsLink() {
		WebElement clickNewDealink = driver.findElement(By.linkText("New Deal"));
		clickNewDealink.click();
	}

	public void setTitle(String title) {
		WebElement EntertitleName = driver.findElement(By.id("title"));
		EntertitleName.sendKeys(title);
	}

	public void setClientName(String clientName) {
		WebElement EnterClientName = driver.findElement(By.name("client_lookup"));
		EnterClientName.sendKeys(clientName);
	}

	public void setContactLookup(String ContactLookup) {
		WebElement EnterContactLookupName = driver.findElement(By.name("contact_lookup"));
		EnterContactLookupName.sendKeys(ContactLookup);
	}

	public void setAmount(String Amount) {
		WebElement EnterAmount = driver.findElement(By.id("amount"));
		EnterAmount.sendKeys(Amount);
	}

	public void setProbability(String probability) {
		WebElement EnterprobabilityName = driver.findElement(By.id("probability"));
		EnterprobabilityName.sendKeys(probability);
	}

	public void setCommission(String commission) {
		WebElement EntercommissionName = driver.findElement(By.id("commission"));
		EntercommissionName.sendKeys(commission);
	}

	public void setDealQuantity(String quantity) {
		WebElement Enterquantity = driver.findElement(By.id("quantity"));
		Enterquantity.sendKeys(quantity);
	}

	public void setIdentifier(String identifier) {
		WebElement EnterIDName = driver.findElement(By.name("identifier"));
		EnterIDName.sendKeys(identifier);
	}

	public void ClickOnLogout() {
		WebElement ClickLogout = driver.findElement(By.linkText("Logout"));
		ClickLogout.click();
		
	}
	public void ClickSaveButton() {
		WebElement ClickONSaveButton = driver.findElement(By.xpath("//input[@value='Save']"));
		ClickONSaveButton.click();
	}



	
}
