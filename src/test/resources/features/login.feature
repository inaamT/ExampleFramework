@BA-194 @wip
Feature: Login Functionality

	Scenario: Verify user login successfully
		Scenario: Verify user login successfully
		Given user on "Trycloud QA" page
		When user Enter valid username
		And user Enter valid password
		And Click loginbutton
		Then user access Homepage

	Scenario: Verify user cannot login with invalid credentials
		Given user on "Trycloud QA" page
		When user Enter valid username
		And user Enter invalid password
		And Click loginbutton
		Then Message "Wrong username or password." should be displayed
		And Title should be same as "Trycloud QA"

