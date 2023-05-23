@Login
Feature: Login Feature

  Scenario Outline: User can successfully or failed do the Login process
    Given user is in login page
    When user fill the email field with <email> email
    And user fill the password field with <password> password
    And user click the Masuk button
    Then user can <result> login
    Examples:
    | case_id | email      | password      | result      |
    | WL01		| valid      | correct       | succesfully |
    | WL02		| empty      | correct       | failed		 	 |
    | WL03		|	valid      | empty         | failed      |
    | WL04		| invalid    | incorrect     | failed      |
