Feature: User Acceptance Test - Generate Line Item From BoQ

  Background: 
    Given Darwin web app launching
    When Login the application using valid credentials
    Then Selecting the a company and access role

  @UAT
  Scenario: User Flow-1 : Generate Line Item From BoQ
    When Open the Project Management Module
    And Open the BoQ module
    When Refesh the page to load the projects
    When Select the Wizard from sidebar
    And Click on Create and Import multiple BoQs
    When Choose multiple BoQs form the Computer and Import
    And Marked Assignment Mode against every GAEB Name and submit
    And Confirm the GAEB Import
    And Accept the Error and Continue
    And Again Marked Assignment Mode against every GAEB Name and submit
    When Go to the BoQ and back to "Project" from Quick Start
    And Select and Delete the BoQ
    And Save the changes
    Then Logout the Application
