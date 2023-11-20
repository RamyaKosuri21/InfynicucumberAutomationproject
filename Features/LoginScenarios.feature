Feature:This feature runs for login page

@validlogin @logintest
Scenario:User should login successfully with valid data

Given User is in login page
When User enters email id "ramya.kosuri10@gmail.com"
And User enters password "Test@123"
And User clicks signin button
Then User should see All projects page

@invalidlogin @logintest
Scenario Outline:User should not login with Invalid data

Given User is in login page
When User enters email id "<Emailid>"
And User enters password "<Password>"
And User clicks signin button
Then User should not see All projects page

Examples:
|Emailid||Password|
|ramya.kos@gmail.com||Test@123|
|ramya.ko@gmail.com||Test@123|