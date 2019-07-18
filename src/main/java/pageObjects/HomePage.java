package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestUtils.Utils;
import baseClass.TestBase;

public class HomePage extends TestBase {
	public HomePage(WebDriver driver) {
		TestBase.driver = driver;
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();

	}

	public boolean verifyLoggedInUserName() {
		WebElement LoggedInUserName = driver.findElement(By.xpath("//td[@align='left'][contains(.,'User: Agnes bolt')]"));
		return LoggedInUserName.isDisplayed();
	}

	public void LogOutUser() {
		WebElement LogOut=driver.findElement(By.xpath("//a[contains(.,'Logout')]"));
		driver.switchTo().frame("mainpanel");
		LogOut.click();
	}

}
