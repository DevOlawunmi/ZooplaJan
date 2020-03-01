Feature: Search for Property for sale
  As a customer
  I want the ability to search a property of my choice and view the details
  So I can have more information about searched property

  Scenario Outline: User can successfully search for a property
    Given I navigate to Zoopla.co.uk
    And the To Buy tab is highlighted
    When I enter a "<UKLocation>" in the search bar
    And I select a "<MinPrice>" from minimum price drop button
    And I select a "<MaxPrice>" from the maximum price drop button
    And I select a "<PropertyType>" from the property type drop button
    And I select "<Bedrooms>" from the drop button
    And I click on the Search button
    Then all the property within the selected location and price range are displayed
    And I click on the result link

    Examples:
      |UKLocation|MinPrice|MaxPrice|PropertyType|Bedrooms|
      |ST4 7DW|£100,000	|£400,000	|Flats	|	3+|
#      |Liverpool|600000|1000000|House|7|
#      |M40|200000|800000|Farms|3|
#
#  Scenario Outline: User cannot successfully search for a property
#    Given I navigate to Zoopla.co.uk
#    When I enter an invalid "<Location>" in the search bar
#    And I select a "<MinPrice>" from the Drop Button
#    And I select a "<MaxPrice>" from the Drop Button
#    And I select a "<PropertyType>" from the Drop Button
#    And I select "<Bedrooms>" from the Drop Button
#    And I click on the Search button
#    Then an error page is displayed
#
#    Examples:
#      |Location|MinPrice|MaxPrice|PropertyType|Bedrooms|
#      |	|200000|500000|House|3|
#      |Lagos|300000|450000|Flat|5|
#
#
#
#  Scenario Outline: User cannot successfully search for a property with an empty location field
#    Given I navigate to Zoopla.co.uk
#    When I enter an invalid "<Location>" in the search bar
#    And I select a "<MinPrice>" from the Drop Button
#    And I select a "<MaxPrice>" from the Drop Button
#    And I select a "<PropertyType>" from the Drop Button
#    And I select "<Bedrooms>" from the Drop Button
#    And I click on the Search button
#    Then an error message is displayed on the location field
#
#    Examples:
#      |Location|MinPrice|MaxPrice|PropertyType|Bedrooms|
#      | |200000|500000|House|3|