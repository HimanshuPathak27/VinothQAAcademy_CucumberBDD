package StepDefinitions;

import org.testng.Assert;

import PageObjects.MouseEventsPage;
import io.cucumber.java.en.*;

public class MouseEventStepDefinitions extends BaseClass{

	MouseEventsPage mouseEvePage = new MouseEventsPage(driver);
	
	@Then("User Navigate to Tooltip textbox, perform Hover over action and verify the text on hovering over the textbox {string}")
	public void user_navigate_to_tooltip_textbox_perform_hover_over_action_and_verify_the_text_on_hovering_over_the_textbox(String expHoverOverText) {
	    String actHoverOverText = mouseEvePage.hoverOverAction();
	    Assert.assertTrue((expHoverOverText.equals(actHoverOverText)), "Failed | Text on Hover Over action is Mismatched");
	    log.info("Passed | Text on Hover Over action is validated");
	}
	
	@Then("User Navigate to DoubleClickMe button, perform double click action and validates the text on double click {string}")
	public void user_navigate_to_double_click_me_button_perform_double_click_action_and_validates_the_text_on_double_click(String expDoubleClickText) {
	   String actDoubleClickText = mouseEvePage.doubleClickAction();
	   Assert.assertTrue((expDoubleClickText.equals(actDoubleClickText)), "Failed | Text on Double click action is Mismatched");
	    log.info("Passed | Text on Double click action is validated");
	}
	
	@Then("User Navigate to RightClickMe button, perform right click action and select Registration Form option and verify the Registration Form page title {string}")
	public void user_navigate_to_right_click_me_button_perform_right_click_action_and_select_registration_form_option_and_verify_the_registration_form_page_title(String expregFormTitle) {
	    String actregFormTitle = mouseEvePage.rightClickAction();
	    Assert.assertTrue((expregFormTitle.equals(actregFormTitle)), "Failed | Registration Form title Mismatched");
	    log.info("Passed | Registration Form title validated");
	    mouseEvePage.backToMouseEventPage();
	}
	
	@Then("User Navigate to DragMe button and perform drag and drop action")
	public void user_navigate_to_drag_me_button_and_perform_drag_and_drop_action() {
	    mouseEvePage.dragDropAction();
	}
}
