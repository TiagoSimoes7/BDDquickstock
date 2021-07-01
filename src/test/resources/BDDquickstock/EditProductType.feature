Feature: Edit Product Type
  As an authenticated user
  I want to be able to edit an existent product type
  So that I can fix an existent product type of the company

  Scenario: Valid product type name
    Given I have the website open on the dashboard of the company to test "Edit Product Type"
    When I click on the "Products" tab in the sidebar
    And I click on the Manage Product Types in the Products tab
    And I click on the "Edit Type Product" button
    And I input a valid product type name
    And I click on the "Submit Product Type" button
    Then I have the product type edited on the product type's list
