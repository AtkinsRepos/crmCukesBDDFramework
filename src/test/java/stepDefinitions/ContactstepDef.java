package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TestUtils.Utils;
import baseClass.TestBase;
import cucumber.api.java.en.Then;
import pageObjects.ContactsPage;

public class ContactstepDef extends TestBase {
	ContactsPage contactspage;
	Utils utils;

	@Then("^go to Contacts page$")
	public void go_to_Contacts_page() {
		logger.info("*************On Contact Page*********************");
		contactspage = new ContactsPage(driver);
		contactspage.ContactPgLink();
		logger.info("************* Clicked on NEW CONTANTS LINK*********************");
	}

	@Then("^fill the contact form with user details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"\\.$")
	public void fill_the_contact_form_with_user_details_and_and_and_and_and_and(String FirstName, String LastName,
			String Compname, String position, String DeptName, String CityName, String CountryName) {
		logger.info("************* Filling the Contact form with details*********************");
		contactspage.setFirstName(FirstName);
		contactspage.setlastName(LastName);
		contactspage.setCompname(Compname);
		contactspage.setPosition(position);
		contactspage.setDeptname(DeptName);
		contactspage.setCityName(CityName);
		contactspage.setCountryName(CountryName);
	}

	@Then("^save the form$")
	public void save_the_form() {
		contactspage.clicOnSaveBtn();
		logger.info("************* Clicked of SAVE Button*********************");
	}

	@Then("^close the web browser$")
	public void close_the_web_browser() {
		driver.quit();

	}

}
