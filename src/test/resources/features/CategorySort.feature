Feature:  Sorting Categories and Sub-Categories by Function

  Background:
    Given The user is on the first login page

  @wip
  Scenario: The user sorts Health and Beauty products
    When The user enters the personal username"batchyedi7@gmail.com"and password "BatchYedi.47"
    Then the user should be hover over  category Health and Beauty
    Then verify "Health & Beauty"  message should be displayed
    And The user sorts Health and Beauty products by Sortname "Default"
    And The user sorts Health and Beauty products by Sortname "Name (A - Z)"
    And The user sorts Health and Beauty products by Sortname "Name (Z - A)"
    And The user sorts Health and Beauty products by Sortname "Price (Low > High)"
    And The user sorts Health and Beauty products by Sortname "Price (High > Low)"
    And The user sorts Health and Beauty products by Sortname "Rating (Highest)"
    And The user sorts Health and Beauty products by Sortname "Rating (Lowest)"
    And The user sorts Health and Beauty products by Sortname "Model (A - Z)"
    And The user sorts Health and Beauty products by Sortname "Model (Z - A)"

  @wip
  Scenario: The user sorts Televisions products
    When The user enters the personal username"batchyedi7@gmail.com"and password "BatchYedi.47"
    Then the user should be hover over  category Television
    Then verify "Televisions"  message should be displayed
    And The user sorts Televisions products by Sortname "Default"
    And The user sorts Televisions products by Sortname "Name (A - Z)"
    And The user sorts Televisions products by Sortname "Name (Z - A)"
    And The user sorts Televisions products by Sortname "Price (Low > High)"
    And The user sorts Televisions products by Sortname "Price (High > Low)"
    And The user sorts Televisions products by Sortname "Rating (Highest)"
    And The user sorts Televisions products by Sortname "Rating (Lowest)"
    And The user sorts Televisions products by Sortname "Model (A - Z)"
    And The user sorts Televisions products by Sortname "Model (Z - A)"

  @wip
  Scenario: The user sorts TV Accessories products
    Then the user should be hover over  category TV Accessories
    Then verify "TV Accessories"  message should be displayed
    And The user sorts TV Accessories products by Sortname "Default"
    And The user sorts TV Accessories products by Sortname "Name (A - Z)"
    And The user sorts TV Accessories products by Sortname "Name (Z - A)"
    And The user sorts TV Accessories products by Sortname "Price (Low > High)"
    And The user sorts TV Accessories products by Sortname "Price (High > Low)"
    And The user sorts TV Accessories products by Sortname "Rating (Highest)"
    And The user sorts TV Accessories products by Sortname "Rating (Lowest)"
    And The user sorts TV Accessories products by Sortname "Model (A - Z)"
    And The user sorts TV Accessories products by Sortname "Model (Z - A)"

  @wip
  Scenario: The user sorts Networking products
    Then the user should be hover over  category Networking
    Then verify "Networking"  message should be displayed
    And The user sorts Networking products by Sortname "Default"
    And The user sorts Networking products by Sortname "Name (A - Z)"
    And The user sorts Networking products by Sortname "Name (Z - A)"
    And The user sorts Networking products by Sortname "Price (Low > High)"
    And The user sorts Networking products by Sortname "Price (High > Low)"
    And The user sorts Networking products by Sortname "Rating (Highest)"
    And The user sorts Networking products by Sortname "Rating (Lowest)"
    And The user sorts Networking products by Sortname "Model (A - Z)"
    And The user sorts Networking products by Sortname "Model (Z - A)"

  #verify message should be displayed