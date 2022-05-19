Feature: Email

Scenario: Successful Email with valid data
	Given user open browser
	When user open url "https://www.urbanladder.com/"
	And user enter "jion12345@gmail.com"
	Then click subscribe button
	And close the brower