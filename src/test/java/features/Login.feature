Feature: Leaftaps Login

Scenario: Positive flow for Login
Given Open the Browser
And Max Browser
And set the timeouts
And Load the URL
#And Enter the username as DemoSalesManager
#And Enter the password as crmsfa
And Enter the username as DemoSalesManager
And Enter the password as crmsfa
When click on on the Login Button
Then verify Login successful

Scenario: Positive flow for Login
Given Open the Browser
And Max Browser
And set the timeouts
And Load the URL
And Enter the username as DemoCSR
And Enter the password as crmsfa
When click on on the Login Button
Then verify Login successful
