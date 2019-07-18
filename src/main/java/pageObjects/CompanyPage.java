package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import TestUtils.Utils;
import baseClass.TestBase;

public class CompanyPage extends TestBase {

	Utils utils;

	public CompanyPage(WebDriver driver) {
		TestBase.driver = driver;
	}
	public void clickCompanyPageLink() {	
	driver.switchTo().frame("mainpanel");
	Actions actions=new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Companies')]"))).build().perform();
	WebElement clickCompanyPage= driver.findElement(By.linkText("New Company"));
	clickCompanyPage.click();
	}
	
	public void clickonNewCompanyLink() {
		WebElement ClickNewCompLink = driver.findElement(By.linkText("New Company"));
		ClickNewCompLink.click();

	}

	public void setCompName(String CompanyName) {
		WebElement EnterCompName = driver.findElement(By.id("company_name"));
		EnterCompName.sendKeys(CompanyName);
	}

	public void setIndustName(String IndustryName) {
		WebElement EnterIndustName = driver.findElement(By.name("industry"));
		EnterIndustName.sendKeys(IndustryName);
	}

	public void setAnnualRev(String AnnualRevenue) {
		WebElement EnterAnnualRev = driver.findElement(By.id("annual_revenue"));
		EnterAnnualRev.sendKeys(AnnualRevenue);
	}

	public void selectUserStatus() {
		WebElement selectStatus = driver.findElement(By.name("status"));
		Select Status = new Select(selectStatus);
		Status.selectByVisibleText("Active");
	}

	public void selectCategory() {
		WebElement selectCat = driver.findElement(By.name("category"));
		Select category = new Select(selectCat);
		category.selectByIndex(1);
	}

	public void selectPriority() {
		WebElement selPriority = driver.findElement(By.name("priority"));
		Select Priority = new Select(selPriority);
		Priority.selectByVisibleText("High");
	}

	public void setPhoneNum(String PhoneNumber) {
		WebElement EnterPhoneNum = driver.findElement(By.id("phone"));
		EnterPhoneNum.sendKeys(PhoneNumber);
	}

	public void setEmailAddr(String Email) {
		WebElement EnterEmailAddr = driver.findElement(By.id("email"));
		EnterEmailAddr.sendKeys(Email);
	}
	public void clickOnSaveBtn() {
		WebElement clicksaveBtn = driver.findElement(By.xpath("(//input[contains(@value,'Save')])[1]"));
		clicksaveBtn.click();
		
	}
}
