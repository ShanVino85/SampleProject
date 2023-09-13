 @tag3
Feature: Add New Class

Background:Admin click +Add New Class button after reaching to Manage class page
Scenario:Validate  admin able to add new class passing past date 
Given Admin is in  class detail popup window
When Admin enter the value

Then class cannot be updated for the passed date and through error message.

