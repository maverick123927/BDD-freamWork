Feature: About page

Scenario: Successfully test about page
	Given user open chrome browser
	When user url  "https://www.urbanladder.com/"
	Then click about us 
	And verify the page title "Urban Ladder | About Us - Urban Ladder"
	Then close chrome browser