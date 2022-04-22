Feature: Check the correct behavior of the login features in the Ecommerce

#  Scenario: Login with as a registered client.
#    Given that Fran is already registered in the ecommerce
#    But he is not yet logged in the ecommerce
#    When he login with your credentials in the login page
#    Then he shouldn't see a AUTHENTICATION_FAILED error message
#
#  Scenario: Login with as a not registered client.
#    Given that Fran isn't registered in the ecommerce
#    When he login with your credentials in the login page
#    Then he should see a AUTHENTICATION_FAILED error message

  # Scenario: Select an item and go the shopping cart summary page.
  #   Given that Fran isn't registered in the ecommerce
  #   When he selects an item
  #   Then he should be in the shopping cart summary page

  Scenario: Complete purchase
    Given that Fran isn't registered in the ecommerce
    When he selects an item
    And he has to create his account
    And he confirms shipping address
    And he accepts the consent for shipping
    Then he should be in the payment page
