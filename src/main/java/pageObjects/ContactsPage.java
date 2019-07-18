package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TestUtils.Utils;
import baseClass.TestBase;

public class ContactsPage extends TestBase {
   Utils utils;
	public ContactsPage(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void ContactPgLink() {
		driver.switchTo().frame("mainpanel");
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Contacts')]"))).build().perform();
		WebElement ClickNewContLink = driver.findElement(By.linkText("New Contact"));
		ClickNewContLink.click();
		
	}

	public void NewContactPgLink() {
		WebElement ClickNewContLink = driver.findElement(By.linkText("New Contact"));
		ClickNewContLink.click();
	}

	public void setFirstName(String FirstName) {
		WebElement EnterFirstName = driver.findElement(By.id("first_name"));
		EnterFirstName.sendKeys(FirstName);
	}

	public void setlastName(String LastName) {
		WebElement EnterLastName = driver.findElement(By.id("surname"));
		EnterLastName.sendKeys(LastName);
	}

	public void setCompname(String CompName) {
		WebElement EnterCompname = driver.findElement(By.xpath("//input[@name='client_lookup']"));
		EnterCompname.sendKeys(CompName);

	}

	public void setPosition(String Position) {
		WebElement Enterpost = driver.findElement(By.xpath("//input[contains(@name,'position')]"));
		Enterpost.sendKeys(Position);
	}

	public void setDeptname(String DeptName) {
		WebElement EnterDeptName = driver.findElement(By.id("department"));
		EnterDeptName.sendKeys(DeptName);
	}

	public void setCityName(String CityNameName) {
		WebElement EnterCityName = driver.findElement(By.xpath("//input[contains(@name,'city')]"));
		EnterCityName.sendKeys(CityNameName);
	}

	public void setCountryName(String CountryName) {
		WebElement EnterCountryName = driver.findElement(By.xpath("//input[@name='country']"));
		EnterCountryName.sendKeys(CountryName);
	}
	public void clicOnSaveBtn() {
		WebElement ClickSaveBtn = driver.findElement(By.xpath("//input[@value='Save']"));
		ClickSaveBtn.click();
	}
	public void ClicklogOut() {
		WebElement ClickLogOut = driver.findElement(By.linkText("Logout"));
		ClickLogOut.click();
	}

}
