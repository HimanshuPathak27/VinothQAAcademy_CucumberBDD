package StepDefinitions;

import org.apache.logging.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import PageObjects.AlertsPopupPage;
import PageObjects.DemoSitesPage;
import PageObjects.MouseEventsPage;
import PageObjects.MultipleWindowsPage;
import PageObjects.RegistrationPage;
import Utilities.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class DemoSitesNavigationStepDefinitions extends BaseClass{

	@Before
	public void setup() {
		log = LogManager.getLogger("StepDefinitions");
		
		readConfig = new ReadConfig();
		String browser = readConfig.getBrowser();

		if(browser.equals("chrome")){
			driver = new ChromeDriver();
		}
		if(browser.equals("msedge")){
			driver = new EdgeDriver();
		}
		if(browser.equals("gecko")){
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		log.info("Setup is Done");
	}

	@After
	public void tearDown() {
		driver.close();
	}

	@AfterStep
	public void addScreenshot(Scenario sc){
		if(sc.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshot, "image/png", sc.getName());
		}
	}


	////////////////////////  Background  ////////////////////////

	@Given("User Already launched a Browser")
	public void user_already_launched_a_browser() {
		demositesPage = new DemoSitesPage(driver);
		regPage = new RegistrationPage(driver);
		mouseEvePage = new MouseEventsPage(driver);
		alertpopup = new AlertsPopupPage(driver);
		multiWinPage = new MultipleWindowsPage(driver);
		
		log.info("Passed | Browser is Launched");
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@Then("User verify Home page title {string}")
	public void user_verify_home_page_title(String expHomePageTitle) {
		String actHomePageTitle = demositesPage.getHomePageTitle();
		Assert.assertTrue((expHomePageTitle.equals(actHomePageTitle)), "Failed | Home Page title mismatched");
		log.info("Passed | Home Page title validated");
	}

	@When("User hover over the Demo Sites link")
	public void user_hover_over_the_demo_sites_link() {
		demositesPage.navigateToDemoSitesLink();
		log.info("Passed | Navigated to Demo Sites link");
	}

	@When("User hover over the Practice Automation link")
	public void user_hover_over_the_practice_automation_link() {
		demositesPage.navigateToPracticeAutomationLink();
		log.info("Passed | Navigated to Practice Automation link");
	}

	////////////////////////  Scenario: Navigate to Registration Page  ////////////////////////

	@When("User clicks on Demo Site - Registration Form link")
	public void user_clicks_on_demo_site_registration_form_link() {
		demositesPage.clickRegistrationFormLink();
		log.info("Passed | Clicked on Demo Site - Registration Form link");
	}

	@Then("User verify Registration Form page title {string}")
	public void user_verify_registration_form_page_title(String expRegPageTitle) {
		String actRegPageTitle = demositesPage.getRegFormPageTitle();
		Assert.assertTrue((expRegPageTitle.equals(actRegPageTitle)), "Failed | Registration Form Page title mismatched");
		log.info("Passed | Registration Form Page title validated");
	}

	////////////////////////  Scenario: Navigate to Dynamic Transaction Page  ////////////////////////

	@When("User clicks on Demo Site - Dynamic Transaction link")
	public void user_clicks_on_demo_site_dynamic_transaction_link() {
		demositesPage.clickDynamicTransactionLink();
		log.info("Passed | Clicked on Demo Site - Dynamic Transaction link");
	}

	@Then("User verify Dynamic Transaction page title {string}")
	public void user_verify_dynamic_transaction_page_title(String expDynTransPageTitle) {
		String actDynTransPageTitle = demositesPage.getDynamicTransactionPageTitle();
		Assert.assertTrue((expDynTransPageTitle.equals(actDynTransPageTitle)), "Failed | Dynamic Transaction Page title mismatched");
		log.info("Passed | Dynamic Transaction Page title validated");
	}

	////////////////////////  Scenario: Navigate to Mouse Event Page  ////////////////////////

	@When("User clicks on Demo Site – Mouse Event link")
	public void user_clicks_on_demo_site_mouse_event_link() {
		demositesPage.clickMouseEventLink();
		log.info("Passed | Clicked on Demo Site - Mouse Event link");
	}

	@Then("User verify Mouse Event page title {string}")
	public void user_verify_mouse_event_page_title(String expMouseEventPageTitle) {
		String actMouseEventPageTitle = demositesPage.getMouseEventPageTitle();
		Assert.assertTrue((expMouseEventPageTitle.equals(actMouseEventPageTitle)), "Failed | Mouse Event Page title mismatched");
		log.info("Passed | Mouse Event Page title validated");
	}

	////////////////////////  Scenario: Navigate to Alert and Popup Page  ////////////////////////

	@When("User clicks on Demo Site – Alert and Popup link")
	public void user_clicks_on_demo_site_alert_and_popup_link() {
		demositesPage.clickAlertAndPopupLink();
		log.info("Passed | Clicked on Demo Site - Alert and Popup link");
	}

	@Then("User verify Alert and Popup page title {string}")
	public void user_verify_alert_and_popup_page_title(String expAlertPopupPageTitle) {
		String actAlertPopupPageTitle = demositesPage.getAlertAndPopupPageTitle();
		Assert.assertTrue((expAlertPopupPageTitle.equals(actAlertPopupPageTitle)), "Failed | Alert and Popup Page title mismatched");
		log.info("Passed | Alert and Popup Page title validated");
	}	

	////////////////////////  Scenario: Navigate to Multiple Windows Page  ////////////////////////

	@When("User clicks on Demo Site – Multiple Windows link")
	public void user_clicks_on_demo_site_multiple_windows_link() {
		demositesPage.clickMultipleWindowsLink();
		log.info("Passed | Clicked on Demo Site - Multiple Windows link");
	}

	@Then("User verify Multiple Windows page title {string}")
	public void user_verify_multiple_windows_page_title(String expMultipleWindowsPageTitle) {
		String actMultipleWindowsPageTitle = demositesPage.getMultipleWindowsPageTitle();
		Assert.assertTrue((expMultipleWindowsPageTitle.equals(actMultipleWindowsPageTitle)), "Failed | Multiple Windows Page title mismatched");
		log.info("Passed | Multiple Windows Page title validated");
	}

	//////////////////////// Scenario: Navigate to IFrame Page  ////////////////////////

	@When("User clicks on Demo Site – iFrames link")
	public void user_clicks_on_demo_site_i_frames_link() {
		demositesPage.clickIFrameLink();
		log.info("Passed | Clicked on Demo Site - IFrame link");
	}

	@Then("User verify iFrames page title {string}")
	public void user_verify_i_frames_page_title(String expIFramePageTitle) {
		String actIFramePageTitle = demositesPage.getIFramePageTitle();
		Assert.assertTrue((expIFramePageTitle.equals(actIFramePageTitle)), "Failed | IFrame Page title mismatched");
		log.info("Passed | IFrame Page title validated");
	}

	//////////////////////// Scenario: Navigate to WebTables Page  ////////////////////////

	@When("User clicks on Demo Site – WebTable link")
	public void user_clicks_on_demo_site_web_table_link() {
		demositesPage.clickWebTableLink();
		log.info("Passed | Clicked on Demo Site - WebTable link");
	}

	@Then("User verify WebTable page title {string}")
	public void user_verify_web_table_page_title(String expWebTablePageTitle) {
		String actWebTablePageTitle = demositesPage.getWebTablePageTitle();
		Assert.assertTrue((expWebTablePageTitle.equals(actWebTablePageTitle)), "Failed | WebTable Page title mismatched");
		log.info("Passed | WebTable Page title validated");
	}

	//////////////////////// Scenario: Navigate to Progress Bar Page  ////////////////////////

	@When("User clicks on Demo Site – Progress Bar link")
	public void user_clicks_on_demo_site_progress_bar_link() {
		demositesPage.clickProgressBarLink();
		log.info("Passed | Clicked on Demo Site - Progress Bar link");
	}

	@Then("User verify Progress Bar page title {string}")
	public void user_verify_progress_bar_page_title(String expProgressBarPageTitle) {
		String actProgressBarPageTitle = demositesPage.getProgressBarPageTitle();
		Assert.assertTrue((expProgressBarPageTitle.equals(actProgressBarPageTitle)), "Failed | Progress Bar Page title mismatched");
		log.info("Passed | Progress Bar Page title validated");
	}
}
