Feature: Create Product Type
  As an authenticated user
  I want to be able to create a new product type
  So that I can associate a new product type to the company's products

  Scenario: Valid product type name
    Given I have the website open on the dashboard of the company to test "CreateProductType"
    When I click on the "Products" tab in the sidebar
    And I click on the Manage Product Types in the Products tab
    And I click on the Create a Product Type button
    And I input a valid product type name
    And I click on the Submit button
    Then I check the successful message


