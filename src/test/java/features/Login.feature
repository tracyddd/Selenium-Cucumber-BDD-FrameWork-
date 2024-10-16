  #Author
  #Date
  #Description

  Feature: User login to the system
    Scenario Outline: Check login button to input valid credentials
      Given System shows Step <arg0> for <arg0_1> to show the login screen
      When System shows Step <arg1> for <arg1_1> to input user name
      And System show Step <arg2> for <arg2_1> to input password
      Then System shows Step <arg3> for <arg3_1> to login successfully with a successful message
      Examples:
        | arg0 | arg0_1    | arg1 | arg1_1  | arg2 | arg2_1 | arg3 | arg3_1  |
        | 11   | "'Given'" | 22   | "'When'" | 33   | "'And'"| 44   | "'Then'" |

    @new
    Scenario: new scenario one
      Given setup the entire in database
      When launch the browser
      And click on home button

