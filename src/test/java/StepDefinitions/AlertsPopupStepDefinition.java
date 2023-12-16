package StepDefinitions;

import org.testng.Assert;

import PageObjects.AlertsPopupPage;
import io.cucumber.java.en.*;

public class AlertsPopupStepDefinition extends BaseClass{
	
	AlertsPopupPage alertpopup = new AlertsPopupPage(driver);
	
	@Then("User clicks on Alert box button and clicks on OK on Alert popup")
	public void user_clicks_on_alert_box_button_and_clicks_on_ok_on_alert_popup() {
	    alertpopup.acceptAlertBoxPopup();
	}
	
	@Then("User clicks on Confirm Alert box button and clicks on OK on popup and verify the text {string}")
	public void user_clicks_on_confirm_alert_box_button_and_clicks_on_ok_on_popup_and_verify_the_text(String exptext) {
	    String actualtext = alertpopup.acceptConfirmAlertBoxPopup();
	    Assert.assertTrue((exptext.equals(actualtext)), "Failed | Confirm Alert box acceptance text mismatched");
	    log.info("Passed | Confirm Alert box acceptance text validated");
	}
	
	@Then("User again clicks on Confirm Alert box button, clicks on Cancel on popup and verify the text {string}")
	public void user_again_clicks_on_confirm_alert_box_button_clicks_on_cancel_on_popup_and_verify_the_text(String exptext) {
		String actualtext = alertpopup.dismissConfirmAlertBoxPopup();
	    Assert.assertTrue((exptext.equals(actualtext)), "Failed | Confirm Alert box dismissal text mismatched");
	    log.info("Passed | Confirm Alert box dismissal text validated");
	}
	
	@Then("User clicks on Prompt Alert box button, sends a text Yes on popup and verify the text {string}")
	public void user_clicks_on_prompt_alert_box_button_sends_a_text_yes_on_popup_and_verify_the_text(String exptext) {
		String actualtext = alertpopup.acceptPromptAlertBoxPopup();
	    Assert.assertTrue((exptext.equals(actualtext)), "Failed | Prompt Alert box acceptance text mismatched");
	    log.info("Passed | Prompt Alert box acceptance text validated");
	}
	
	@Then("User clicks on Prompt Alert box button, sends a text No on popup and verify the text {string}")
	public void user_clicks_on_prompt_alert_box_button_sends_a_text_no_on_popup_and_verify_the_text(String exptext) {
		String actualtext = alertpopup.dismissPromptAlertBoxPopup();
	    Assert.assertTrue((exptext.equals(actualtext)), "Failed | Prompt Alert box dismissal text mismatched");
	    log.info("Passed | Prompt Alert box dismissal text validated");
	}
	
	
}
