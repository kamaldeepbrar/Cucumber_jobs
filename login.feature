
@Login
Feature: Add a new User

Scenario Outline: Opening a alchemy jobs webpage using Selenium

Given User is on Alchmey jobs Login page
When  User enters "<Username>" and "<Password>"
Then  Locate the left hand menu and click the menu item that says "Users"
And   Fill in the necessary details
Then Verify the new user
And Close the browser

Examples:
    |Username |Password |
    |root | pa$$w0rd |   
    

@Jobs
Scenario Outline: Opening a alchemy jobs webpage using Selenium

Given User is on Alchmey jobs home page
Then  Find the keywords search input field
Then  Find the job details
And   Find the title of the job
Then  Apply for the job


@Post
Scenario Outline: Opening a alchemy jobs webpage and post a job

Given User is on Alchmey jobs home page for posting a job
Then  Click on post jobs
Then  Enter the "username22@gmail.com", "Automation Tester 01", "Pune", "This is test job", "username22@gmail.com", "IBM India Pvt. Ltd." details and click on the Preview button
And   Find the title of the job
Then  Apply for the job





