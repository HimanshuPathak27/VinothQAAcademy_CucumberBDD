package StepDefinitions;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;

import PageObjects.AlertsPopupPage;
import PageObjects.DemoSitesPage;
import PageObjects.MouseEventsPage;
import PageObjects.MultipleWindowsPage;
import PageObjects.RegistrationPage;
import Utilities.ReadConfig;



public class BaseClass {
	
	public ReadConfig readConfig;
	public static WebDriver driver;
	public static Logger log;
	public DemoSitesPage demositesPage;
	public RegistrationPage regPage;
	public MouseEventsPage mouseEvePage;
	public AlertsPopupPage alertpopup;
	public MultipleWindowsPage multiWinPage;

}
