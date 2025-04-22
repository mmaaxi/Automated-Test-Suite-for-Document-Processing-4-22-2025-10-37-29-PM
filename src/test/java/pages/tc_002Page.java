import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_002Page {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "fileInput")
    private WebElement fileInput;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "previewName")
    private WebElement previewName;

    @FindBy(id = "previewSize")
    private WebElement previewSize;

    @FindBy(id = "previewType")
    private WebElement previewType;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(String filePath) {
        fileInput.sendKeys(filePath);
        uploadButton.click();
    }

    public boolean isFileUploaded() {
        return wait.until(ExpectedConditions.visibilityOf(previewName)).isDisplayed();
    }

    public String getFileName() {
        return previewName.getText();
    }

    public long getFileSize() {
        return Long.parseLong(previewSize.getText().replace(" MB", ""));
    }

    public String getFileType() {
        return previewType.getText();
    }
}