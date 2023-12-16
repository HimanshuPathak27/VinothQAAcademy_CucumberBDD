package PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleWindowsPage {

	WebDriver ldriver;

	public MultipleWindowsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "(//button[@id='button1'])[1]")
	WebElement newBrowserWinButton;

	@FindBy(xpath = "(//button[@id='button1'])[3]")
	WebElement newBrowserTabButton;

	public void verifyNewBrowserWindow(String homePageTitle) {
		newBrowserWinButton.click();

		Set<String> windowIds = ldriver.getWindowHandles();
		Iterator<String> iterator = windowIds.iterator();

		String homePageWindowId = iterator.next();
		String newPageWindowId = iterator.next();

		ldriver.switchTo().window(newPageWindowId);
		ldriver.manage().window().maximize();
		
		if((ldriver.getTitle()).equals(homePageTitle)) {
			ldriver.close();
		}

		ldriver.switchTo().window(homePageWindowId);
	}

	public void verifyNewBrowserTab(String homePageTitle) {
		newBrowserTabButton.click();

		Set<String> windowIds = ldriver.getWindowHandles();
		Iterator<String> iterator = windowIds.iterator();

		String homePageWindowId = iterator.next();
		String newPageWTabId = iterator.next();

		ldriver.switchTo().window(newPageWTabId);
		ldriver.manage().window().maximize();
		
		if((ldriver.getTitle()).equals(homePageTitle)) {
			ldriver.close();
		}

		ldriver.switchTo().window(homePageWindowId);
	}
}




