package StepDefinitions;

import PageObjects.MultipleWindowsPage;
import io.cucumber.java.en.*;

public class MultipleWindowsStepDefinition extends BaseClass{

	MultipleWindowsPage multiWinPage = new MultipleWindowsPage(driver);
	
	@Then("User clicks on New Browser window button and verify the title of new browser window {string} and close the browser window")
	public void user_clicks_on_new_browser_window_button_and_verify_the_title_of_new_browser_window_and_close_the_browser_window(String homePageTitle) {
		multiWinPage.verifyNewBrowserWindow(homePageTitle);
		log.info("Passed | Title of New Browser Window validated");
	}
	
	@Then("User clicks on New Browser Tab button and verify the title of new browser window {string} and close the browser tab")
	public void user_clicks_on_new_browser_tab_button_and_verify_the_title_of_new_browser_window_and_close_the_browser_tab(String homePageTitle) {
		multiWinPage.verifyNewBrowserTab(homePageTitle);
		log.info("Passed | Title of New Browser Tab validated");
	}
	
}
