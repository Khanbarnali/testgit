Feature: validated yahoo signup

Scenario Outline: validated yahoo signup

Given user visit yahoo home page
When user type "<full_name>" "<new_yahoo_mail>" and "<password>"
Then user should select dropdown month and type "<day>" and "<year>"

Examples: 
|full_name|new_yahoo_mail|password|day|year|
|aritri_khan|aritri_tazen|  |  |  |  |











