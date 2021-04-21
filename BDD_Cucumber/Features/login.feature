

Feature: login for facebook



  Scenario Outline: login with valid id & password
    Given user open chrome browser
    And user open url "https:www.facebook.com"
    And user enters name as "<username>" and password as "<password>"
    And user click on login
    Then user close the browser
    
    Examples: 
    |username| |password|
    |ddddddd|   |fffffff|
    |fffffff|   |ggggggg|
  
    
