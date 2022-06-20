
@smoke
  Feature: category

    Scenario Outline: User should be able to navigate to desired category page successfully
      Given User is on homepage
      When User click on "<category_name>" link from header bar
      Then User should be able to successfully navigated to related "<category_url>" category page
      Examples:
      |category_name|category_url|
      |Computers         |https://demo.nopcommerce.com/computers  |
      |Electronics       |https://demo.nopcommerce.com/electronics|
      |Apparel           |https://demo.nopcommerce.com/apparel    |
      |Digital downloads |https://demo.nopcommerce.com/digital-downloads  |
      |Books             |https://demo.nopcommerce.com/books|
      |Jewelry           |https://demo.nopcommerce.com/jewelry |
      |Gift Cards        |https://demo.nopcommerce.com/gift-cards |