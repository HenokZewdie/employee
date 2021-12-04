Feature: List of stories/BR

  Scenario Outline: just test the DB
    When the api is invoked
    Then an employee with "<id>" with "<salary>"
    And with "<first name>" with "<last name>"
    And "<age>" years old
    And employee "<name>"
    And returned value is "<is saved>"

    Examples:
      | id | salary | first name | last name | status Code | age |
      | 1  | 320800 | Tiger      | Nixon     | 200         | 61  |
      | 2  | 170750 | Garrett    | Winters   | 200         | 63  |
      | 3  | 86000  | Ashton     | Cox       | 200         | 66  |