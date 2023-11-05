Feature: user types valid email and password for Fblogin

Scenario Outline: user types valid email and password for Fblogin


Given user visits Fb homepage
When user types "<email address>" and "<password>"
When user should click on Fblogin button
Then user should able be able to redirected to Fblogin

Examples:
|email address|password|
| aritri_tazeen@yahoo.com|ayaan31|