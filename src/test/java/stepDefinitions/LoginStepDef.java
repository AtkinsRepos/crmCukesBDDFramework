package stepDefinitions;

import baseClass.TestBase;
import configFiles.Constants;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import TestUtils.Utils;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginStepDef extends TestBase {
	LoginPage loginpage;
	Constants constants;
	HomePage homepage;

	@Before
	@Given("^user launches the web browser$")
	public void user_launches_the_web_browser() {
		TestBase.initBrowser();
		String URL = prop.getProperty("ApplicationURL");
		driver.get(URL);
	}

	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() {
		logger.info("************validating login page title*****************");
		LoginPage loginpage = new LoginPage(driver);
		String ExpectedPagetitle = "CRMPRO - CRM software for customer relationship management, sales, and support.";
		String ActualPageTitle = loginpage.ValidateLoginPageTitle();
		Assert.assertEquals(ActualPageTitle, ExpectedPagetitle, "Page Title Not matched");
		logger.info("***********Validated Login Page********************");
	}

	@When("^user enters username \"([^\"]*)\"and enters password \"([^\"]*)\"and clicks on the login button$")
	public void user_enters_username_and_enters_password_and_clicks_on_the_login_button(String username, String password) {
		LoginPage loginpage = new LoginPage(driver);
		logger.info("*************Entering UserName *****************");
		loginpage.setUserName(username);
		logger.info("************Entering password*****************");
		loginpage.setpassword(password);
		loginpage.ClickOnLoginBtn();
		logger.info("************clicked on login button***************");
	}

	@Then("^user should be able to login and be navigated to the Hope page$")
	public void user_should_be_able_to_login_and_be_navigated_to_the_Hope_page() {
		logger.info("******Verifying Home Page Title**********");
		HomePage homepage = new HomePage(driver);
		String title = homepage.verifyHomePageTitle();
		Assert.assertEquals(title, "CRMPRO");
		logger.info("*************Verified Home Page*********************");
	}

	@After
	@Then("^user should close the browser$")
	public void user_should_close_the_browser() {
		logger.info("*************Closing the Browser*********************");
		driver.quit();
	}
	
@AfterMethod
public void tearDown() {
	driver.close();
}


}
