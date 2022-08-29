 Feature: LoginFeature
#   In order ti do internet banking
#   As a valid Para Bank Customer
#   I want to login successfully

   Scenario: Login Successfully
     Given I am in the login page of the Para Bank Application
     When I enter valid credentials
     Then I should be taken to the Overview page

