 Feature: Verify page selection
 @Test06
   Scenario: Entering Name of the Program
  Given User is in Program Details Page
  When Enter the program Name "PName"
  And Enter the program Description "PDesc"
  And Click the Active Radio Button  
  And Press Save Button
  Then Program will be added and message will be displayed