Feature: New Merchant Registration By Admin

Scenario: Invalid First Name
Given Merchant is on 'merchant' Page 
When Merchant Enters Invalid First Name
Then display 'Please Enter Valid First Name'

Scenario: Invalid Last Name
Given Merchant is on 'merchant' Page 
When Merchant Enters Invalid Last Name
Then display 'Please Enter Valid Last Name'

Scenario: Invalid Company Name
Given Merchant is on 'merchant' Page 
When Merchant Enters Invalid Company Name
Then display 'Please Enter Valid Company Name'

Scenario: Invalid Mobile Number
Given Merchant is on 'merchant' Page 
When Merchant Enters Invalid Mobile Number
Then display 'Please Enter Valid Mobile Number'

Scenario: Invalid EmailID
Given Merchant is on 'merchant' Page 
When Merchant Enters Invalid EmailID 
Then display 'Please Enter Valid EmailID'

Scenario: Invalid Password
Given Merchant is on 'merchant' page
When Merchant Enters Invalid Password
Then display 'Please Enter Valid Password'

Scenario: Invalid Photo Upload
Given Merchant is on 'merchant' page
When Merchant Upload Invalid Photo
Then display 'Please Upload Valid Photo'

Scenario: Valid Details
Given Merchant is on 'merchant' Page
When Merchant clicks on Create Account
Then display 'success' Page




