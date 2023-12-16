Feature: Alerts & Popup

	Scenario: Validate Alerts and Popup Page
		Given User Already launched a Browser
		When User opens url "https://vinothqaacademy.com/"
		Then User verify Home page title "Vinoth Q.A Academy – Learn With Clarity"
		When User hover over the Demo Sites link
		And User hover over the Practice Automation link
		And User clicks on Demo Site – Alert and Popup link
		Then User verify Alert and Popup page title "Demo Site – Alert and Popup – Vinoth Q.A Academy"
		Then User clicks on Alert box button and clicks on OK on Alert popup
		And User clicks on Confirm Alert box button and clicks on OK on popup and verify the text "You clicked on OK!"
		And User again clicks on Confirm Alert box button, clicks on Cancel on popup and verify the text "You clicked on Cancel!"
		And User clicks on Prompt Alert box button, sends a text Yes on popup and verify the text "Thanks for Liking Automation"
		And User clicks on Prompt Alert box button, sends a text No on popup and verify the text "Sad to hear it !"
		