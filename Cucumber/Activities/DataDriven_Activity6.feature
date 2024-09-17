Feature: Place order on the Amazon website.

Scenario Outline: Validate if a registered user is able to place an order.
    Given user is on the Amazon website
    When user logs in with "<Username>" and "<Password>"
    Then user should be able to view homepage
    When user searches for "<ProductID>"
    Then user should be on the product information page
    And user tried to add the product to cart
    Then product should be added to cart
    When user navigates to order confirmation page via express checkout option
    Then order should be placed successfully along with order confirmation id being generated

Examples:
| Username | Password  | ProductID |
| user1    | password1 |       123 |
| user2    | password2 |       536 |