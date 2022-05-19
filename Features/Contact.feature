Feature: Contact

Scenario: Successfully test contact page function
	Given user chrome browser
	When user url  "https://www.urbanladder.com/" in browser
	And click contact option
	Then verify the contact page title
	And verify contact page the option 
	Then quit browser