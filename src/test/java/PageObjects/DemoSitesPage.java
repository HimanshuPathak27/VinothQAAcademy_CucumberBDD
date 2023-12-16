package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSitesPage{

	WebDriver ldriver;
	Actions act;

	public DemoSitesPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(linkText = "Demo Sites")
	WebElement demoSitesLink;

	@FindBy(linkText = "Practice Automation")
	WebElement practiceAutomationLink;

	@FindBy(linkText = "Demo Site – Registration Form")
	WebElement regFormLink;

	@FindBy(linkText = "Demo Site – Dynamic Transaction")
	WebElement dynamicTransactionLink;

	@FindBy(linkText = "Demo Site – Mouse Event")
	WebElement mouseEventLink;

	@FindBy(linkText = "Demo Site – Alert and Popup")
	WebElement alertAndPopupLink;

	@FindBy(linkText = "Demo Site – Multiple Windows")
	WebElement multipleWindowsLink;

	@FindBy(linkText = "Demo Site – iFrames")
	WebElement iFramesLink;

	@FindBy(linkText = "Demo Site – WebTable")
	WebElement webTablesLink;

	@FindBy(linkText = "Demo Site – Progress Bar")
	WebElement progressBarLink;

	public String getHomePageTitle() {
		return ldriver.getTitle();
	}

	public void navigateToDemoSitesLink() {
		act = new Actions(ldriver);
		act.moveToElement(demoSitesLink).perform();
	}

	public void navigateToPracticeAutomationLink() {
		act = new Actions(ldriver);
		act.moveToElement(practiceAutomationLink).perform();
	}

	public void clickRegistrationFormLink() {
		act = new Actions(ldriver);
		act.moveToElement(regFormLink).click().perform();
	}

	public String getRegFormPageTitle() {
		return ldriver.getTitle();
	}

	public void clickDynamicTransactionLink() {
		act = new Actions(ldriver);
		act.moveToElement(dynamicTransactionLink).click().perform();
	}

	public String getDynamicTransactionPageTitle() {
		return ldriver.getTitle();
	}

	public void clickMouseEventLink() {
		act = new Actions(ldriver);
		act.moveToElement(mouseEventLink).click().perform();
	}

	public String getMouseEventPageTitle() {
		return ldriver.getTitle();
	}

	public void clickAlertAndPopupLink() {
		act = new Actions(ldriver);
		act.moveToElement(alertAndPopupLink).click().perform();
	}

	public String getAlertAndPopupPageTitle() {
		return ldriver.getTitle();
	}

	public void clickMultipleWindowsLink() {
		act = new Actions(ldriver);
		act.moveToElement(multipleWindowsLink).click().perform();
	}

	public String getMultipleWindowsPageTitle() {
		return ldriver.getTitle();
	}

	public void clickIFrameLink() {
		act = new Actions(ldriver);
		act.moveToElement(iFramesLink).click().perform();
	}

	public String getIFramePageTitle() {
		return ldriver.getTitle();
	}

	public void clickWebTableLink() {
		act = new Actions(ldriver);
		act.moveToElement(webTablesLink).click().perform();
	}

	public String getWebTablePageTitle() {
		return ldriver.getTitle();
	}

	public void clickProgressBarLink() {
		act = new Actions(ldriver);
		act.moveToElement(progressBarLink).click().perform();
	}

	public String getProgressBarPageTitle() {
		return ldriver.getTitle();
	}
}
