Feature: Multiple Windows

	Scenario: Validate Multiple Windows Page
		Given User Already launched a Browser
		When User opens url "https://vinothqaacademy.com/"
		Then User verify Home page title "Vinoth Q.A Academy – Learn With Clarity"
		When User hover over the Demo Sites link
		And User hover over the Practice Automation link
		And User clicks on Demo Site – Multiple Windows link
		Then User verify Multiple Windows page title "Demo Site – Multiple Windows – Vinoth Q.A Academy"
		Then User clicks on New Browser window button and verify the title of new browser window "Vinoth Q.A Academy – Learn With Clarity" and close the browser window
		Then User clicks on New Browser Tab button and verify the title of new browser window "Vinoth Q.A Academy – Learn With Clarity" and close the browser tab
