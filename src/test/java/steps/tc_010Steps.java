package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("I have completed the document upload and processing")
    public void i_have_completed_the_document_upload_and_processing() {
        page.uploadDocuments();
        page.processDocuments();
    }

    @When("the system generates the 'Slip de salida'")
    public void the_system_generates_the_slip_de_salida() {
        page.generateSlipDeSalida();
    }

    @Then("the original documents and extracted data are saved in the request history")
    public void the_original_documents_and_extracted_data_are_saved_in_the_request_history() {
        Assert.assertTrue(page.isDocumentInHistory());
        Assert.assertTrue(page.isDataExtractedInHistory());
    }
}