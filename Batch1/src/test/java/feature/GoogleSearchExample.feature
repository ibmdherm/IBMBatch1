Feature: Search in google
Scenario Outline: Enter text in google 
Given Google homepage
When search bar is visible
Then enter text "<userValue>"

Examples: 
| userValue |
| dharmesh |
| IBMERS |
| IBM |
| SDET |
