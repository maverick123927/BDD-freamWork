Feature: Search

Scenario Outline: Successful search with valid data
	Given user lanch chrome browser
	When user open url  "https://www.urbanladder.com/"
	And user enter <word> in the search box
	Then click the surch button
	And close browser
	
	Examples:
	|word|
	|table|
	|chair|
	|study table|
	|office chair|
	|sofa chair|
	|coffee table|
	|table wood|
	|table woodbase|
	|tableware|
	|bedroom|
	
	