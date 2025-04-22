Feature: Validate the generation of 'Slip de salida' and storage in history

  Scenario: Generate and store documents in request history
    Given I have completed the document upload and processing
    When the system generates the 'Slip de salida'
    Then the original documents and extracted data are saved in the request history