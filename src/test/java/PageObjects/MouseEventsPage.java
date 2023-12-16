package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseEventsPage {
	WebDriver ldriver;
	Actions act;

	public MouseEventsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//input[@id='textbox']")
	WebElement hoverOverTextbox;
	
	@FindBy(xpath = "//button[@id='dblclick']")
	WebElement doubleClickMeBtn;
	@FindBy(xpath = "//p[@id='demo']")
	WebElement Text_doubleClickMe;
	
	@FindBy(xpath = "//button[@id='rightclick']")
	WebElement rightClickMeBtn;
	@FindBy(xpath = "//a[normalize-space()='Registration Form']")
	WebElement regFormOption_rightClickMe;
	
	@FindBy(xpath = "//div[@id='draggableElement']")
	WebElement dragMeBtn;
	
	@FindBy(xpath = "//div[@id='droppableElement']")
	WebElement DropHereBox;
	
	public String hoverOverAction() {
		act = new Actions(ldriver);
		act.moveToElement(hoverOverTextbox).perform();
		return hoverOverTextbox.getAttribute("title");
	}
	
	public String doubleClickAction() {
		act = new Actions(ldriver);
		act.moveToElement(doubleClickMeBtn).click().click().perform();
		return Text_doubleClickMe.getText();
	}
	
	public String rightClickAction() {
		act = new Actions(ldriver);
		act.moveToElement(rightClickMeBtn).contextClick().perform();
		regFormOption_rightClickMe.click();
		return ldriver.getTitle();
	}
	
	public void backToMouseEventPage() {
		ldriver.navigate().back();
	}
	
	public void dragDropAction() {
		act = new Actions(ldriver);
		act.dragAndDrop(dragMeBtn, DropHereBox).perform();
	}
}
