Feature: Mouse Events

	Scenario: Validate Mouse Events Page
		Given User Already launched a Browser
		When User opens url "https://vinothqaacademy.com/"
		Then User verify Home page title "Vinoth Q.A Academy – Learn With Clarity"
		When User hover over the Demo Sites link
		And User hover over the Practice Automation link
		And User clicks on Demo Site – Mouse Event link
		Then User verify Mouse Event page title "Demo Site – Mouse Event – Vinoth Q.A Academy"
		Then User Navigate to Tooltip textbox, perform Hover over action and verify the text on hovering over the textbox "Enter First Name"
		And User Navigate to DoubleClickMe button, perform double click action and validates the text on double click "Double Click Action is Performed"
		And User Navigate to RightClickMe button, perform right click action and select Registration Form option and verify the Registration Form page title "Demo Site – Registration Form – NxtGen A.I Academy"
		And User Navigate to DragMe button and perform drag and drop action