Feature: New user regist on the aplication
    As a new User
    I want to be able to create a new account 
    So that I can be able to access the aplication

    Scenario: Create Manager Account
        Given I have the website open on the login page to test "Regist Feature"
        When I click on the "Regist Account" button
            And I input a valid "email"
            And I input a valid "password"
            And I input a valid "token"
            And I click on the "Create Account" button
        Then I can see the notification "User created"

    Scenario: Email Already Taken
        Given I have the website open on the login page to test "Regist Feature"
        When I click on the "Regist Account" button
            And I input a "email" already taken
            And I input a valid "password"
            And I input a valid "token"
            And I click on the "Create Account" button
        Then I can see the notification "The email address is already in use by another account."

    Scenario: Invalid Email
        Given I have the website open on the login page to test "Regist Feature"
        When I click on the "Regist Account" button
            And I input a invalid "email"
            And I input a valid "password"
            And I input a valid "token"
            And I click on the "Create Account" button
        Then I can see the notification "Email invalid"

    Scenario: Invalid Password
        Given I have the website open on the login page to test "Regist Feature"
        When I click on the "Regist Account" button
            And I input a valid "email"
            And I input a invalid "password"
            And I input a valid "token"
            And I click on the "Create Account" button
        Then I can see the notification "Password must have at least six characters"

    Scenario: Invalid Token
        Given I have the website open on the login page to test "Regist Feature"
        When I click on the "Regist Account" button
            And I input a valid "email"
            And I input a valid "password"
            And I input a invalid "token"
            And I click on the "Create Account" button
        Then I can see the notification "Invalid Token"

    Scenario: Try to regist an account with empty fields on form
        Given I have the website open on the login page to test "Regist Feature"
        When I click on the "Regist Account" button
            And I click on the "Create Account" button
        Then I can see the notification "Email field is required"