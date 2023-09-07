

Feature: Application Login
  
   @webtest
  Scenario: Homepage default login
    Given user is on netbanking landing page
    When user login into application page with username and password
    Then homepage is populated
    And cards displayed are "true"
    
    @smoketest
    Scenario: Homepage default login
    Given user is on netbanking landing page
    When user login into application page with "john" and passwword "1234"
    Then homepage is populated
    And cards displayed are "false"
    
    @webtest
     Scenario: Homepage default login
    Given user is on netbanking landing page
    When user login into application page with "mary" and passwword "5678"
    Then homepage is populated
    And cards displayed are "false"
    
    @mobiletest
    Scenario: Homepage default login
    Given user is on netbanking landing page
    When user login into application page with following details
    |Thomas|7865|Hartford|Connecticut|USA|
    Then homepage is populated
    And cards displayed are "false"
    
   
 
