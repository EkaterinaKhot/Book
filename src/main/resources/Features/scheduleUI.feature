Feature: User verification

 @wip
  Scenario: User should be able to see all schedules
   Given User should be able to log in to Bookit using the team member credentials.
   When User hover over to “schedule” it should be highlighted, and the drop-down list should be appeared: my and general
    When The user clicks to “my” and user should be able to see “schedule Raymond Reddington
   When The user clicks to “general” and user should be able to see “schedule light-side today"
