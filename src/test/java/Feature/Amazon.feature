Feature: feature to test amazon search functionality

# it is google search Functionality not amazon
@Test1 @Regression
Scenario: Validate search is working or not

  
  Given browser is open
  And user is on amazon search page
  When user enters texts in search box
  And hits enter 
  Then user is navigated to next desired page
  
  @Login  @Regression
  Scenario Outline: Validate login page
  Given User gives uname and password <username>and <password>
  And click on login button 
  Then user should face invalid credentials error

  Examples:
  | username | password |
  |magtab | admin123|
  
 