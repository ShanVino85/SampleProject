  Feature: Verify page title 
@Test1
Scenario: Validate page title
Given User is logged on to LMS Website
When User is on batch page
Then User should see page title with text "Manage Batch"
   