Feature: Registration

	Scenario: Register a New User
		Given User Already launched a Browser
		When User opens url "https://vinothqaacademy.com/"
		Then User verify Home page title "Vinoth Q.A Academy – Learn With Clarity"
		When User hover over the Demo Sites link
		And User hover over the Practice Automation link
		And User clicks on Demo Site - Registration Form link
		Then User verify Registration Form page title "Demo Site – Registration Form – Vinoth Q.A Academy"
		And User enters First Name in Registration Form "<FirstName>" 
		And User enters Last Name in Registration Form "<LastName>" 
		And User selects Gender in Registration Form "<Gender>" 
		And User enters Street Address in Registration Form "<StAdd>" 
		And User enters Apartment Address in Registration Form "<AptAdd>" 
		And User enters City in Registration Form "<City>" 
		And User enters State in Registration Form "<State>" 
		And User enters Pincode in Registration Form "<Pincode>" 
		And User Slects Country in Registration Form "<Country>" 
		And User enters Email in Registration Form "<Email>" 
		And User enters Date of Demo in Registration Form "<DemoDate>" 
		And User enters Convenient Hours in Registration Form "<ConvHrs>" 
		And User enters Convenient Mins in Registration Form "<ConvMins>" 
		And User enters Mobile Number in Registration Form "<MobileNo>" 
		And User select Interested Courses in Registration Form "<Course>" 
		And User enters Query in Registration Form "<Query>"
		And User enters Verification Code in Registration Form 
		When User clicks on Submit button
		Then User verify Successful Registration page title "Demo Site – Dynamic Transaction – Vinoth Q.A Academy"
		And User verify Successful Registration message "Registration Form is Successfully Submitted."
		Examples: 
		|FirstName|LastName|Gender|StAdd|AptAdd|City|State|Pincode|Country|Email|DemoDate|ConvHrs|ConvMins|MobileNo|Course|Query|
		|Chris|Gayle|Male|xxx|xxx|xxx|Barbados|321|Nigeria|Chris@uniboss.com|01/01/2024|05|30|9876543210|Functional Testing|Does black life matter?|