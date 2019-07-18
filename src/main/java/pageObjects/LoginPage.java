package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.TestBase;

public class LoginPage extends TestBase {

	public LoginPage(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void setUserName(String UserName) {
		WebElement enterUsername = driver.findElement(By.xpath("//input[@name='username']"));
		enterUsername.clear();
		enterUsername.sendKeys(UserName);
	}

	public void setpassword(String pwd) {
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		password.sendKeys(pwd);
		

	}

	public void ClickOnLoginBtn() {
	WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));

	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);
 }

	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}

}
