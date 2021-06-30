Feature: Edit company details
  As an administrator user
  I want to be able to edit the company information
  So that I can update the company information

  Scenario Outline: Edit the company details
    Given that I have the app open on the dashboard of the company
    When I click on the Administration tab in the sidebar
    And I click on the Manage Company button
    And I click on the Edit button of the "<field>"
    And I input a valid "<field>"
    And I click in Save button of the "<field>"
    Then I can see the changes made on the company information

    Examples:
        | field|
        | country    |
        | district   |
        | address    |
        | postalcode |
        | email      |
        | phonenumber|


  Scenario Outline: Empty fields
    Given that I have the app open on the dashboard of the company
    When I click on the Administration tab in the sidebar
    And I click on the Manage Company button
    And I click on the Edit button of the "<field>"
    And I leave the "<field>" field empty
    Then I can see that the Save button is disable
    And I can see a warning saying that I need to input a "<field>"

    Examples:
      | field|
      | district   |
      | address    |
      | postalcode |
      | email      |
      | phonenumber|


  Scenario Outline: Invalid company input
    Given that I have the app open on the dashboard of the company
    When I click on the Administration tab in the sidebar
    And I click on the Manage Company button
    And I click on the Edit button of the "<field>"
    And I input an invalid "<field>"
    Then I can see that the Save button is disable
    And I can see a warning saying that I need to input a valid "<field>"
    Examples:
      | field|
      | postalcode |
      | postalcode |
