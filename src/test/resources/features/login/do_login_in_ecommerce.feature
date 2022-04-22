Feature: Check the correct behavior of the login features in the Ecommerce

  Scenario: Login with as a registered client.
    Given that Rafa is already registered in the ecommerce
    But he is not yet logged in the ecommerce
    When he login with your credentials in the login page
    Then he shouldn't see a AUTHENTICATION_FAILED error message

  Scenario: Login with as a not registered client.
    Given that Fran isn't registered in the ecommerce
    When he login with your credentials in the login page
    Then he should see a AUTHENTICATION_FAILED error message

  Scenario: Login with as a not registered client.
    Given that Fran isn't registered in the ecommerce
    When he login with your credentials in the login page
    Then he should see a AUTHENTICATION_FAILED error message

