Feature: Invalid registration to automation practice website

  Scenario: Validate user registration is failed
    Given Automation practice authentication page is opened
    When I register account with email address "invalidTest"
    Then "Invalid email address." error is thrown