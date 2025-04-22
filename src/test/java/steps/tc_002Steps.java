import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;

public class tc_002Steps {
    private WebDriver driver;
    private tc_002Page uploadPage;

    public tc_002Steps() {
        this.driver = Hooks.getDriver();
        this.uploadPage = PageFactory.initElements(driver, tc_002Page.class);
    }

    @Given("the user is on the file upload page")
    public void the_user_is_on_the_file_upload_page() {
        uploadPage.navigateToUploadPage();
    }

    @When("the user selects a valid file in PDF or DOCX format within the limit of 50 MB")
    public void the_user_selects_a_valid_file() {
        uploadPage.uploadFile("path/to/validFile.pdf");
    }

    @Then("the file should be uploaded successfully")
    public void the_file_should_be_uploaded_successfully() {
        assertTrue(uploadPage.isFileUploaded());
    }

    @Then("the preview should display the file name, size, and type")
    public void the_preview_should_display_the_file_details() {
        assertEquals("validFile.pdf", uploadPage.getFileName());
        assertTrue(uploadPage.getFileSize() <= 50 * 1024);
        assertEquals("PDF", uploadPage.getFileType());
    }
}