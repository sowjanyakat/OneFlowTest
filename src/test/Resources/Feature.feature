Feature: Test Shopping Cart
  Scenario: Launch URL and search the product
    Given User enters URL
    When User is search for the product
    Then The Products should be displayed or display Message
Scenario: Item added to the Cart
  Given User on the products page
  When User add product or multiple products to the cart
  Then Display message
   Scenario: Update item quantity
    When user update quantity of product
    Then Price get updated and display message
  Scenario: Item remove from the cart
    When User remove item from the cart
    Then Item removed from the cart and display message
