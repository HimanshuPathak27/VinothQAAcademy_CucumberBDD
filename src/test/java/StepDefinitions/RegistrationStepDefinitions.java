package StepDefinitions;

import org.testng.Assert;

import PageObjects.RegistrationPage;
import io.cucumber.java.en.*;

public class RegistrationStepDefinitions extends BaseClass{
	
	RegistrationPage regPage = new RegistrationPage(driver);
	
	////////////////////////  Scenario: Register a New User  ////////////////////////
	
	@Then("User enters First Name in Registration Form {string}")
	public void user_enters_first_name_in_registration_form(String fName) {
		regPage.enterFirstName(fName);
		log.info("Passed | First Name Entered");
	}
	
	@Then("User enters Last Name in Registration Form {string}")
	public void user_enters_last_name_in_registration_form(String lName) {
	    regPage.enterLastName(lName);
	    log.info("Passed | Last Name Entered");
	}
	
	@Then("User selects Gender in Registration Form {string}")
	public void user_selects_gender_in_registration_form(String gender) {
	    regPage.selectGender(gender);
	    log.info("Passed | Gender Selected");
	}
	
	@Then("User enters Street Address in Registration Form {string}")
	public void user_enters_street_address_in_registration_form(String stAdd) {
	    regPage.enterStreetAddress(stAdd);
	    log.info("Passed | Street Address Entered");
	}
	
	@Then("User enters Apartment Address in Registration Form {string}")
	public void user_enters_apartment_address_in_registration_form(String aptAdd) {
	    regPage.enterApartmentAddress(aptAdd);
	    log.info("Passed | Apartment Address Entered");
	}
	
	@Then("User enters City in Registration Form {string}")
	public void user_enters_city_in_registration_form(String city) {
	    regPage.enterCity(city);
	    log.info("Passed | City Entered");
	}
	
	@Then("User enters State in Registration Form {string}")
	public void user_enters_state_in_registration_form(String state) {
	    regPage.enterState(state);
	    log.info("Passed | State Entered");
	}
	
	@Then("User enters Pincode in Registration Form {string}")
	public void user_enters_pincode_in_registration_form(String pincode) {
	    regPage.enterPinCode(pincode);
	    log.info("Passed | Pin Code Entered");
	}
	
	@Then("User Slects Country in Registration Form {string}")
	public void user_slects_country_in_registration_form(String country) {
	    regPage.selectCountry(country);
	    log.info("Passed | Country Selected");
	}
	
	@Then("User enters Email in Registration Form {string}")
	public void user_enters_email_in_registration_form(String email) {
	    regPage.enterEmail(email);
	    log.info("Passed | Email Address Entered");
	}
	
	@Then("User enters Date of Demo in Registration Form {string}")
	public void user_enters_date_of_demo_in_registration_form(String demodate) {
	    regPage.enterDemoDate(demodate);
	    log.info("Passed | Date of Demo Entered");
	}
	
	@Then("User enters Convenient Hours in Registration Form {string}")
	public void user_enters_convenient_hours_in_registration_form(String convHrs) {
	    regPage.selectConvHrs(convHrs);
	    log.info("Passed | Convenient Hours Selected");
	}
	
	@Then("User enters Convenient Mins in Registration Form {string}")
	public void user_enters_convenient_mins_in_registration_form(String convMins) {
	    regPage.selectConvMins(convMins);
	    log.info("Passed | Convenient Minutes Selected");
	}
	
	@Then("User enters Mobile Number in Registration Form {string}")
	public void user_enters_mobile_number_in_registration_form(String mobileNo) {
	    regPage.enterMobileNumber(mobileNo);
	    log.info("Passed | Mobile Number Entered");
	}
	
	@Then("User select Interested Courses in Registration Form {string}")
	public void user_select_interested_courses_in_registration_form(String course) {
	    regPage.selectIntersetedCourse(course);
	    log.info("Passed | Interested Course Selected");
	}
	
	@Then("User enters Query in Registration Form {string}")
	public void user_enters_query_in_registration_form(String query) {
	    regPage.enterQuery(query);
	    log.info("Passed | Query Entered");
	}
	
	@Then("User enters Verification Code in Registration Form")
	public void user_enters_verification_code_in_registration_form() {
	    regPage.enterVerificationCode();
	    log.info("Passed | Code Entered");
	}
	
	@When("User clicks on Submit button")
	public void user_clicks_on_submit_button() {
	   regPage.clickSubmitBtn();
	    log.info("Passed | Clicked on Submit button");
	}
	
	@Then("User verify Successful Registration page title {string}")
	public void user_verify_successful_registration_page_title(String expSuccessfullRegPageTitle) {
		String actSuccessfullRegPageTitle = regPage.getSuccessfullRegPageTitle();
		Assert.assertTrue((expSuccessfullRegPageTitle.equals(actSuccessfullRegPageTitle)), "Failed | Successfull Registration Page title mismatched");
		log.info("Passed | Successfull Registration Page title validated");
	}
	
	@Then("User verify Successful Registration message {string}")
	public void user_verify_successful_registration_message(String expSuccMessage) {
	    String actSuccMessage = regPage.getSuccessMessage();
	    Assert.assertTrue((actSuccMessage.contains(expSuccMessage)), "Failed | Success Message mismatched");
	    log.info("Passed | Success Message validated");
	}
	
}
