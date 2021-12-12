@BA-199 @BA-195 @wip
Feature: As a user, I should be able to access to Files module.
	Scenario: Verify users can select all the uploaded files from the page
		Given user logged as user
		When user click Files module
		And Title is Files's module Title
		And click the top left checkbox of the table
		Then all files are selected
		