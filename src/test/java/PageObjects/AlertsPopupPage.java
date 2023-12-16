package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPopupPage {
	
	WebDriver ldriver;
	Actions act;

	public AlertsPopupPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//button[text()='Alert Box']")
	WebElement alertBoxButton;
	
	@FindBy(xpath = "//button[text()='Confirm Alert Box']")
	WebElement confirmAlertBoxButton;
	
	@FindBy(xpath = "//p[@id='demo']")
	WebElement confirmAlertBoxText;
	
	@FindBy(xpath = "//button[text()='Prompt Alert Box']")
	WebElement promptAlertBoxButton;
	
	@FindBy(xpath = "//p[@id='demoone']")
	WebElement promptAlertBoxText;
	
	public void acceptAlertBoxPopup() {
		alertBoxButton.click();
		ldriver.switchTo().alert().accept();
	}
	
	public String acceptConfirmAlertBoxPopup() {
		confirmAlertBoxButton.click();
		ldriver.switchTo().alert().accept();
		return confirmAlertBoxText.getText();
	}
	
	public String dismissConfirmAlertBoxPopup() {
		confirmAlertBoxButton.click();
		ldriver.switchTo().alert().dismiss();
		return confirmAlertBoxText.getText();
	}
	
	public String acceptPromptAlertBoxPopup() {
		promptAlertBoxButton.click();
		ldriver.switchTo().alert().sendKeys("Yes");
		ldriver.switchTo().alert().accept();
		return promptAlertBoxText.getText();
	}
	
	public String dismissPromptAlertBoxPopup() {
		promptAlertBoxButton.click();
		ldriver.switchTo().alert().sendKeys("No");
		ldriver.switchTo().alert().accept();
		return promptAlertBoxText.getText();
	}
	
}
