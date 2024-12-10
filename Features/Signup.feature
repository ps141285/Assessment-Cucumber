Feature: Signup Page Functionality
  As a user,
  I want to sign up on the website
  So that I can create a new account successfully.

  Scenario: Successful signup with valid details
    Given I am on the signup page
    When I fill in the "First Name" field with "John"
    And I fill in the "Last Name" field with "Doe"
    And I fill in the "Email ID" field with "john.doe@example.com"
    And I fill in the "Password" field with "Password123!"
    And I fill in the "Confirm Password" field with "Password123!"
    And I click the "Create Account" button
    Then I should see a confirmation message "Account created successfully"

  Scenario: Signup fails with missing fields
    Given I am on the signup page
    When I fill in the "First Name" field with "John"
    And I leave the "Email ID" field empty
    And I fill in the "Password" field with "Password123!"
    And I fill in the "Confirm Password" field with "Password123!"
    And I click the "Create Account" button
    Then I should see an error message "This is a required field."

  Scenario: Signup fails when passwords do not match
    Given I am on the signup page
    When I fill in the "First Name" field with "Jane"
    And I fill in the "Last Name" field with "Smith"
    And I fill in the "Email ID" field with "jane.smith@example.com"
    And I fill in the "Password" field with "Password123!"
    And I fill in the "Confirm Password" field with "Password456!"
    And I click the "Create Account" button
    Then I should see an error message "Please enter the same value again."

  Scenario: Signup fails with an invalid email ID
    Given I am on the signup page
    When I fill in the "First Name" field with "Emily"
    And I fill in the "Last Name" field with "Davis"
    And I fill in the "Email ID" field with "emily.davis@invalid"
    And I fill in the "Password" field with "Password123!"
    And I fill in the "Confirm Password" field with "Password123!"
    And I click the "Create Account" button
    Then I should see an error message "Please enter a valid email address (Ex: johndoe@domain.com)."
