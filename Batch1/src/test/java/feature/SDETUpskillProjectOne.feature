Feature: Registration form for Upskills

Scenario: Add details of Student

  Given User should be on registration form
  When Registration form should be visible
  Then Signup new student
  And I add detail
| firstname | Dharmesh |
| lastname | Tripathi |
| Email | ewjferjn999@g.com |
| Username | ewjferjn999 |
| Pass | Test@123 |
| ConfirmPass | Test@123 |
| Phone | 1234567890 |
| Language | English |
| Code | Test@123 |
| Skype | Test@123 |
| LinkedInUrl | http://Test@123 |

  And I press "Sign in"
  Then I should see "Homepage"
 
  When Student edit form should be visible
  Then Edit detail of new student
  
  And I edit detail
| Language | English |
| Image | RoboClass |
| Skype | Test@123 |
| LinkedInUrl | http://Test@123 |

  And Press on  "Save setting"
  Then I shloud see edited details of student
 
  When Compose email form should be visible
  Then  Fill details of email

  And I compose email
| SendTo | ewjferjn999@g.com |
| Subject | Upskill Project |
| Message | I am a project One. |
| attachments | RoboClass |

  And Press on  "Send message"
  Then I shloud see message sent.
 
 
 
