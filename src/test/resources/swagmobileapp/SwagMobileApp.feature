Feature: To Run the Swag Labs Mobile App

  Background: 

  Scenario: Validate a valid login user
    Given I open the application
    Then I verify the application login screen
    When I enter the username "standard_user"
    And I enter the password "secret_sauce"
    And I click on the login
    Then I will be able to view the dashboard screen

  Scenario: Validate a problem user to check error message
    Given I open the application
    Then I verify the application login screen
    When I enter the username "locked_out_user"
    And I enter the password "secret_sauce"
    And I click on the login
    Then I verify error "Sorry, this user has been locked out."

  Scenario: Add an item to cart and complete the order
    Given I open the application
    Then I verify the application login screen
    When I enter the username "standard_user"
    And I enter the password "secret_sauce"
    And I click on the login
    Then I add a Item to cart
    And I click on the cart for checkout
    And I verify your cart
    Then I enter the check out information
    And I validate the checkout Overview
    Then I verify the order completion

  Scenario: Add an item to cart and complete the order
    Given I open the application
    Then I verify the application login screen
    When I enter the username "standard_user"
    And I enter the password "secret_sauce"
    And I click on the login
    Then I add a Item to cart
    And I click on the cart for checkout
    And I verify your cart
    Then I enter the check out information as empty
    Then I verify error "First Name is required"

    @test
    Scenario: Add/remove the items from cart
    Given I open the application
    Then I verify the application login screen
    When I enter the username "standard_user"
    And I enter the password "secret_sauce"
    And I click on the login
    Then I add multiple Item to cart
    And I click on the cart for checkout
    And I verify your cart
    Then I remove the item from cart
    Then I enter the check out information
    And I validate the checkout Overview
    Then I verify the order completion