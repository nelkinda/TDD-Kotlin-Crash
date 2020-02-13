Feature: Calculator

  Scenario: Initial display is zero
    Given the calculator is reset
    Then the display shows "0."

  Scenario Template: Simple calculations
    Given the calculator is reset
    When entering "<input>"
    Then the display shows "<output>"
    Examples:
      | input | output |
      | 2+3=  | 5      |
      | 10-3= | 7      |
      | 3*4=  | 12     |
      | 12/3= | 4      |
