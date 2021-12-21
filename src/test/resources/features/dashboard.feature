@BA-196 @BA-197 @wip
Feature: Checking menu bar contenents

  Scenario: Validating Menu bar
    Given user on dashboard page
    Then menu bar contains list of elements
      | Files     |
      | Galleries |
      | Activity  |
      | Talk      |
      | Contacts  |
      | Note      |
