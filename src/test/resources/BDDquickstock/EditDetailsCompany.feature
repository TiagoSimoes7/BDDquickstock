Feature: Edit company details
  As an administrator user
  I want to be able to edit the company information
  So that I can update the company information

  Scenario Outline: Edit the company details
    Given I have the website open on the dashboard of the company to test "EditDetailsCompany"
    When I click on the Administration tab in the sidebar
    And I click on the Manage Company button
    And I click on the Edit button of the "<field>"
    And I input a valid "<field>"
    And I click in Save button of the "<field>"
    Then I can see the changes made on the company information of the "<field>"

    Examples:
        | field|
        | country    |
        | district   |
        | address    |
        | postalcode |
        | email      |
        | phonenumber|


  Scenario Outline: Empty fields
    Given I have the website open on the dashboard of the company to test "EditDetailsCompanyEmptyFields"
    When I click on the Administration tab in the sidebar
    And I click on the Manage Company button
    And I click on the Edit button of the "<field>"
    And I leave the "<field>" field empty
    Then I can see that the Save of "<field>" button is disable
    Examples:
      | field|
      | district   |
      | address    |
      | postalcode |
      | email      |
      | phonenumber|


  Scenario Outline: Invalid company input
    Given I have the website open on the dashboard of the company to test "EditDetailsCompanyInvalidFields"
    When I click on the Administration tab in the sidebar
    And I click on the Manage Company button
    And I click on the Edit button of the "<field>"
    And I input an invalid "<field>"
    Then I can see that the Save of "<field>" button is disable
    Examples:
      | field|
      | postalcode |
      | postalcode |
