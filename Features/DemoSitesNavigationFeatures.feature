Feature: Demo Sites Navigations

Background:
	Given User Already launched a Browser
	When User opens url "https://vinothqaacademy.com/"
	Then User verify Home page title "Vinoth Q.A Academy - Learn With Clarity"
	When User hover over the Demo Sites link
	And User hover over the Practice Automation link

	Scenario: Navigate to Registration Page
		And User clicks on Demo Site - Registration Form link
		Then User verify Registration Form page title "Demo Site - Registration Form - Vinoth Q.A Academy"

	Scenario: Navigate to Dynamic Transaction Page
		And User clicks on Demo Site - Dynamic Transaction link
		Then User verify Dynamic Transaction page title "Demo Site – Dynamic Transaction – Vinoth Q.A Academy"
		
	Scenario: Navigate to Mouse Event Page
		And User clicks on Demo Site – Mouse Event link
		Then User verify Mouse Event page title "Demo Site – Mouse Event – Vinoth Q.A Academy"		
		
	Scenario: Navigate to Alert and Popup Page
		And User clicks on Demo Site – Alert and Popup link
		Then User verify Alert and Popup page title "Demo Site – Alert and Popup – Vinoth Q.A Academy"	
		
	Scenario: Navigate to Multiple Windows Page
		And User clicks on Demo Site – Multiple Windows link
		Then User verify Multiple Windows page title "Demo Site – Multiple Windows – Vinoth Q.A Academy"		
		
	Scenario: Navigate to iFrames Page
		And User clicks on Demo Site – iFrames link
		Then User verify iFrames page title "Demo Site – iFrames – Vinoth Q.A Academy"
		
	Scenario: Navigate to WebTable Page
		And User clicks on Demo Site – WebTable link
		Then User verify WebTable page title "Demo Site – WebTable – Vinoth Q.A Academy"
		
	Scenario: Navigate to Progress Bar Page
		And User clicks on Demo Site – Progress Bar link
		Then User verify Progress Bar page title "Demo Site – Progress Bar – Vinoth Q.A Academy"			