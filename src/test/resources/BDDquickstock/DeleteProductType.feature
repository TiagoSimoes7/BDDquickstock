Feature: Delete Product Type
  As an authenticated user
  I want to be able to delete an existent product type
  So that I can remove it from the product types list of the company

  Scenario: Company have at least one product type associated
    Given I have the website open on the dashboard of the company to test "Delete Product Type"
    When I click on the "Products" tab in the sidebar
    And I click on the Manage Product Types in the Products tab
    And I click on the "Delete Type Product" button
    Then I can see the notification "Product Type Deleted"