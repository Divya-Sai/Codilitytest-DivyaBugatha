Feature: Adding Products
  Scenario: Add products to my wishlist and add lowest product to my cart
    Given Login to test Script Demo Website "https://testscriptdemo.com/"
    When I add four different products to my wishlist
    Then I view my wishlist table
    Then I find total four selected items in my wishlist
    When I search for lowest price product
    And I able to add the lowest price item to my cart
    Then I able to verify the item in my cart