package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	WebDriver ldriver;

	public RegistrationPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//input[@id='vfb-5']")
	WebElement firstNameField;

	@FindBy(xpath = "//input[@id='vfb-7']")
	WebElement lastNameField;

	@FindBy(xpath = "//input[@id='vfb-31-1']")
	WebElement maleGenderRadioBtn;
	@FindBy(xpath = "//input[@id='vfb-31-2']")
	WebElement femalGenderRadioBtn;
	@FindBy(xpath = "//input[@id='vfb-31-3']")
	WebElement otherGenderRadioBtn;
	
	@FindBy(xpath = "//input[@id='vfb-13-address']")
	WebElement stAddField;
	
	@FindBy(xpath = "//input[@id='vfb-13-address-2']")
	WebElement aptAddField;
	
	@FindBy(xpath = "//input[@id='vfb-13-city']")
	WebElement cityField;
	
	@FindBy(xpath = "//input[@id='vfb-13-state']")
	WebElement stateField;

	@FindBy(xpath = "//input[@id='vfb-13-zip']")
	WebElement pincodeField;
	
	@FindBy(xpath = "//select[@id='vfb-13-country']")
	WebElement countryDD;
	
	@FindBy(xpath = "//input[@id='vfb-14']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@id='vfb-18']")
	WebElement demoDateField;
	
	@FindBy(xpath = "//select[@id='vfb-16-hour']")
	WebElement convHrsDD;
	
	@FindBy(xpath = "//select[@id='vfb-16-min']")
	WebElement convMinsDD;
	
	@FindBy(xpath = "//input[@id='vfb-19']")
	WebElement mobileField;
	
	@FindBy(xpath = "//input[@id='vfb-20-0']")
	WebElement seleniumWebdriverCheckbox;
	@FindBy(xpath = "//input[@id='vfb-20-1']")
	WebElement uftCheckbox;
	@FindBy(xpath = "//input[@id='vfb-20-2']")
	WebElement testNGCheckbox;
	@FindBy(xpath = "//input[@id='vfb-20-3']")
	WebElement coreJavaCheckbox;
	@FindBy(xpath = "//input[@id='vfb-20-4']")
	WebElement functionalTestingCheckbox;
	@FindBy(xpath = "//input[@id='vfb-20-5']")
	WebElement othersCheckbox;
	
	@FindBy(xpath = "//textarea[@id='vfb-23']")
	WebElement queryField;
	
	@FindBy(xpath = "//label[contains(text(),'Example:')]")
	WebElement verificationCodeText;
	
	@FindBy(xpath = "//input[@id='vfb-3']")
	WebElement verificationCodeField;
	
	@FindBy(xpath = "//input[@id='vfb-4']")
	WebElement submitBtn;
	
	@FindBy(xpath = "//div[@class='elementor-widget-container']")
	WebElement confiramtionTextContainer;
	
	
	public void enterFirstName(String fName) {
		firstNameField.clear();
		firstNameField.sendKeys(fName);
	}

	public void enterLastName(String lName) {
		lastNameField.clear();
		lastNameField.sendKeys(lName);
	}

	public void selectGender(String gender) {
		if(gender.equals("Male"))
			maleGenderRadioBtn.click();
		if(gender.equals("Female"))
			femalGenderRadioBtn.click();
		if(gender.equals("Others"))
			otherGenderRadioBtn.click();
	}

	public void enterStreetAddress(String stAdd) {
		stAddField.clear();
		stAddField.sendKeys(stAdd);
	}
	
	public void enterApartmentAddress(String aptAdd) {
		aptAddField.clear();
		aptAddField.sendKeys(aptAdd);
	}
	
	public void enterCity(String city) {
		cityField.clear();
		cityField.sendKeys(city);
	}
	
	public void enterState(String state) {
		stateField.clear();
		stateField.sendKeys(state);
	}
	
	public void enterPinCode(String pincode) {
		pincodeField.clear();
		pincodeField.sendKeys(pincode);
	}
	
	public void selectCountry(String country) {
		Select dropdown = new Select(countryDD);
		dropdown.selectByVisibleText(country);	
	}
	
	public void enterEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
	}
	
	public void enterDemoDate(String demodate) {
		demoDateField.clear();
		demoDateField.sendKeys(demodate);
	}
	
	public void selectConvHrs(String convHrs) {
		Select dropdown = new Select(convHrsDD);
		dropdown.selectByVisibleText(convHrs);	
	}
	
	public void selectConvMins(String convMins) {
		Select dropdown = new Select(convMinsDD);
		dropdown.selectByVisibleText(convMins);	
	}
	
	public void enterMobileNumber(String mobileNo) {
		mobileField.clear();
		mobileField.sendKeys(mobileNo);
	}
	
	public void selectIntersetedCourse(String course) {
		if(course.equals("Selenium WebDriver"))
			seleniumWebdriverCheckbox.click();
		if(course.equals("UFT"))
			uftCheckbox.click();
		if(course.equals("Test NG"))
			testNGCheckbox.click();
		if(course.equals("Core Java"))
			coreJavaCheckbox.click();
		if(course.equals("Functional Testing"))
			functionalTestingCheckbox.click();
		if(course.equals("Others"))
			othersCheckbox.click();
	}
	
	public void enterQuery(String query) {
		queryField.clear();
		queryField.sendKeys(query);
	}
	
	public void enterVerificationCode() {
		String textWithCode = verificationCodeText.getText();
		String code = textWithCode.split(" ")[1];
		verificationCodeField.sendKeys(code);
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	
	public String getSuccessfullRegPageTitle() {
		return ldriver.getTitle();
	}
	
	public String getSuccessMessage() {
		return confiramtionTextContainer.getText();
	}
}
