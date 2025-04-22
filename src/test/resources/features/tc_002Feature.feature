Feature: Validate file upload with valid format and preview

  Scenario: User uploads a file with a valid format and within size limit
    Given the user is on the file upload page
    When the user selects a valid file in PDF or DOCX format within the limit of 50 MB
    Then the file should be uploaded successfully
    And the preview should display the file name, size, and type