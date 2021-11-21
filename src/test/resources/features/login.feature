@BA-194 @BA-193 @wip
Feature: Login Functionality
Background: Given user on "Trycloud QA" page

	Scenario: Verify user login successfully
		Scenario: Verify user login successfully
		When user Enter valid username
		And user Enter valid password
		And Click loginbutton
		Then user access Homepage

	Scenario: Verify user cannot login with invalid credentials
		When user Enter valid username
		And user Enter invalid password
		And Click loginbutton
		Then Message "Wrong username or password." should be displayed
		And Title should be same as "Trycloud QA"

